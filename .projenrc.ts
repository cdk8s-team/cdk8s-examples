import * as fs from 'fs';
import * as path from 'path';
import { Cdk8sTeamTypeScriptProject } from '@cdk8s/projen-common';
// eslint-disable-next-line import/no-extraneous-dependencies
import { globSync } from 'glob';
// eslint-disable-next-line import/no-extraneous-dependencies
import { renderString } from 'nunjucks';
import { TextFile } from 'projen';

type Lang = 'go' | 'python' | 'java';

const project = new Cdk8sTeamTypeScriptProject({
  defaultReleaseBranch: 'main',
  name: 'root',
  devDeps: [
    '@cdk8s/projen-common',
    '@aws-cdk/lambda-layer-kubectl-v25',
    '@types/nunjucks',
    'lerna',
    'cdk8s',
    'constructs',
    'cdk8s-plus-26',
    'cdk8s-plus-25',
    'cdk8s-cli',
    'aws-cdk-lib',
    'aws-cdk',
    'nunjucks',
    'glob',
  ],
  sampleCode: false,
  projenrcTs: true,
  release: false,
  jest: false,
  workflowBootstrapSteps: [
    {
      uses: 'actions/setup-python@v4',
      with: {
        'python-version': '3.10.4',
      },
    },
    {
      name: 'Install pipenv',
      run: 'pip install pipenv',
    },
    {
      uses: 'actions/setup-java@v3',
      with: {
        'distribution': 'adopt',
        'java-version': '19.0.2',
      },
    },
    {
      name: 'Install Maven',
      uses: 'stCarolas/setup-maven@v4.5',
      with: {
        'maven-version': '3.9.1',
      },
    },
  ],
});

project.package.addField('private', true);
project.package.addField('workspaces', {
  packages: [
    'typescript/**/*',
    'go/**/*',
    'python/**/*',
    'java/**/*',
  ],
});

project.testTask.reset();

(project.buildTask as any)._locked = false;
project.buildTask.reset('lerna run build --skip-nx-cache --no-bail');
(project.buildTask as any)._locked = true;

// no package task is needed
project.packageTask.reset();

project.gitignore.exclude('.vscode');

project.tasks.removeTask('test');
project.tasks.removeTask('test:update');
// next version requires node >= 18
project.package.addField('resolutions', {
  '@yarnpkg/parsers': '3.0.0-rc.48.1',
});

renderManifests();

project.synth();

function manifestTemplate(lang: Lang) {
  switch (lang) {
    case 'go':
      return 'go.mod.template';
    case 'java':
      return 'pom.xml.template';
    case 'python':
      return 'Pipfile.template';
  }
}

function findManifestTemplates(lang: Lang) {

  return globSync(`**/${manifestTemplate(lang)}`, { cwd: path.join(__dirname, lang), nodir: true })
    .map(f => path.join(__dirname, lang, f));
}

function renderManifests() {

  // eslint-disable-next-line @typescript-eslint/no-require-imports
  const manifest = require('./package.json');

  const context = {
    cdk8sVersion: manifest.devDependencies.cdk8s.slice(1),
    constructsVersion: manifest.devDependencies.constructs.slice(1),
    cdk8sPlus26Version: manifest.devDependencies['cdk8s-plus-26'].slice(1),
    cdk8sPlus25Version: manifest.devDependencies['cdk8s-plus-25'].slice(1),
    awsCdkLibVersion: manifest.devDependencies['aws-cdk-lib'].slice(1),
  };

  const files: string[] = [
    ...findManifestTemplates('go'),
    ...findManifestTemplates('java'),
    ...findManifestTemplates('python'),
  ];

  for (const f of files) {
    const current = fs.readFileSync(f, { encoding: 'utf-8' });
    const rendered = renderString(current, context );
    const relative = path.relative(__dirname, f).replace('.template', '');
    new TextFile(project, relative, {
      lines: rendered.split('\n'),
      readonly: false,
    });
  }

}
