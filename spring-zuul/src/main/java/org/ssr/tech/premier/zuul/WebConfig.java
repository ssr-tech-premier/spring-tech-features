/**
 * 
 */
package org.ssr.tech.premier.zuul;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author SandeepRaju
 *
 */
@Configuration
@EnableWebMvc
public class WebConfig  extends WebMvcConfigurerAdapter {
	
	@Override
    public void addViewControllers(final ViewControllerRegistry registry) {
        super.addViewControllers(registry);
        registry.addViewController("/").setViewName("forward:/index");
        registry.addViewController("/index");
        registry.addViewController("/login");
    }
	
}
