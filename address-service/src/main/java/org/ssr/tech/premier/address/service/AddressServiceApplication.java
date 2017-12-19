/**
 * 
 */
package org.ssr.tech.premier.address.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @author SandeepRaju
 *
 */
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class AddressServiceApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
        SpringApplication.run(AddressServiceApplication.class, args);
	}

}
