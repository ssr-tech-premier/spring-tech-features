/**
 * 
 */
package org.ssr.tech.premier.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author SandeepRaju
 *
 */
@EnableDiscoveryClient
@SpringBootApplication
public class CustomerServiceApplication {
	
	public static void main(String[] args) {
        SpringApplication.run(CustomerServiceApplication.class, args);
    }
	
}
