package pe.com.tintegro.sic.oauth2.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import pe.com.tintegro.sic.oauth2.dto.request.ObtenerAccessTokenRequest;
import pe.com.tintegro.sic.oauth2.dto.response.OAuthAccessTokenResponse;
import pe.com.tintegro.sic.oauth2.service.OAuthAccessTokenService;
import pe.com.tintegro.sic.oauth2.service.Utils.Util;
import pe.com.tintegro.sic.oauth2.utils.Constants;

@RestController
@RequestMapping("/oauth/token")
public class OAuthAccessTokenController
{
	protected transient final Logger LOGGER = Logger.getLogger(this.getClass());
	
	@Autowired
	private OAuthAccessTokenService oauthAccessTokenService;

	@RequestMapping(params = { "grant_type", "username", "password" }, method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public OAuthAccessTokenResponse obtenerAccessToken(@RequestParam(value = "grant_type") String grantType, @RequestParam(value = "username") String username, @RequestParam(value = "password") String password, @RequestHeader(value = "Authorization") String autorization)
	{
		OAuthAccessTokenResponse response = new OAuthAccessTokenResponse();

		try
		{
			ObtenerAccessTokenRequest request = new ObtenerAccessTokenRequest();
			request.setUsername(username);
			request.setPassword(password);
			request.setAutorization(autorization);

			response = oauthAccessTokenService.obtenerAccessTokenServices(request);
		}
		catch (Exception e)
		{
			String codError = Constants.RESOURCE_ID + Util.getCodigoErrorByDate();

			response.setMensaje("No ha sido posible asignar token");
			System.out.println(e.getMessage());
			LOGGER.error(codError, e);
		}

		return response;
	}
}
