package pe.com.tintegro.sic.oauth2.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import pe.com.tintegro.sic.oauth2.dao.CheckTokenDAO;
import pe.com.tintegro.sic.oauth2.dominio.CRUDAnswer;

import pe.com.tintegro.sic.oauth2.dto.request.CheckTokenRequest;
import pe.com.tintegro.sic.oauth2.dto.response.CheckTokenResponse;
import pe.com.tintegro.sic.oauth2.mapper.OAuthAccessTokenMapper;
import pe.com.tintegro.sic.oauth2.mapper.OAuthClientMapper;

@Repository("checkTokenDAO")
public class CheckTokenDAOImpl implements CheckTokenDAO
{
	@Autowired
	private OAuthClientMapper oauthClientMapper;

	@Autowired
	private OAuthAccessTokenMapper oauthAccessTokenMapper;

	public CheckTokenResponse obtenerCheckTokenDAO(CheckTokenRequest request) throws Exception
	{
		CheckTokenResponse response = new CheckTokenResponse();

		List<CRUDAnswer> results = oauthAccessTokenMapper.obtenerAccessTokenByClientId(request.getClientId(), request.getToken(), request.getCodUsuario());

		if (results.size() > 0)
		{
			response.setEstado(results.get(0).getIdAnswer());
			
			response.setMensaje(results.get(0).getNoAnswer());

		}

		/*
		 * //OAuthClientDetails oauthClientDetails =
		 * oauthClientMapper.loadClientById(request.getClientId()).get(0);
		 * Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		 * System.out.println("Inicio:"+timestamp);
		 * 
		 * List<OAuthAccessToken> oauthAccessTokenList =
		 * oauthAccessTokenMapper.obtenerAccessTokenByClientId
		 * (request.getClientId(), request.getToken()); Timestamp timestamp2 = new
		 * Timestamp(System.currentTimeMillis());
		 * System.out.println("Despues de obtener accestokenbyClientID:"
		 * +timestamp2);
		 * 
		 * if(oauthAccessTokenList.size()>0){
		 * 
		 * OAuthAccessToken oauthAccessToken=oauthAccessTokenList.get(0); if
		 * (Fechas.obtenerDiferencia(oauthAccessToken.getLastTimeUse(), new
		 * Date()) > 3600) { Timestamp timestamp3 = new
		 * Timestamp(System.currentTimeMillis());
		 * System.out.println("Luego de Validar Tiempo:"+timestamp3);
		 * 
		 * response.setMensaje("Tiempo Expirado"); response.setExpiration(new
		 * Date()); } else { Timestamp timestamp4 = new
		 * Timestamp(System.currentTimeMillis());
		 * System.out.println("Luego de Validar Tiempo:"+timestamp4); //String[]
		 * authorities = oauthClientDetails.getNoAuthorities().split(",");
		 * 
		 * //response.setAud(oauthClientDetails.getNoIDsResources());
		 * //response.setAuthorities(Arrays.asList(authorities));
		 * response.setClientId(oauthAccessToken.getClientId());
		 * response.setUsername(oauthAccessToken.getUserName());
		 * 
		 * //String[] scopes = oauthClientDetails.getNoScope().split(",");
		 * 
		 * //response.setScope(Arrays.asList(scopes));
		 * 
		 * Date dateActual = new Date(); Date dateHoras =
		 * Fechas.aumentaFechaExpiracion(dateActual, 1);
		 * 
		 * response.setExpiration(dateHoras); //List<CRUDAnswer>
		 * results=oauthAccessTokenMapper
		 * .actualizarFechaUsoToken(oauthAccessToken.getToken());
		 * //response.setMensaje(results.get(0).getNoAnswer());
		 * response.setMensaje("OK"); } } else{
		 * response.setMensaje("El token no corresponde al clientId"); } Timestamp
		 * timestamp5 = new Timestamp(System.currentTimeMillis());
		 * System.out.println("Fin:"+timestamp5);
		 */
		return response;
	}
}
