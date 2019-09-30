package pe.com.tintegro.sic.oauth2.service;







import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;







import pe.com.tintegro.sic.oauth2.config.ApplicationContextDaoConfig;
import pe.com.tintegro.sic.oauth2.dto.request.CheckTokenRequest;
import pe.com.tintegro.sic.oauth2.dto.response.CheckTokenResponse;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { ApplicationContextDaoConfig.class })
public class CheckTokenServiceTest
{
	@Autowired
	CheckTokenService checkTokenServicess;
	
	@Test
   public void testCheckTokenTest(){
   	CheckTokenRequest request=new CheckTokenRequest();
   	request.setClientId("sic-frontend");
   	request.setToken("0c4ec137-8149-4934-a6bd-8ad5507d009f");
   	
   	try
		{
			CheckTokenResponse response=new CheckTokenResponse();
			response=checkTokenServicess.obtenerCheckTokenService(request);
			
			System.out.println(response.getAud()+" ");
			System.out.println(response.getClientId()+" ");
			System.out.println(response.getUsername()+" ");
			System.out.println(response.getAuthorities().get(0)+" ");
			System.out.println(response.getScope().get(0)+" "+response.getScope().get(1)+" ");
			System.out.println(response.getExpiration());
			System.out.println(response.getMensaje());
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
   }
	
	@Test
	public void testDiferenciaSegundos(){
		
		
		//System.out.println(oauth.service.Utils.Util.obtenerDiferencia(fechaAnterior, new Date()));
	}
	
}
