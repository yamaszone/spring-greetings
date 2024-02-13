# Spring Boot Microservice Demo

## Prerequisites
- [Docker Engine](https://docs.docker.com/engine/install/)
- [`kubectl` CLI](https://kubernetes.io/docs/tasks/tools/)
- Local Kubernetes cluster
  - [Docker Desktop Kubernetes](https://docs.docker.com/desktop/kubernetes/)
  - [Minikube](https://minikube.sigs.k8s.io/docs/start/)
- [`kubetpl` CLI](https://github.com/shyiko/kubetpl?tab=readme-ov-file#installation)
- [`tilt` CLI](https://docs.tilt.dev/install)

## Develop
- Startup local Kubernetes cluster following docs in the [**Prerequisites**]((#prerequisites))
- `./stack dev up` # Launch app with hot-reloading
  - `tilt -h` # See other `tilt` commands
- Test
  - Request
    ```
    curl -s http://localhost:8080/greetings?name=foo
    ```
  - Response
    ```
    {"message":"Hello, foo!"}
    ```

## Deploy
See `./stack -h`
