package pe.com.tintegro.sic.oauth2.dao.impl;

import java.nio.charset.Charset;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import pe.com.tintegro.sic.oauth2.dao.OAuthAccessTokenDAO;
import pe.com.tintegro.sic.oauth2.dominio.CRUDAnswer;
import pe.com.tintegro.sic.oauth2.dominio.OAuthAccessToken;

import pe.com.tintegro.sic.oauth2.dominio.User;
import pe.com.tintegro.sic.oauth2.dto.request.ObtenerAccessTokenRequest;
import pe.com.tintegro.sic.oauth2.dto.response.OAuthAccessTokenResponse;
import pe.com.tintegro.sic.oauth2.mapper.OAuthAccessTokenMapper;
import pe.com.tintegro.sic.oauth2.mapper.OAuthApprovalsMapper;
import pe.com.tintegro.sic.oauth2.mapper.OAuthClientMapper;
import pe.com.tintegro.sic.oauth2.mapper.UserMapper;
import pe.com.tintegro.sic.oauth2.utils.Constants;
import pe.com.tintegro.sic.oauth2.utils.GenerateUUID;

@Repository("oauthAccessTokenDAO")
public class OAuthAccessTokenDAOImpl implements OAuthAccessTokenDAO
{

	@Autowired
	UserMapper userMapper;

	@Autowired
	OAuthApprovalsMapper oauthappMapper;

	@Autowired
	OAuthClientMapper oauthClientMapper;

	@Autowired
	OAuthAccessTokenMapper oauthAccessTokenMapper;

	public OAuthAccessTokenResponse obtenerAccessToken(ObtenerAccessTokenRequest request) throws Exception
	{
		OAuthAccessTokenResponse response = new OAuthAccessTokenResponse();
		User user = userMapper.obtenerUsuario(request.getUsername(), request.getPassword(), request.getClientId());

		OAuthAccessToken oauthAccessToken = new OAuthAccessToken();

		if (user != null)
		{
			
			response.setAccessToken(GenerateUUID.generarToken());
			response.setRefreshToken(GenerateUUID.generarToken());
			response.setNombreUsuario(user.getNoNombre() + " " + user.getNoApellido());
			response.setEstado(Constants.ESTADO_TRAMA_OK);
			response.setTokenType("bearer");
			oauthAccessToken.setToken(response.getAccessToken());
			oauthAccessToken.setClientId(request.getClientId());
			oauthAccessToken.setRefreshToken(response.getRefreshToken());
			oauthAccessToken.setUserName(user.getNoLogin());
			oauthAccessToken.setAuthentication("asd".getBytes(Charset.forName("UTF-8")));
			oauthAccessToken.setAuthenticationId("asdwdasd");
			List<CRUDAnswer> answers = oauthAccessTokenMapper.registrarAccessToken(oauthAccessToken.getUserName(), 
					                                                                 oauthAccessToken.getToken(), 
					                                                                 oauthAccessToken.getRefreshToken(),
					                                                                 oauthAccessToken.getAuthentication(), 
					                                                                 oauthAccessToken.getAuthenticationId(), 
					                                                                 oauthAccessToken.getClientId());

			System.out.println(answers.get(0).getIdAnswer());
			System.out.println(answers.get(0).getNoAnswer());
		}

		else
		{
			response = new OAuthAccessTokenResponse("unavaiable", "No se encuentra la aplicacion");
		}
		//
		/*
		 * User user = userMapper.existeUser(request.getUsername(),
		 * request.getPassword());
		 * 
		 * OAuthClientDetails oauthClient =
		 * oauthClientMapper.existeClienteDetails(
		 * request.getClientSecret()).get(0);
		 * 
		 * OAuthAccessToken oauthAccessToken = new OAuthAccessToken(); if
		 * (oauthClient != null) { if (user != null) {
		 * 
		 * response.setExpiresIn(oauthClient.getNoAccessTokenValidity());
		 * 
		 * response.setTokenType("bearer");
		 * response.setAccessToken(GenerateUUID.generarToken());
		 * response.setRefreshToken(GenerateUUID.generarToken());
		 * response.setNombreUsuario(user.getNoNombre()+" "+user.getNoApellido());
		 * response.setEstado(Constants.ESTADO_TRAMA_OK);
		 * oauthAccessToken.setToken(response.getAccessToken());
		 * oauthAccessToken.setClientId(oauthClient.getNoClientID());
		 * oauthAccessToken.setRefreshToken(response.getRefreshToken());
		 * oauthAccessToken.setUserName(user.getNoLogin());
		 * oauthAccessToken.setAuthentication
		 * ("asd".getBytes(Charset.forName("UTF-8")));
		 * oauthAccessToken.setAuthenticationId("asdwdasd");
		 * 
		 * // oauthAccessTokenMapper.insertarAccessToken(oauthAccessToken);
		 * List<CRUDAnswer> answers =
		 * oauthAccessTokenMapper.registrarAccessToken(oauthAccessToken
		 * .getUserName(), oauthAccessToken.getToken(),
		 * oauthAccessToken.getRefreshToken(),
		 * oauthAccessToken.getAuthentication(),
		 * oauthAccessToken.getAuthenticationId(),
		 * oauthAccessToken.getClientId());
		 * 
		 * System.out.println(answers.get(0).getIdAnswer());
		 * System.out.println(answers.get(0).getNoAnswer());
		 * 
		 * } else { response = new OAuthAccessTokenResponse("unavaiable",
		 * "No se encuentra al Usuario"); } }
		 * 
		 * else { response = new OAuthAccessTokenResponse("unavaiable",
		 * "No se encuentra la aplicacion"); }
		 */

		return response;
	}

}
