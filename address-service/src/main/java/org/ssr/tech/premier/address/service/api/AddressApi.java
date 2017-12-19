/**
 * 
 */
package org.ssr.tech.premier.address.service.api;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.ssr.tech.premier.address.service.client.CustomerServiceClient;

/**
 * @author SandeepRaju
 *
 */
@RestController
public class AddressApi {
	
	@Autowired
	CustomerServiceClient customerServiceClient;
	
	@RequestMapping("/greeting")
    public String greeting() {
		return "Hello You had sucessfully called :: AddressApi";
	}
	
	@RequestMapping("/customerAddress")
	public Map<String, Object> getCustomerAddress() {
		String names = customerServiceClient.getCustomers("default.customer.names");
		
		if(StringUtils.hasText(names)) {
			Map<String, Object> cusAddress = new HashMap<String, Object>();
			for(String name:names.split(",")) {
				cusAddress.put(name, new String[]{"31 WEAVER", "MIRROR Graphics INC", "TEXAS", "USA"});
			}
			
			return cusAddress;
		}
		
		return null;
	}
	
}
