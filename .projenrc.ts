import { Cdk8sTeamNodeProject } from '@cdk8s/projen-common';
import { typescript } from 'projen';

const project = new Cdk8sTeamNodeProject({
  projenrcJs: false,
  defaultReleaseBranch: 'main',
  name: 'root',
  devDeps: [
    '@cdk8s/projen-common',
    'lerna',
  ],
  release: false,
  jest: false,
  workflowBootstrapSteps: [
    {
      uses: 'actions/setup-python@v4',
      with: {
        'python-version': '3.10.4'
      },
    },
    {
      name: 'Install pipenv',
      run: 'pip install pipenv'
    },
    {
      uses: 'actions/setup-java@v3',
      with: {
        'distribution': 'adopt',
        'java-version': '19.0.2'
      }
    },
    {
      name: 'Install Maven',
      uses: 'stCarolas/setup-maven@v4.5',
      with: {
        'maven-version': '3.9.1',
      }
    }
  ],
});

new typescript.ProjenrcTs(project);

project.package.addField('private', true);
project.package.addField('workspaces', {
  packages: [
    'typescript/**/*',
    'go/**/*',
    'python/**/*',
    'java/**/*',
  ]
});

project.testTask.reset();

 //@ts-ignore
project.buildTask._locked = false;
project.buildTask.reset('lerna run build --skip-nx-cache --no-bail');
 //@ts-ignore
project.buildTask._locked = true

// no package task is needed
project.packageTask.reset();

project.gitignore.exclude('.vscode')

project.tasks.removeTask('test');
project.tasks.removeTask('test:update');
// next version requires node >= 18
project.package.addField('resolutions', {
  '@yarnpkg/parsers': '3.0.0-rc.48.1',
});

project.synth();
