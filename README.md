## mimimimicro is a sample dockerized microservice template project.

------

### Dependencies:
````
- jdk 11
- maven 3.6.3
- docker 
````
------
### Modules (mimimi microphones):
1. api-gateway-service (aka. proxy service also CircuitBreaker  - `spring.cloud.gateway & Hystrix`)
2. config-service (contains all module configs - `spring.cloud.config.server` )
3. registry-service (Registration and Discovery service - `Netflix Eureka`)
4. service-a (Greeting micro service - `Spring Boot App`)
5. service-b (Greeting micro service - `Spring Boot App`)

------
### Run all instances:
1. `chmod a+x *.sh`
2. `./run.sh`

----------
#### Get greetings from Service-A:
`curl http://localhost/api/service-a/hey`

#### Get greetings from Service-B:
`curl http://localhost/api/service-a/hey`
