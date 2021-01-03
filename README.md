# dentamed-cashflow-odata
Spring-boot OData service

# Getting Started
`docker run --name cashflow-mysql -e MYSQL_ROOT_PASSWORD=MYSQL_ROOT_PASSWORD -e MYSQL_DATABASE=cashflow -e MYSQL_USER=MYSQL_USER -e MYSQL_PASSWORD=MYSQL_PASSWORD -p 3306:3306 -d mysql:latest`

Requires environment variables:
* MYSQL_ROOT_PASSWORD
* MYSQL_USER
* MYSQL_PASSWORD

## Build image
`mvn spring-boot:build-image -Dspring-boot.build-image.imageName=cashflow-odata-image`
