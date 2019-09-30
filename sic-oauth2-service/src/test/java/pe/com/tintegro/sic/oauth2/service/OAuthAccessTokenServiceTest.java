package pe.com.tintegro.sic.oauth2.service;



import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import pe.com.tintegro.sic.oauth2.config.ApplicationContextDaoConfig;
import pe.com.tintegro.sic.oauth2.dto.request.ObtenerAccessTokenRequest;
import pe.com.tintegro.sic.oauth2.dto.response.OAuthAccessTokenResponse;
import pe.com.tintegro.sic.oauth2.service.Utils.EncriptaUtils;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { ApplicationContextDaoConfig.class })
public class OAuthAccessTokenServiceTest
{
	@Autowired
	OAuthAccessTokenService oauthService;

	@Test
	public void testToken()
	{
		ObtenerAccessTokenRequest request=new ObtenerAccessTokenRequest();
		
		request.setUsername("cli");
		request.setPassword("123");
		request.setAutorization("Basic c2ljLWZyb250ZW5kOjEyMzQ1Njc4OTA5ODc2NTQzMjE=");
		
		OAuthAccessTokenResponse response =new OAuthAccessTokenResponse();
		
		try
		{
			response=oauthService.obtenerAccessTokenServices(request);
			System.out.println(response.getError());
			System.out.println(response.getDescripcionError());
			
			System.out.println(response.getRefreshToken());
			System.out.println(response.getTokenType());
			System.out.println(response.getExpiresIn());
			System.out.println(response.getAccessToken());
			
			
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	}
	
	//@Test
	public void testDescodificar(){
		
		try
		{
			
	  	System.out.println(EncriptaUtils.encriptar("123"));
		//	System.out.println(EncriptaUtils.desencriptar("25f9e794323b453885f5181f1b624d0b"));	
		}
		catch (Exception e)
		{
			// TODO: handle exception
		}
		
	}
}
