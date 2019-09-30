package pe.com.tintegro.sic.oauth2.dao;

import pe.com.tintegro.sic.oauth2.dto.request.CheckTokenRequest;
import pe.com.tintegro.sic.oauth2.dto.response.CheckTokenResponse;



public interface CheckTokenDAO
{
     public CheckTokenResponse obtenerCheckTokenDAO( CheckTokenRequest request) throws Exception;
}
