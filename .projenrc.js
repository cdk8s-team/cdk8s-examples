const { Cdk8sTeamNodeProject } = require('@cdk8s/projen-common');
const project = new Cdk8sTeamNodeProject({
  defaultReleaseBranch: 'main',
  name: 'root',
  devDeps: ['@cdk8s/projen-common'],
  release: false,
});

project.package.addField('private', true);

project.synth();