package pe.com.tintegro.sic.oauth2.dto.response;

//import java.util.Date;

public class OAuthAccessTokenResponse extends OAuthErrorResponse
{
	private Integer estado;
	private String accessToken;
	private String tokenType;
	private Integer expiresIn;
	private String refreshToken;
	private String nombreUsuario;
	
	private String mensaje;
	
	public OAuthAccessTokenResponse()
	{

	}

	public String getAccessToken()
	{
		return accessToken;
	}

	public void setAccessToken(String accessToken)
	{
		this.accessToken = accessToken;
	}

	public String getTokenType()
	{
		return tokenType;
	}

	public void setTokenType(String tokenType)
	{
		this.tokenType = tokenType;
	}

	public Integer getExpiresIn()
	{
		return expiresIn;
	}

	public void setExpiresIn(Integer expiresIn)
	{
		this.expiresIn = expiresIn;
	}

	public String getRefreshToken()
	{
		return refreshToken;
	}

	public void setRefreshToken(String refreshToken)
	{
		this.refreshToken = refreshToken;
	}

	public OAuthAccessTokenResponse(String error, String descripcionError)
	{

		super(error, descripcionError);
	}

	public String getNombreUsuario()
	{
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario)
	{
		this.nombreUsuario = nombreUsuario;
	}

	
	
	
	

	public Integer getEstado()
	{
		return estado;
	}

	public void setEstado(Integer estado)
	{
		this.estado = estado;
	}

	public String getMensaje()
	{
		return mensaje;
	}

	public void setMensaje(String mensaje)
	{
		this.mensaje = mensaje;
	}


	
}
