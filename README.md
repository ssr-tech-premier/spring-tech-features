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

Demo Application |Test url
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

## Snapshots of Demo Applications

1. spring-service-registry successfully started http://localhost:8761/
	- Initial page of spring-service-registry
	![service-registry-initial-startup](https://user-images.githubusercontent.com/33663711/34145253-27c4f5f8-e4bb-11e7-9601-e18ba38d851c.PNG)

2. spring-config-server successfully started
	- Accessing customer-service dev properties http://localhost:8888/customer-service/dev
	![config-server-address-service-default](https://user-images.githubusercontent.com/33663711/34145257-28c28c68-e4bb-11e7-9884-5b0b5ed9508b.PNG)
	
	- Accessing address-service default properties
	![config-server-customer-service-dev](https://user-images.githubusercontent.com/33663711/34145258-28fce778-e4bb-11e7-93eb-fa6bebf302df.PNG)

	
3. spring-service-registry  clients successfully restistered http://localhost:8761/
	- After customer-service & address-service restistered
	![service-registry-after-client-registrations](https://user-images.githubusercontent.com/33663711/34145251-278926e0-e4bb-11e7-9cca-c80a937a6e2f.PNG)


4. customer-service successfully started
	- Access http://localhost:9100/greeting api
	![customer-service-greeting](https://user-images.githubusercontent.com/33663711/34145249-26dc68d8-e4bb-11e7-80e8-8e122e08857e.PNG)
	
	- Access http://localhost:9100/config/prop?propName=default.customer.names api
	![customer-service-propname-value](https://user-images.githubusercontent.com/33663711/34145250-274e3c4c-e4bb-11e7-982f-ebe37353405a.PNG)

5. address-service successfully started
	- Access http://localhost:9200/greeting api
	![address-service-greeting](https://user-images.githubusercontent.com/33663711/34145255-284316e0-e4bb-11e7-9173-eee7f80351e5.PNG)

	- Access http://localhost:9200/customerAddress api
	![address-service-customer-address](https://user-images.githubusercontent.com/33663711/34145254-280332b4-e4bb-11e7-9f4e-b0cc57b1566c.PNG)


