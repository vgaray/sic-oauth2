package pe.com.tintegro.sic.oauth2.dao;



import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import pe.com.tintegro.sic.oauth2.config.ApplicationContextDaoConfig;
import pe.com.tintegro.sic.oauth2.dao.impl.OAuthClientDAOImpl;
import pe.com.tintegro.sic.oauth2.dominio.OAuthClientDetails;
import pe.com.tintegro.sic.oauth2.utils.Constants;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(loader=AnnotationConfigContextLoader.class, classes={ ApplicationContextDaoConfig.class, OAuthClientDAOImpl.class })
public class OAuthClientDAOTest
{
	@Autowired
	private OAuthClientDAO oAuthClientDAO;
	
	//@Test
	public void loadClientByIdTest()
	{
		String clientID = "sic-frontend";
		OAuthClientDetails ocd=new OAuthClientDetails();
		
		try
		{	
			
			ocd=oAuthClientDAO.loadClientById( clientID ) ;
			System.out.println(ocd.getNoAuthorities()+"  "+ ocd.getNoClientID()+"  "+ocd.getNoWebServerRedirectURI());
			
			
			
			Assert.assertNotNull( oAuthClientDAO.loadClientById( clientID ) );
			
			
		}
		catch ( Exception e )
		{
			e.printStackTrace();
		}
	}
	
	//@Test
	public void isClientAvailableTest()
	{
		String clientID = "sic";
		
		try
		{
			Assert.assertEquals( Constants.EXISTS_CLIENT, oAuthClientDAO.isClientAvailable( clientID ).getIdAnswer() );
		}
		catch ( Exception e )
		{
			e.printStackTrace();
		}
	}
	
	@Test
	public void existeCliente(){
		
		OAuthClientDetails sce=new OAuthClientDetails();
		
		
			sce=oAuthClientDAO.isClientAvailable("sic-frontend", "1234567890987654321");
			
			if(sce!=null){
				System.out.println(sce.getNoAuthorizedGrantTypes()+"  "+ sce.getNoAccessTokenValidity());
			}
			else {
				System.out.println("No hay datos");
			}
		
		
		
		//Assert.assertNotNull(sce);
	}
}
