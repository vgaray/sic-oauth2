package pe.com.tintegro.sic.oauth2.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.com.tintegro.sic.oauth2.dao.UserDAO;
import pe.com.tintegro.sic.oauth2.dto.request.ActualizaNuevaContrasenaRequest;
import pe.com.tintegro.sic.oauth2.dto.request.ActualizaUsuarioOauthRequest;
import pe.com.tintegro.sic.oauth2.dto.request.ConfirmarCambioContrasenaRequest;
import pe.com.tintegro.sic.oauth2.dto.request.InsertaUsuarioOauthRequest;
import pe.com.tintegro.sic.oauth2.dto.response.ActualizaNuevaContrasenaResponse;
import pe.com.tintegro.sic.oauth2.dto.response.ActualizaUsuarioResponse;
import pe.com.tintegro.sic.oauth2.dto.response.ConfirmarCambioContrasenaResponse;
import pe.com.tintegro.sic.oauth2.dto.response.InsertaUsuarioResponse;
import pe.com.tintegro.sic.oauth2.service.UserService;
import pe.com.tintegro.sic.oauth2.service.Utils.DesEncriptaKeyUtils;
import pe.com.tintegro.sic.oauth2.service.Utils.EncriptaUtils;
import pe.com.tintegro.sic.oauth2.utils.Fechas;

@Service("userServices")
@Transactional
public class UserServiceImpl implements UserService
{
	@Resource(name = "userDAO")
	protected UserDAO userDAO;

	@Autowired
	DesEncriptaKeyUtils desencriptaUtils;
	
	@Override
	public InsertaUsuarioResponse insertarUsuarioService(InsertaUsuarioOauthRequest request) throws Exception
	{
		// TODO Auto-generated method stub

		InsertaUsuarioResponse response = new InsertaUsuarioResponse();
		response = userDAO.insertarUsuarioDAO(request);
		return response;
	}

	@Override
	public ActualizaUsuarioResponse actualizaUsuarioService(ActualizaUsuarioOauthRequest request) throws Exception
	{
		// TODO Auto-generated method stub

		ActualizaUsuarioResponse response = new ActualizaUsuarioResponse();
		response = userDAO.actualizaUsuarioDAO(request);
		return response;
	}

	@Override
	public ActualizaNuevaContrasenaResponse actualizarNuevaContrasenaService(ActualizaNuevaContrasenaRequest request) throws Exception
	{
		// TODO Auto-generated method stub

		ActualizaNuevaContrasenaResponse response = new ActualizaNuevaContrasenaResponse();
		String timeStampDesc = desencriptaUtils.textoDesEncriptado(request.getpToken2());
		
		System.out.println(timeStampDesc);
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS");
		String dateInString = timeStampDesc;
		Date parsedDate = formatter.parse(dateInString);
		System.out.println(parsedDate.toString());
		int restaSegundos=Fechas.obtenerDiferencia(parsedDate, new Date());
		
		System.out.println("Segundos Restante: "+ restaSegundos);
		if (restaSegundos < 60)
		{
			response = userDAO.actualizarNuevaContrasenaDAO(request);
		}
		else
		{
			response.setEstado(0);
			response.setMensaje("no esta permitido");
		}
		return response;
	}

	@Override
	public ConfirmarCambioContrasenaResponse confirmarCambioContrasenaService(ConfirmarCambioContrasenaRequest request) throws Exception
	{
		// TODO Auto-generated method stub
		ConfirmarCambioContrasenaResponse response = new ConfirmarCambioContrasenaResponse();
		
String timeStampDescs = desencriptaUtils.textoDesEncriptado(request.getpTokenEncript());
		
		System.out.println(timeStampDescs);
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS");
		String dateInString = timeStampDescs;
		Date parsedDate = formatter.parse(dateInString);
		System.out.println(parsedDate.toString());
		int restaSegundos=Fechas.obtenerDiferencia(parsedDate, new Date());

		System.out.println("Segundos Restante: "+ restaSegundos);
		if (restaSegundos < 60)
		{
			response = userDAO.confirmarCambioContrasenaDAO(request);
		}
		else
		{
			response.setEstado(0);
			response.setMensaje("no esta permitido");
		}
		return response;
	}

}
