package pe.com.tintegro.sic.oauth2.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import pe.com.tintegro.sic.oauth2.dominio.CRUDAnswer;
import pe.com.tintegro.sic.oauth2.dominio.OAuthClientDetails;



public interface OAuthClientMapper
{
	/**
	 * Load the client with identifier noClientID.
	 * 
	 * @param noClientID
	 * @return
	 */
	public List< OAuthClientDetails > loadClientById( String noClientID );

	/**
	 * Check if a Client is valid.
	 * 
	 * @param noClientID
	 * @return
	 */
	public List< CRUDAnswer > isClientAvailable( String noClientID );
	
	
	public List<OAuthClientDetails> existeClienteDetails(@Param("noClientID")  String noClientID , @Param("noClientSecret") String clientSecret);
	
}
