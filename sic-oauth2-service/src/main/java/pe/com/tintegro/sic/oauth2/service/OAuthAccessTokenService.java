package pe.com.tintegro.sic.oauth2.service;

import pe.com.tintegro.sic.oauth2.dto.request.ObtenerAccessTokenRequest;
import pe.com.tintegro.sic.oauth2.dto.response.OAuthAccessTokenResponse;



public interface OAuthAccessTokenService
{
   public OAuthAccessTokenResponse obtenerAccessTokenServices(ObtenerAccessTokenRequest request) throws Exception;
}
