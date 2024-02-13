docker_build('hello-spring', '.', dockerfile='Dockerfile')
k8s_yaml(local('kubetpl render deployments/app.yaml -i deployments/config-local.env -s IMAGE_TAG=latest'))
k8s_resource('greetings', port_forwards="8080:8080")
