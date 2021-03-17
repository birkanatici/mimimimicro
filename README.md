# mimimimicro
mimimimicro is a sample dockerized microservice project.

## 🔨 Dependencies
```
- jdk 11
- maven 3.6.3
- docker deamon
```

## 📦 Modules (mimimi microphones)
1. api-gateway-service (aka. proxy service also CircuitBreaker  - `spring.cloud.gateway & Hystrix`)
2. config-service (contains all module configs - `spring.cloud.config.server` )
3. registry-service (Registration and Discovery service - `Netflix Eureka`)
4. service-a (Greeting micro service - `Spring Boot App`)
5. service-b (Greeting micro service - `Spring Boot App`)

## 🚀 Run all instances
 1. `chmod a+x *.sh`
 2. `./run.sh`

## 🔍 Services Access Point
- ##### Base API Endpoint : `http://localhost/api/`
- ##### Eureka Service : `http://localhost:8081/`
- ##### Zipkin Service : `http://localhost:9411/zipkin/`

## 🎉 Samples
##### Get greeting from Service-A:
- `curl http://localhost/api/service-a/hey`

##### Get greeting from Service-B:
- `curl http://localhost/api/service-a/hey`

## ✅ License
[MIT](https://choosealicense.com/licenses/mit/)