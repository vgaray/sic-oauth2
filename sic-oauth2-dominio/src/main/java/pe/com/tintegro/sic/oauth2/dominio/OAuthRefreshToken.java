package pe.com.tintegro.sic.oauth2.dominio;

import java.io.Serializable;

public class OAuthRefreshToken implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String tokenId;
	private String token;
	private String authentication;

	public String getTokenId()
	{
		return tokenId;
	}

	public void setTokenId(String tokenId)
	{
		this.tokenId = tokenId;
	}

	public String getToken()
	{
		return token;
	}

	public void setToken(String token)
	{
		this.token = token;
	}

	public String getAuthentication()
	{
		return authentication;
	}

	public void setAuthentication(String authentication)
	{
		this.authentication = authentication;
	}

}
