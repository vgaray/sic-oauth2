package pe.com.tintegro.sic.oauth2.dao;

//import java.util.ArrayList;
//import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import pe.com.tintegro.sic.oauth2.config.ApplicationContextDaoConfig;
import pe.com.tintegro.sic.oauth2.dto.request.ObtenerAccessTokenRequest;
import pe.com.tintegro.sic.oauth2.dto.response.OAuthAccessTokenResponse;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { ApplicationContextDaoConfig.class })
public class OAuthAccessTokenResponseTest
{
	@Autowired
	OAuthAccessTokenDAO oauthaccesstokenDAO;

	@Test
	public void testAccessToken()
	{
		ObtenerAccessTokenRequest request = new ObtenerAccessTokenRequest();
		request.setPassword("123456");
		request.setUsername("usuAdminis");
		request.setClientId("sic-frontend");
		//request.setClientSecret("1234567890987654321");

		//
		// String sw="write";
		// String sr="read";
		// String st="trusted";
		// List<String> scopes=new ArrayList<String>();
		// scopes.add(sw);
		// scopes.add(sr);
		// scopes.add(st);
		//
		// request.setScopes(scopes);
		// request.setClientId("asdmiwm");

		OAuthAccessTokenResponse response = new OAuthAccessTokenResponse();
		try
		{
			response = oauthaccesstokenDAO.obtenerAccessToken(request);

			System.out.println("Token: "+response.getAccessToken());
			System.out.println("Expiracion: "+response.getExpiresIn());
			System.out.println("Refresh Token: "+response.getRefreshToken());
         System.out.println("Nombre de Usuario: "+response.getNombreUsuario());
			System.out.println("Descripcion Error: "+response.getDescripcionError());
			System.out.println("Error: "+response.getError());

		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}

	}
}
