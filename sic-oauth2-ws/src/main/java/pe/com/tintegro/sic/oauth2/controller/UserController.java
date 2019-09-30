package pe.com.tintegro.sic.oauth2.controller;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import pe.com.tintegro.sic.oauth2.dto.request.ActualizaNuevaContrasenaRequest;
import pe.com.tintegro.sic.oauth2.dto.request.ActualizaUsuarioOauthRequest;
import pe.com.tintegro.sic.oauth2.dto.request.ConfirmarCambioContrasenaRequest;
import pe.com.tintegro.sic.oauth2.dto.request.InsertaUsuarioOauthRequest;
import pe.com.tintegro.sic.oauth2.dto.response.ActualizaNuevaContrasenaResponse;
import pe.com.tintegro.sic.oauth2.dto.response.ActualizaUsuarioResponse;
import pe.com.tintegro.sic.oauth2.dto.response.ConfirmarCambioContrasenaResponse;
import pe.com.tintegro.sic.oauth2.dto.response.InsertaUsuarioResponse;
import pe.com.tintegro.sic.oauth2.service.UserService;
import pe.com.tintegro.sic.oauth2.service.Utils.Util;
import pe.com.tintegro.sic.oauth2.utils.Constants;

@RestController
@RequestMapping("/oauth/usuario")
public class UserController
{
	protected transient final Logger LOGGER = Logger.getLogger(this.getClass());

	@Resource(name = "userServices")
	protected UserService userServices;

	@RequestMapping(value = "/registro", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public InsertaUsuarioResponse insertarUsuario(@RequestBody InsertaUsuarioOauthRequest request)
	{
		InsertaUsuarioResponse response = new InsertaUsuarioResponse();
		try
		{
			response = userServices.insertarUsuarioService(request);
		}
		catch (Exception e)
		{
			String codError = Constants.RESOURCE_ID + Util.getCodigoErrorByDate();

			response.setMensaje("No ha sido posible revisar el token");
			System.out.println(e.getMessage());
			LOGGER.error(codError, e);
		}
		return response;
	};

	@RequestMapping(value = "/modificacion", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public ActualizaUsuarioResponse actualizaUsuario(@RequestBody ActualizaUsuarioOauthRequest request)
	{
		ActualizaUsuarioResponse response = new ActualizaUsuarioResponse();
		try
		{
			response = userServices.actualizaUsuarioService(request);
		}
		catch (Exception e)
		{
			String codError = Constants.RESOURCE_ID + Util.getCodigoErrorByDate();

			response.setMensaje("No ha sido posible actualizar al usuario");
			System.out.println(e.getMessage());
			LOGGER.error(codError, e);
		}
		return response;
	};

	@RequestMapping(value = "/nueva_contrasena", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public ActualizaNuevaContrasenaResponse actualizarNuevaContrasena(@RequestBody ActualizaNuevaContrasenaRequest request)
	{
		ActualizaNuevaContrasenaResponse response = new ActualizaNuevaContrasenaResponse();
		try
		{
			response = userServices.actualizarNuevaContrasenaService(request);
		}
		catch (Exception e)
		{
			String codError = Constants.RESOURCE_ID + Util.getCodigoErrorByDate();

			response.setMensaje("No ha sido posible realizar la actualizacion de nueva contraseña");
			System.out.println(e.getMessage());
			LOGGER.error(codError, e);
		}
		return response;
	};

	@RequestMapping(value = "/confirmacion_contrasena", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public ConfirmarCambioContrasenaResponse confirmarCambioContrasena(@RequestBody ConfirmarCambioContrasenaRequest request)
	{
		ConfirmarCambioContrasenaResponse response = new ConfirmarCambioContrasenaResponse();
		try
		{
			response = userServices.confirmarCambioContrasenaService(request);
		}
		catch (Exception e)
		{
			String codError = Constants.RESOURCE_ID + Util.getCodigoErrorByDate();

			response.setMensaje("No ha sido posible confirmar el cambio de contraseña");
			System.out.println(e.getMessage());
			LOGGER.error(codError, e);
		}
		return response;
	};

}
