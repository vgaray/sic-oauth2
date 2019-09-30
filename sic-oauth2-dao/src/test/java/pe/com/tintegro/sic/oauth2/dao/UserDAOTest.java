package pe.com.tintegro.sic.oauth2.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import pe.com.tintegro.sic.oauth2.config.ApplicationContextDaoConfig;
import pe.com.tintegro.sic.oauth2.dto.request.ActualizaNuevaContrasenaRequest;
import pe.com.tintegro.sic.oauth2.dto.request.ActualizaUsuarioOauthRequest;
import pe.com.tintegro.sic.oauth2.dto.request.ConfirmarCambioContrasenaRequest;
import pe.com.tintegro.sic.oauth2.dto.request.InsertaUsuarioOauthRequest;
import pe.com.tintegro.sic.oauth2.dto.response.ActualizaNuevaContrasenaResponse;
import pe.com.tintegro.sic.oauth2.dto.response.ActualizaUsuarioResponse;
import pe.com.tintegro.sic.oauth2.dto.response.ConfirmarCambioContrasenaResponse;
import pe.com.tintegro.sic.oauth2.dto.response.InsertaUsuarioResponse;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { ApplicationContextDaoConfig.class })
public class UserDAOTest
{
	@Autowired
	private UserDAO userDAO;

	// @Test
	public void testIngresarUsuario()
	{

		InsertaUsuarioOauthRequest request = new InsertaUsuarioOauthRequest();
		request.setpNologin("user3");
		request.setpNoPassword("password3");
		request.setpNoNombres("nombre3");
		request.setpNoApellidos("apellidos3");
		request.setpNoEmail("ap3@gmail.com");
		request.setpNoProfe("cargador3");
		request.setpNoCodUsuarioCreador("cli");
		request.setpTokeNCreador("c049dc81-0cfa-4c3f-a46b-e05e04f4919f");

		InsertaUsuarioResponse response = new InsertaUsuarioResponse();

		try
		{
			response = userDAO.insertarUsuarioDAO(request);

			System.out.println(response.getEstado());
			System.out.println(response.getMensaje());
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}

	}

	// @Test
	public void testActualizarUsuario()
	{
		ActualizaUsuarioOauthRequest request = new ActualizaUsuarioOauthRequest();
		request.setpNologin("user3");
		request.setpNoPassword("121231231");
		request.setpNoNombres("n2123123");
		request.setpNoApellidos("apellidoasdasds3");
		request.setpNoEmail("awdqwdap3@gmail.com");
		request.setpNoProfe("cargador455");
		request.setpNoCodUsuarioCreador("cli");
		request.setpTokeNCreador("c049dc81-0cfa-4c3f-a46b-e05e04f4919f");

		ActualizaUsuarioResponse response = new ActualizaUsuarioResponse();

		try
		{
			response = userDAO.actualizaUsuarioDAO(request);

			System.out.println(response.getEstado());
			System.out.println(response.getMensaje());
		}
		catch (Exception e)
		{
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

	//@Test
	public void actualizarContraseña()
	{
		ActualizaNuevaContrasenaRequest request=new ActualizaNuevaContrasenaRequest();
		request.setpNewPassword("4521267");
		request.setpCodUsuario("user3");
		request.setpToken("miasd");
		
		ActualizaNuevaContrasenaResponse response=new ActualizaNuevaContrasenaResponse();
		try
		{
			response = userDAO.actualizarNuevaContrasenaDAO(request);
			
			System.out.println(response.getEstado());
			System.out.println(response.getMensaje());
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void confirmarCambio()
	{
      ConfirmarCambioContrasenaRequest request=new ConfirmarCambioContrasenaRequest();
      request.setpCodUsuario("user3");
      request.setpToken("miasd");
      ConfirmarCambioContrasenaResponse response = new ConfirmarCambioContrasenaResponse();
      
      try
		{
			response = userDAO.confirmarCambioContrasenaDAO(request);
			
			System.out.println(response.getEstado());
			System.out.println(response.getMensaje());
		}
		catch (Exception e)
		{
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

}
