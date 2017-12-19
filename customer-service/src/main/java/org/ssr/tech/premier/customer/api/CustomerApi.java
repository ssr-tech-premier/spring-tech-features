/**
 * 
 */
package org.ssr.tech.premier.customer.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.discovery.EurekaClient;

/**
 * @author SandeepRaju
 *
 */
@RestController
public class CustomerApi {
	
	@Autowired
    private EurekaClient eurekaClient;
	
	@Autowired
	Environment env;
	
	@RequestMapping("/greeting")
    public String greeting() {
		return "Hello You had sucessfully called :: CustomerApi";
	}
	
	@RequestMapping("/appurl")
    public String getAppUrl(@RequestParam String  appName) {
		return String.format("Hello from '%s'!", eurekaClient.getApplication(appName).getInstances().get(0).getHomePageUrl());
	}
	
	@RequestMapping("/config/prop")
    public String getConfigProperties(@RequestParam String  propName) {
		return String.format(" Prop [%s] value is  '%s'!", propName, env.getProperty(propName));
	}
	
}
