package pe.com.tintegro.sic.oauth2.controller;

import java.sql.Timestamp;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import pe.com.tintegro.sic.oauth2.dto.request.CheckTokenRequest;
import pe.com.tintegro.sic.oauth2.dto.response.CheckTokenResponse;
import pe.com.tintegro.sic.oauth2.service.CheckTokenService;
import pe.com.tintegro.sic.oauth2.service.Utils.Util;
import pe.com.tintegro.sic.oauth2.utils.Constants;

@RestController
@RequestMapping("/oauth/token")
public class CheckTokenController
{
	protected transient final Logger LOGGER = Logger.getLogger(this.getClass());
	
	@Autowired
	private CheckTokenService checkTokenService;

	@RequestMapping(value = "/check_token", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public CheckTokenResponse obtenerCheckToken(@RequestParam("token") String token, @RequestHeader("codUsuario") String codUsuario, @RequestBody CheckTokenRequest request)
	{
		CheckTokenResponse response = new CheckTokenResponse();
		try
		{  Timestamp timestamp1 = new Timestamp(System.currentTimeMillis());
		   System.out.println("Inicio de Controlador:"+timestamp1);
		
			request.setToken(token);
			request.setCodUsuario(codUsuario);
			response = checkTokenService.obtenerCheckTokenService(request);
			Timestamp timestamp2 = new Timestamp(System.currentTimeMillis());
		   System.out.println("Fin de Controlador:"+timestamp2);
		
		}
		catch (Exception e)
		{

			String codError = Constants.RESOURCE_ID + Util.getCodigoErrorByDate();

			response.setMensaje("No ha sido posible revisar el token");
			System.out.println(e.getMessage());
			LOGGER.error(codError, e);
		}

		return response;
	}
}
