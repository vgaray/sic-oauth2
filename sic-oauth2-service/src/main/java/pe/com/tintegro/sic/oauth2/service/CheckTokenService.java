package pe.com.tintegro.sic.oauth2.service;

import pe.com.tintegro.sic.oauth2.dto.request.CheckTokenRequest;
import pe.com.tintegro.sic.oauth2.dto.response.CheckTokenResponse;



public interface CheckTokenService
{
	 public CheckTokenResponse obtenerCheckTokenService( CheckTokenRequest request) throws Exception;
}
