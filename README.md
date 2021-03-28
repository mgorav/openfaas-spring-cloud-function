# OpenFaas Template for Spring Cloud function

This is an OpenFaas template, which provides following environments:

- spring clud function
- webflux
- jdk 11

Write your business logic in function, i.e. just provide implementation of RequestHandler. By DI, the implementation
relayed to the function from REST class.

Hence, just code, function - RequestHandler, DO NOT worry about the docker,k8s etc.

> GM