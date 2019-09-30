package pe.com.tintegro.sic.oauth2.dominio;

import java.io.Serializable;
import java.util.Date;

public class OAuthAccessToken implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String authenticationId;
	private String tokenId;
	private String token;
	private String clientId;
	private byte[] authentication;
	private String userName;
	private String refreshToken;
	private Date lastTimeUse;

	public String getAuthenticationId()
	{
		return authenticationId;
	}

	public void setAuthenticationId(String authenticationId)
	{
		this.authenticationId = authenticationId;
	}

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

	public String getClientId()
	{
		return clientId;
	}

	public void setClientId(String clientId)
	{
		this.clientId = clientId;
	}

	public byte[] getAuthentication()
	{
		return authentication;
	}

	public void setAuthentication(byte[] authentication)
	{
		this.authentication = authentication;
	}

	public String getUserName()
	{
		return userName;
	}

	public void setUserName(String userName)
	{
		this.userName = userName;
	}

	public String getRefreshToken()
	{
		return refreshToken;
	}

	public void setRefreshToken(String refreshToken)
	{
		this.refreshToken = refreshToken;
	}

	public Date getLastTimeUse()
	{
		return lastTimeUse;
	}

	public void setLastTimeUse(Date lastTimeUse)
	{
		this.lastTimeUse = lastTimeUse;
	}

}
