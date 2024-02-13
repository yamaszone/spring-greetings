docker_build('hello-spring', '.', dockerfile='Dockerfile')
k8s_yaml('deployments/app.yaml')
k8s_resource('greetings', port_forwards="8080:8080")
