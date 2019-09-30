package pe.com.tintegro.sic.oauth2.dto.response;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

//import oauth.dominio.util.JsonDateSerializer;



//import com.fasterxml.jackson.annotation.JsonFormat;
//import com.fasterxml.jackson.databind.annotation.*;

public class CheckTokenResponse implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String aud;
	
//	@JsonFormat
//    (shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss", timezone="America/Lima")
	private Integer estado;
	
	private Date expiration;
	private String username;
	private List<String> authorities;
	private String clientId;
	private List<String> scope;

	private String mensaje;
	
	public String getAud()
	{
		return aud;
	}

	public void setAud(String aud)
	{
		this.aud = aud;
	}

//	@JsonSerialize(using=JsonDateSerializer.class)
	public Date getExpiration()
	{
		return expiration;
	}

	public void setExpiration(Date expiration)
	{
		this.expiration = expiration;
	}

	public String getUsername()
	{
		return username;
	}

	public void setUsername(String username)
	{
		this.username = username;
	}

	public List<String> getAuthorities()
	{
		return authorities;
	}

	public void setAuthorities(List<String> authorities)
	{
		this.authorities = authorities;
	}

	public String getClientId()
	{
		return clientId;
	}

	public void setClientId(String clientId)
	{
		this.clientId = clientId;
	}

	public List<String> getScope()
	{
		return scope;
	}

	public void setScope(List<String> scope)
	{
		this.scope = scope;
	}

	
	public String getMensaje()
	{
		return mensaje;
	}
	
	public void setMensaje(String mensaje)
	{
		this.mensaje = mensaje;
	}
	
	public Integer getEstado()
	{
		return estado;
	}
	
	public void setEstado(Integer estado)
	{
		this.estado = estado;
	}

	
}
