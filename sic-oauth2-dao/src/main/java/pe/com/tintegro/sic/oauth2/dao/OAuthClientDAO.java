package pe.com.tintegro.sic.oauth2.dao;

import pe.com.tintegro.sic.oauth2.dominio.CRUDAnswer;
import pe.com.tintegro.sic.oauth2.dominio.OAuthClientDetails;




public interface OAuthClientDAO
{
	/**
	 * Load the client with identifier noClientID.
	 * 
	 * @param noClientID
	 * @return
	 */
	public OAuthClientDetails loadClientById( String noClientID ) throws Exception;

	public OAuthClientDetails isClientAvailable(String noClientID, String clientSecret);
	
	/**
	 * Check if a Client is valid.
	 * 
	 * @param noClientID
	 * @return
	 */
	public CRUDAnswer isClientAvailable( String noClientID ) throws Exception;
}	
