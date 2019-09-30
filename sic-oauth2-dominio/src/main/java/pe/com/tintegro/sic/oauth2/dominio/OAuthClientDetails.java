package pe.com.tintegro.sic.oauth2.dominio;

import java.io.Serializable;

public class OAuthClientDetails implements Serializable
{
	private static final long serialVersionUID = 1L;

	private String noClientID;
	private String noClient;
	private String noIDsResources;
	private String noClientSecret;
	private String noScope;
	private String noAuthorizedGrantTypes;
	private String noWebServerRedirectURI;
	private String noAuthorities;
	private Integer noAccessTokenValidity;
	private Integer noRefreshAccessTokenValidity;
	private String noAditionalInformation;
	private String noAutoApprove;

	public String getNoClientID()
	{
		return noClientID;
	}

	public void setNoClientID(String noClientID)
	{
		this.noClientID = noClientID;
	}

	public String getNoClient()
	{
		return noClient;
	}

	public void setNoClient(String noClient)
	{
		this.noClient = noClient;
	}

	public String getNoIDsResources()
	{
		return noIDsResources;
	}

	public void setNoIDsResources(String noIDsResources)
	{
		this.noIDsResources = noIDsResources;
	}

	public String getNoClientSecret()
	{
		return noClientSecret;
	}

	public void setNoClientSecret(String noClientSecret)
	{
		this.noClientSecret = noClientSecret;
	}

	public String getNoScope()
	{
		return noScope;
	}

	public void setNoScope(String noScope)
	{
		this.noScope = noScope;
	}

	public String getNoAuthorizedGrantTypes()
	{
		return noAuthorizedGrantTypes;
	}

	public void setNoAuthorizedGrantTypes(String noAuthorizedGrantTypes)
	{
		this.noAuthorizedGrantTypes = noAuthorizedGrantTypes;
	}

	public String getNoWebServerRedirectURI()
	{
		return noWebServerRedirectURI;
	}

	public void setNoWebServerRedirectURI(String noWebServerRedirectURI)
	{
		this.noWebServerRedirectURI = noWebServerRedirectURI;
	}

	public String getNoAuthorities()
	{
		return noAuthorities;
	}

	public void setNoAuthorities(String noAuthorities)
	{
		this.noAuthorities = noAuthorities;
	}

	public Integer getNoAccessTokenValidity()
	{
		return noAccessTokenValidity;
	}

	public void setNoAccessTokenValidity(Integer noAccessTokenValidity)
	{
		this.noAccessTokenValidity = noAccessTokenValidity;
	}

	public Integer getNoRefreshAccessTokenValidity()
	{
		return noRefreshAccessTokenValidity;
	}

	public void setNoRefreshAccessTokenValidity(Integer noRefreshAccessTokenValidity)
	{
		this.noRefreshAccessTokenValidity = noRefreshAccessTokenValidity;
	}

	public String getNoAditionalInformation()
	{
		return noAditionalInformation;
	}

	public void setNoAditionalInformation(String noAditionalInformation)
	{
		this.noAditionalInformation = noAditionalInformation;
	}

	public String getNoAutoApprove()
	{
		return noAutoApprove;
	}

	public void setNoAutoApprove(String noAutoApprove)
	{
		this.noAutoApprove = noAutoApprove;
	}
}
