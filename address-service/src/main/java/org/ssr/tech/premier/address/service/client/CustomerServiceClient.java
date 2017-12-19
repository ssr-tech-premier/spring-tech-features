/**
 * 
 */
package org.ssr.tech.premier.address.service.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author SandeepRaju
 *
 */
@FeignClient("customer-service")
public interface CustomerServiceClient {
	
	@RequestMapping(method = RequestMethod.GET, value = "/config/prop")
    String getCustomers(@RequestParam("propName") String propName);
	
}
