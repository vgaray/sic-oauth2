package pe.com.tintegro.sic.oauth2.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "pe.com.tintegro.sic.oauth2.config")
public class AppConfig extends WebMvcConfigurerAdapter
{
	@Override
	public void addCorsMappings(CorsRegistry registry)
	{
		registry.addMapping("/**").
		allowedOrigins("*").
		allowedMethods("POST", "GET","HEAD", "PUT", "OPTIONS", "DELETE").
		allowedHeaders("X-Auth-Token",
				"x-xsrf-token",
				"Content-Type",
				"Access-Control-Allow-Headers", 
				"X-Requested-With", 
				"Authorization", 
				"Origin", 
				"Accept", 
				"Access-Control-Request-Method",
				"Access-Control-Request-Headers",
				"Access-Control-Allow-Origin").
		exposedHeaders("custom-header1", "custom-header2").
		allowCredentials(false).maxAge(3600);
	}
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry)
	{
		registry.addResourceHandler( "swagger-ui.html" ).addResourceLocations( "classpath:/META-INF/resources/" );

		registry.addResourceHandler( "/webjars/**" ).addResourceLocations( "classpath:/META-INF/resources/webjars/" );

		registry.addResourceHandler( "/resources/**" ).addResourceLocations( "classpath:/resources/**" );
	}
	
	@Override
	public void addViewControllers(ViewControllerRegistry registry)
	{
		registry.addRedirectViewController( "/", "/swagger-ui.html" );
	}
}
