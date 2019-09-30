package pe.com.tintegro.sic.oauth2.config;


import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.util.Log4jConfigListener;

@SuppressWarnings("deprecation")
public class DispatcherServletInitializer implements WebApplicationInitializer
{
	
	@Override
	public void onStartup(ServletContext arg0) throws ServletException
	{
		// TODO Auto-generated method stub
		AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext( );
		context.register(AppConfig.class);
		context.setServletContext(arg0);
      
		arg0.addListener( new ContextLoaderListener( context ) );
      arg0.addListener(new Log4jConfigListener()); 
		arg0.setInitParameter("log4jConfigLocation", "classpath:log/sic-oauth.properties");
		arg0.setInitParameter("log4jExposeWebAppRoot", "false");
		
		ServletRegistration.Dynamic dispatcher = arg0.addServlet( "dispatcher", new DispatcherServlet( context ) );
		dispatcher.setLoadOnStartup( 1 );
		dispatcher.addMapping( "/" );
	}
}
