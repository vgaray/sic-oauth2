package pe.com.tintegro.sic.oauth2.dao;



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
public class CheckTokenResponseTest {
	@Autowired
	CheckTokenDAO checkTokenDAO;

	

	@Test
	public void testCheckToken() {
		CheckTokenRequest request = new CheckTokenRequest();
		request.setClientId("sic-frontend");
		request.setToken("7d0fe575-f0d0-4e2e-8561-f26a5e15cdb3");
		request.setCodUsuario("cli");
		CheckTokenResponse response = new CheckTokenResponse();
		try {

			response = checkTokenDAO.obtenerCheckTokenDAO(request);
			System.out.println(response.getEstado());
			System.out.println(response.getMensaje());
						

		} catch (Exception e) {

		}
	}

}
