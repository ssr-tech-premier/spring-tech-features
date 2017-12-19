/**
 * 
 */
package org.ssr.tech.premier.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author SandeepRaju
 *
 */
@EnableZuulProxy
@EnableDiscoveryClient
@SpringBootApplication
public class SpringZuulApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		  SpringApplication.run(SpringZuulApplication.class, args);
	}

}
