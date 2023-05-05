const { Cdk8sTeamNodeProject } = require('@cdk8s/projen-common');
const project = new Cdk8sTeamNodeProject({
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

const deps = project.addTask('deps');
deps.exec('lerna run install --scope "@typescript/*"')
deps.exec('lerna run install --scope "@python/*"')
deps.exec('lerna run install --scope "@go/*"')
deps.exec('lerna run install --scope "@java/*" --concurrency 1')

project.buildTask._locked = false
project.buildTask.reset();
project.buildTask.exec('lerna run build --scope "@typescript/*"')
project.buildTask.exec('lerna run build --scope "@python/*"')
project.buildTask.exec('lerna run build --scope "@go/*"')
project.buildTask.exec('lerna run build --scope "@java/*" --concurrency 1')
project.buildTask._locked = true

// no package task is needed
project.packageTask.reset();

project.addScripts({
  install: `npx projen ${deps.name}`
});

project.gitignore.exclude('.vscode')

project.tasks.removeTask('test');
project.tasks.removeTask('test:update');

project.synth();