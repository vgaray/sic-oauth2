package pe.com.tintegro.sic.oauth2.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import pe.com.tintegro.sic.oauth2.dominio.CRUDAnswer;
import pe.com.tintegro.sic.oauth2.dominio.Role;
import pe.com.tintegro.sic.oauth2.dominio.User;


public interface UserMapper
{
	/**
	 * Load data of user with identifier noLogin (username)
	 * 
	 * @param noLogin
	 * @return
	 */
	public List<User> loadUserByUsername(@Param("noLogin") String noLogin);

	/**
	 * List all the roles of a User identifiered for his noLogin.
	 * 
	 * @param noLogin
	 * @return
	 */
	public List<Role> loadRolesByUsername(@Param("noLogin") String noLogin);

	public User obtenerUsuario(@Param("noLogin") String noLogin, @Param("noPassword") String noPassword, @Param("noClient") String noCliente);
	
	public List<CRUDAnswer> registrarUsuarioMapper(@Param("pNoLogin") String pNoLogin , @Param("pNoPassword") String pNoPassword , @Param("pNoNombres") String pNoNombres , @Param("pNoApellidos") String pNoApellidos , @Param("pNoEmail") String pNoEmail , @Param("pNoProfe") String pNoProfe , @Param("pNoCodUsuarioCreador") String pNoCodUsuarioCreador , @Param("pTokenCreador") String pTokenCreador );
	
	public List<CRUDAnswer> actualizarUsuarioMapper(@Param("pNoLogin") String pNoLogin , @Param("pNoPassword") String pNoPassword , @Param("pNoNombres") String pNoNombres , @Param("pNoApellidos") String pNoApellidos , @Param("pNoEmail") String pNoEmail , @Param("pNoProfe") String pNoProfe , @Param("pNoCodUsuarioCreador") String pNoCodUsuarioCreador , @Param("pTokenCreador") String pTokenCreador );
	
	public List<CRUDAnswer> actualizarNuevaContrasenaMapper( @Param("pNewPassword") String pNewPassword , @Param("pCodUsuario") String pCodUsuario , @Param("pToken") String pToken );
	
	public List<CRUDAnswer> confirmarNuevaContrasenaMapper( @Param("pCodUsuario") String pCodUsuario , @Param("pToken") String pToken );
	
}
