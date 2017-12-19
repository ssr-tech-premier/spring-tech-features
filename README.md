## spring-tech-features

Demo application are developed using **Spring Boot**.

## Demo Application

The following features are demonstrated.

Feature | Demo Application
--- |---
Service Registration | spring-service-registry
Centralized Configuration | spring-config-server
Service Discovery | customer-service
Service Discovery | address-service
Routing and Filtering | spring-zuul


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
spring-zuul	| http://localhost:9300/customer/greeting
spring-zuul	| http://localhost:9300/customer/config/prop?propName=default.customer.names
spring-zuul	| http://localhost:9300/address/greeting
spring-zuul	| http://localhost:9300/address/customerAddress

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
	- D:/spring-tech-features/spring-zuul> mvn clean install
	
4. Run the application in the same order listed below. Since all the applications are developed using spring boot, it has embedded tomcat to run the applications.
	- D:/spring-tech-features/spring-service-registry> spring-boot:run
	- D:/spring-tech-features/spring-config-server> spring-boot:run
	- D:/spring-tech-features/customer-service> spring-boot:run -Dspring.profiles.active=dev
	- D:/spring-tech-features/address-service> spring-boot:run
	- D:/spring-tech-features/spring-zuul> spring-boot:run

5. Access the **Test URLs** listed above 

## Snapshots of Demo Applications

1. **spring-service-registry** successfully started http://localhost:8761/
	- Initial page of spring-service-registry
	![service-registry-initial-startup](https://user-images.githubusercontent.com/33663711/34145253-27c4f5f8-e4bb-11e7-9601-e18ba38d851c.PNG)

2. **spring-config-server** successfully started
	- Accessing customer-service dev properties http://localhost:8888/customer-service/dev
	![config-server-customer-service-dev](https://user-images.githubusercontent.com/33663711/34145258-28fce778-e4bb-11e7-93eb-fa6bebf302df.PNG)
		
	- Accessing address-service default properties
	![config-server-address-service-default](https://user-images.githubusercontent.com/33663711/34145257-28c28c68-e4bb-11e7-9884-5b0b5ed9508b.PNG)
	
3. **spring-service-registry**  clients successfully restistered http://localhost:8761/
	- After customer-service & address-service restistered
	![service-registry-after-client-registrations](https://user-images.githubusercontent.com/33663711/34145251-278926e0-e4bb-11e7-9cca-c80a937a6e2f.PNG)

4. **customer-service** successfully started
	- Access http://localhost:9100/greeting
	![customer-service-greeting](https://user-images.githubusercontent.com/33663711/34146042-7e19d7ea-e4be-11e7-9dc2-ca42c7ff18c5.PNG)
	- Access http://localhost:9100/config/prop?propName=default.customer.names 
	![customer-service-propname-value](https://user-images.githubusercontent.com/33663711/34145250-274e3c4c-e4bb-11e7-982f-ebe37353405a.PNG)

5. **address-service** successfully started
	- Access http://localhost:9200/greeting
	![address-service-greeting](https://user-images.githubusercontent.com/33663711/34146043-7e808cd8-e4be-11e7-9c05-829ae13e226e.PNG)
	- Access http://localhost:9200/customerAddress 
	![address-service-customer-address](https://user-images.githubusercontent.com/33663711/34145254-280332b4-e4bb-11e7-9f4e-b0cc57b1566c.PNG)
	
6. **spring-zuul** successfully started
	- Access Customer greeting http://localhost:9300/customer/greeting
	![spring-zuul-customer-greeting](https://user-images.githubusercontent.com/33663711/34156033-810816b0-e4e1-11e7-9190-3546ded2ff31.PNG)
	- Access Customer names  http://localhost:9300/customer/config/prop?propName=default.customer.names
	![spring-zuul-customer-names](https://user-images.githubusercontent.com/33663711/34156035-814a6e48-e4e1-11e7-9d86-363bec07e92c.PNG)
	- Access Address greeting  http://localhost:9300/address/greeting
	![spring-zuul-address-greeting](https://user-images.githubusercontent.com/33663711/34156032-80c93300-e4e1-11e7-8a94-649a2da19d5e.PNG)
	- Access Address of Customer http://localhost:9300/address/customerAddress
	![spring-zuul-address-customer](https://user-images.githubusercontent.com/33663711/34156031-808af43c-e4e1-11e7-8ad4-6af688d351dc.PNG)
	

