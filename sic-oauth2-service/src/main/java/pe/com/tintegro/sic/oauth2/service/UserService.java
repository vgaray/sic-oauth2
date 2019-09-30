package pe.com.tintegro.sic.oauth2.service;

import pe.com.tintegro.sic.oauth2.dto.request.ActualizaNuevaContrasenaRequest;
import pe.com.tintegro.sic.oauth2.dto.request.ActualizaUsuarioOauthRequest;
import pe.com.tintegro.sic.oauth2.dto.request.ConfirmarCambioContrasenaRequest;
import pe.com.tintegro.sic.oauth2.dto.request.InsertaUsuarioOauthRequest;
import pe.com.tintegro.sic.oauth2.dto.response.ActualizaNuevaContrasenaResponse;
import pe.com.tintegro.sic.oauth2.dto.response.ActualizaUsuarioResponse;
import pe.com.tintegro.sic.oauth2.dto.response.ConfirmarCambioContrasenaResponse;
import pe.com.tintegro.sic.oauth2.dto.response.InsertaUsuarioResponse;

public interface UserService
{

	public InsertaUsuarioResponse insertarUsuarioService(InsertaUsuarioOauthRequest request) throws Exception;

	public ActualizaUsuarioResponse actualizaUsuarioService(ActualizaUsuarioOauthRequest request) throws Exception;

	public ActualizaNuevaContrasenaResponse actualizarNuevaContrasenaService(ActualizaNuevaContrasenaRequest request) throws Exception;

	public ConfirmarCambioContrasenaResponse confirmarCambioContrasenaService(ConfirmarCambioContrasenaRequest request) throws Exception;

}
