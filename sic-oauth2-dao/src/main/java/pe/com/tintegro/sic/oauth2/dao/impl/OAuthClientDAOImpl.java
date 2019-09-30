package pe.com.tintegro.sic.oauth2.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import pe.com.tintegro.sic.oauth2.dao.OAuthClientDAO;
import pe.com.tintegro.sic.oauth2.dominio.CRUDAnswer;
import pe.com.tintegro.sic.oauth2.dominio.OAuthClientDetails;
import pe.com.tintegro.sic.oauth2.mapper.OAuthClientMapper;



@Repository("oauthClientDAO")
public class OAuthClientDAOImpl implements OAuthClientDAO
{
	@Autowired
	private OAuthClientMapper oAuthClientMapper;

	public OAuthClientDetails loadClientById(String noClientID)
			throws Exception {
		// TODO Auto-generated method stub
		return oAuthClientMapper.loadClientById(noClientID).get(0);
	}

	public OAuthClientDetails isClientAvailable(String noClientID,
			String clientSecret) {
		// TODO Auto-generated method stub
		return oAuthClientMapper.existeClienteDetails(noClientID, clientSecret).get(0);
	}

	public CRUDAnswer isClientAvailable(String noClientID) throws Exception {
		// TODO Auto-generated method stub
		return oAuthClientMapper.isClientAvailable(noClientID).get(0);
	}

//	public OAuthClientDetails loadClientById(String noClientID) throws Exception
//	{
//		return oAuthClientMapper.loadClientById(noClientID).get(0);
//	}
//
//	public CRUDAnswer isClientAvailable(String noClientID) throws Exception
//	{
//		return oAuthClientMapper.isClientAvailable(noClientID).get(0);
//	}
//
//	
//	public OAuthClientDetails isClientAvailable(String noClientID, String clientSecret)
//	{
//
//		return oAuthClientMapper.existeClienteDetails(noClientID, clientSecret).get(0);
//	}
}
