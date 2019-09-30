package pe.com.tintegro.sic.oauth2.dto.request;



public class ObtenerAccessTokenRequest
{

	private String username;
	private String password;
	private String autorization;

	
	//private List<String> scopes;
	private String clientId;
	private String clientSecret;

	public String getClientId()
	{
		return clientId;
	}

	public void setClientId(String clientId)
	{
		this.clientId = clientId;
	}

	public String getUsername()
	{
		return username;
	}

	public void setUsername(String username)
	{
		this.username = username;
	}

	public String getPassword()
	{
		return password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

	

	public String getAutorization()
	{
		return autorization;
	}

	public void setAutorization(String autorization)
	{
		this.autorization = autorization;
	}

	public String getClientSecret()
	{
		return clientSecret;
	}
	
	public void setClientSecret(String clientSecret)
	{
		this.clientSecret = clientSecret;
	}
}
