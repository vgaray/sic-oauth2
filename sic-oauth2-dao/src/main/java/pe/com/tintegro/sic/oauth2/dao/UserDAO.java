package pe.com.tintegro.sic.oauth2.dao;

import java.util.List;

import pe.com.tintegro.sic.oauth2.dominio.Role;
import pe.com.tintegro.sic.oauth2.dominio.User;
import pe.com.tintegro.sic.oauth2.dto.request.ActualizaNuevaContrasenaRequest;
import pe.com.tintegro.sic.oauth2.dto.request.ActualizaUsuarioOauthRequest;
import pe.com.tintegro.sic.oauth2.dto.request.ConfirmarCambioContrasenaRequest;
import pe.com.tintegro.sic.oauth2.dto.request.InsertaUsuarioOauthRequest;
import pe.com.tintegro.sic.oauth2.dto.response.ActualizaNuevaContrasenaResponse;
import pe.com.tintegro.sic.oauth2.dto.response.ActualizaUsuarioResponse;
import pe.com.tintegro.sic.oauth2.dto.response.ConfirmarCambioContrasenaResponse;
import pe.com.tintegro.sic.oauth2.dto.response.InsertaUsuarioResponse;



public interface UserDAO
{
	/**
	 * Load data user from the identifier noLogin ( username )
	 * 
	 * @param noLogin
	 * @return
	 * @throws Exception
	 */
	public User loadUserByUsername( String noLogin ) throws Exception;
	
	/**
	 * List all the roles of a User identifiered for his noLogin. 
	 * 
	 * @param noLogin
	 * @return
	 * @throws Exception
	 */
	public List< Role > loadRolesByUsername( String noLogin ) throws Exception; 
	
	
	public InsertaUsuarioResponse insertarUsuarioDAO(InsertaUsuarioOauthRequest request) throws Exception;
	
	public ActualizaUsuarioResponse actualizaUsuarioDAO(ActualizaUsuarioOauthRequest request) throws Exception;
	
	public ActualizaNuevaContrasenaResponse actualizarNuevaContrasenaDAO(ActualizaNuevaContrasenaRequest request) throws Exception;
	
	public ConfirmarCambioContrasenaResponse confirmarCambioContrasenaDAO (ConfirmarCambioContrasenaRequest request) throws Exception;
	
	
	
}
