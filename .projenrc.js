const { Cdk8sTeamNodeProject } = require('@cdk8s/projen-common');
const project = new Cdk8sTeamNodeProject({
  defaultReleaseBranch: 'main',
  name: 'root',
  devDeps: [
    '@cdk8s/projen-common',
    'lerna',
  ],
  release: false,
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

project.tasks.removeTask('test');
project.tasks.removeTask('test:update');

project.synth();