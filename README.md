## mimimimicro is a sample dockerized microservice project.

------

### Dependencies:
````
- jdk 11
- maven 3.6.3
- docker 
- also keyboard and maybe mouse 
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
1. `chmod a+x ./docker-build.sh`
2. `./docker-build.sh`
3. `docker compose up`

----------
#### Get greetings from Service-A:
`curl http://localhost/api/service-a/hey`

#### Get greetings from Service-B:
`curl http://localhost/api/service-a/hey`
