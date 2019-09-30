package pe.com.tintegro.sic.oauth2.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import pe.com.tintegro.sic.oauth2.dao.UserDAO;
import pe.com.tintegro.sic.oauth2.dominio.CRUDAnswer;
import pe.com.tintegro.sic.oauth2.dominio.Role;
import pe.com.tintegro.sic.oauth2.dominio.User;
import pe.com.tintegro.sic.oauth2.dto.request.ActualizaNuevaContrasenaRequest;
import pe.com.tintegro.sic.oauth2.dto.request.ActualizaUsuarioOauthRequest;
import pe.com.tintegro.sic.oauth2.dto.request.ConfirmarCambioContrasenaRequest;
import pe.com.tintegro.sic.oauth2.dto.request.InsertaUsuarioOauthRequest;
import pe.com.tintegro.sic.oauth2.dto.response.ActualizaNuevaContrasenaResponse;
import pe.com.tintegro.sic.oauth2.dto.response.ConfirmarCambioContrasenaResponse;
import pe.com.tintegro.sic.oauth2.dto.response.ActualizaUsuarioResponse;
import pe.com.tintegro.sic.oauth2.dto.response.InsertaUsuarioResponse;
import pe.com.tintegro.sic.oauth2.mapper.UserMapper;

@Repository("userDAO")

public class UserDAOImpl implements UserDAO
{
	@Autowired
	UserMapper userMapper;

	public User loadUserByUsername(String noLogin) throws Exception
	{
		User user = null;

		user = userMapper.loadUserByUsername(noLogin).get(0);

		return user;
	}

	public List<Role> loadRolesByUsername(String noLogin) throws Exception
	{
		return null;
	}

	@Override
	public InsertaUsuarioResponse insertarUsuarioDAO(InsertaUsuarioOauthRequest request) throws Exception
	{
		// TODO Auto-generated method stub
		InsertaUsuarioResponse response =new InsertaUsuarioResponse();
		List<CRUDAnswer> results= userMapper.registrarUsuarioMapper(request.getpNologin(), 
				                                                      request.getpNoPassword(), 
				                                                      request.getpNoNombres(), 
				                                                      request.getpNoApellidos(), 
				                                                      request.getpNoEmail(), 
				                                                      request.getpNoProfe(), 
				                                                      request.getpNoCodUsuarioCreador(), 
				                                                      request.getpTokeNCreador());

		if(results.size()>=1){
			response.setEstado(results.get(0).getIdAnswer());
			response.setMensaje(results.get(0).getNoAnswer());
		}
		return response;
	}

	@Override
	public ActualizaUsuarioResponse actualizaUsuarioDAO(ActualizaUsuarioOauthRequest request) throws Exception
	{
		// TODO Auto-generated method stub
		ActualizaUsuarioResponse response =new ActualizaUsuarioResponse();
		List<CRUDAnswer> results= userMapper.actualizarUsuarioMapper(request.getpNologin(), 
																		             request.getpNoPassword(), 
																		             request.getpNoNombres(), 
																		             request.getpNoApellidos(), 
																		             request.getpNoEmail(), 
																		             request.getpNoProfe(), 
																		             request.getpNoCodUsuarioCreador(), 
																		             request.getpTokeNCreador());
		
		if(results.size()>=1){
			response.setEstado(results.get(0).getIdAnswer());
			response.setMensaje(results.get(0).getNoAnswer());
		}
		return response;
	}

	
	@Override
	public ActualizaNuevaContrasenaResponse actualizarNuevaContrasenaDAO(ActualizaNuevaContrasenaRequest request) throws Exception
	{
		// TODO Auto-generated method stub
		ActualizaNuevaContrasenaResponse response = new ActualizaNuevaContrasenaResponse();
		List<CRUDAnswer> results= userMapper.actualizarNuevaContrasenaMapper(request.getpNewPassword(), request.getpCodUsuario(), request.getpToken());

		
		if(results.size()>=1){
			response.setEstado(results.get(0).getIdAnswer());
			response.setMensaje(results.get(0).getNoAnswer());
		}
		return response;
	}
	
	@Override
	public ConfirmarCambioContrasenaResponse confirmarCambioContrasenaDAO(ConfirmarCambioContrasenaRequest request) throws Exception
	{
		// TODO Auto-generated method stub
		ConfirmarCambioContrasenaResponse response = new ConfirmarCambioContrasenaResponse();
		List<CRUDAnswer> results= userMapper.confirmarNuevaContrasenaMapper(request.getpCodUsuario(), request.getpToken());

		if(results.size()>=1){
			response.setEstado(results.get(0).getIdAnswer());
			response.setMensaje(results.get(0).getNoAnswer());
		}
		return response;
	}
}
