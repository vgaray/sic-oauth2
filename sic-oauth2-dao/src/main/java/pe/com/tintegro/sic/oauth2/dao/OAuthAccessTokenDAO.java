package pe.com.tintegro.sic.oauth2.dao;

import pe.com.tintegro.sic.oauth2.dto.request.ObtenerAccessTokenRequest;
import pe.com.tintegro.sic.oauth2.dto.response.OAuthAccessTokenResponse;








public interface OAuthAccessTokenDAO
{

	public OAuthAccessTokenResponse obtenerAccessToken(ObtenerAccessTokenRequest request) throws Exception;
	
   
	
}
