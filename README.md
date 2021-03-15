## mimimimicro is a sample microservice template project.

------

### dependencies:
````
- jdk 11
- maven 3.6.3
- docker 
- also keyboard and maybe mouse 
````

------
### run all instances:
1. `chmod a+x ./docker-build.sh`
2. `docker compose up`

----------
#### Get greetings from Service-A:
`curl http://localhost/api/service-a/hey`

#### Get greetings from Service-B:
`curl http://localhost/api/service-a/hey`
