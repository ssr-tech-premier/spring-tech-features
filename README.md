## spring-tech-features

Demo application are developed using Spring Boot.

## Demo Application

The following features are demonstrated.

Feature | Demo Application
--- |---
Service Registration | spring-service-registry
Centralized Configuration | spring-config-server
Service Discovery | customer-service
Service Discovery | address-service


## Demo Application - Test URLs

Feature |Test url
--- |---
spring-service-registry | http://localhost:8761/
spring-config-server | http://localhost:8888/customer-service/dev
spring-config-server | http://localhost:8888/address-service/default
customer-service | http://localhost:9100/greeting
customer-service | http://localhost:9100/config/prop?propName=default.customer.names
address-service | http://localhost:9200/greeting
address-service | http://localhost:9200/customerAddress

## Build and Run the Demo Application 

1. Download all the applications to your local machine. 
    - Assume applications are downloaded to (D:/spring-tech-features)
	
2. Navitage to the folder where the applications are downloaded
	- Open command prompt and navigate to folder ( cd D:/spring-tech-features)
	
3. Execute the following Maven command (mvn clean install) to build the each application
	- D:/spring-tech-features/spring-service-registry> mvn clean install
	- D:/spring-tech-features/spring-config-server> mvn clean install
	- D:/spring-tech-features/customer-service> mvn clean install
	- D:/spring-tech-features/address-service> mvn clean install
	
4. Run the application in the same order listed below. Since all the applications are developed using spring boot, it has embedded tomcat to run the applications.
	- D:/spring-tech-features/spring-service-registry> spring-boot:run
	- D:/spring-tech-features/spring-config-server> spring-boot:run
	- D:/spring-tech-features/customer-service> spring-boot:run -Dspring.profiles.active=dev
	- D:/spring-tech-features/address-service> spring-boot:run

5. Access the Test URLs listed above 