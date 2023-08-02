# Spring Boot Microservice Demo

## Prerequisites
- [Docker Engine](https://docs.docker.com/engine/install/)
- [`kubectl` CLI](https://kubernetes.io/docs/tasks/tools/)
- Local Kubernetes cluster
  - [Docker Desktop Kubernetes](https://docs.docker.com/desktop/kubernetes/)
  - [Minikube](https://minikube.sigs.k8s.io/docs/start/)
- [`odo` CLI](https://odo.dev/docs/overview/installation)

## Develop
- Startup local Kubernetes cluster following docs in the [**Prerequisites**]((#prerequisites))
- `odo dev` # Launch app with hot-reloading
  - `odo logs --follow` # See logs
  - `odo --help` # See other commands
- Test
  - Request: `curl -s http://localhost:20001/greetings?name=foo`
  - Response: `{"message":"Hello, foo!"}`

## Deploy
See `./stack --help`
