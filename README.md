# Getting Started
docker run --name cashflow-mysql -e MYSQL_ROOT_PASSWORD=root_pass -e MYSQL_DATABASE=cashflow -e MYSQL_USER=user -e MYSQL_PASSWORD=password -p 3306:3306 -d mysql:latest

## Build image
mvn spring-boot:build-image -Dspring-boot.build-image.imageName=cashflow-odata-image