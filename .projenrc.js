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
      name: 'Install pyenv',
      run: 'pip install pipenv'
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

project.buildTask._locked = false
project.buildTask.reset('lerna run build');
project.buildTask._locked = true

// no package task is needed
project.packageTask.reset();

project.addScripts({
  install: 'lerna run install'
});

project.tasks.removeTask('test');
project.tasks.removeTask('test:update');

project.synth();