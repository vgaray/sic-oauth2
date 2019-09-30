package pe.com.tintegro.sic.oauth2.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.com.tintegro.sic.oauth2.dao.CheckTokenDAO;
import pe.com.tintegro.sic.oauth2.dto.request.CheckTokenRequest;
import pe.com.tintegro.sic.oauth2.dto.response.CheckTokenResponse;
import pe.com.tintegro.sic.oauth2.service.CheckTokenService;

@Service("checkTokenServices")
@Transactional
public class CheckTokenServiceImpl implements CheckTokenService
{
	@Autowired
	protected CheckTokenDAO checkTokenDAO;

	public CheckTokenResponse obtenerCheckTokenService(CheckTokenRequest request) throws Exception
	{
		CheckTokenResponse response = new CheckTokenResponse();

		if (request.getToken().isEmpty() || request.getToken().equals(""))
		{
			
			response.setMensaje("Token Vacío");
		}
		else
		{
			response = checkTokenDAO.obtenerCheckTokenDAO(request);
			
			if(response.getEstado() == 1){

				response.setClientId(request.getClientId());
			}
			
			else {
				response.setClientId(null);
			}
		}
		
		return response;
	}
}
