package pe.com.tintegro.sic.oauth2.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.com.tintegro.sic.oauth2.dao.OAuthAccessTokenDAO;
import pe.com.tintegro.sic.oauth2.dto.request.ObtenerAccessTokenRequest;
import pe.com.tintegro.sic.oauth2.dto.response.OAuthAccessTokenResponse;
import pe.com.tintegro.sic.oauth2.service.OAuthAccessTokenService;
import pe.com.tintegro.sic.oauth2.service.Utils.HttpBasicAuthenticationHeader;

@Service("oauthAccessTokenService")
@Transactional
public class OAuthAccessTokenServiceImpl implements OAuthAccessTokenService
{
	@Autowired
	protected OAuthAccessTokenDAO oauthAccessTokenDAO;

	public OAuthAccessTokenResponse obtenerAccessTokenServices(ObtenerAccessTokenRequest request) throws Exception
	{
		OAuthAccessTokenResponse response = new OAuthAccessTokenResponse();

		if (request.getAutorization().contains("Basic"))
		{

			String autorizator[] = request.getAutorization().split(" ");

			if (Character.isDigit(autorizator[1].charAt(0)))
			{
				response = new OAuthAccessTokenResponse("error", "no se encuentra la palabra Basic");
			}
			else
			{
				request.setClientId(HttpBasicAuthenticationHeader.decode(autorizator[1])[0]);
				request.setClientSecret(HttpBasicAuthenticationHeader.decode(autorizator[1])[1]);
				request.setPassword(request.getPassword());

				response = oauthAccessTokenDAO.obtenerAccessToken(request);
			}
		}
		else
		{
			response = new OAuthAccessTokenResponse("error", "no se encuentra la palabra Basic");
		}
		
		return response;
	}
}
