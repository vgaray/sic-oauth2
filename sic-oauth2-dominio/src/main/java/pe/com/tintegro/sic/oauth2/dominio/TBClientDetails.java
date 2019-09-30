package pe.com.tintegro.sic.oauth2.dominio;

import java.io.Serializable;

public class TBClientDetails implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer idClientDetails;
	private String noClientId;
	private String noClient;
	private String noIdsResources;
	private String noClientSecret;
	private String noScope;
	private String noAuthorizedGrantTypes;
	private String noWebServerRedirectUri;
	private String noAuthorities;
	private Integer noAccessTokenValidity;
	private Integer noRefreshAccessTokenValidity;
	private String noAditionalInformation;
	private String noAutoapprove;

	public Integer getIdClientDetails()
	{
		return idClientDetails;
	}

	public void setIdClientDetails(Integer idClientDetails)
	{
		this.idClientDetails = idClientDetails;
	}

	public String getNoClientId()
	{
		return noClientId;
	}

	public void setNoClientId(String noClientId)
	{
		this.noClientId = noClientId;
	}

	public String getNoClient()
	{
		return noClient;
	}

	public void setNoClient(String noClient)
	{
		this.noClient = noClient;
	}

	public String getNoIdsResources()
	{
		return noIdsResources;
	}

	public void setNoIdsResources(String noIdsResources)
	{
		this.noIdsResources = noIdsResources;
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

	public String getNoWebServerRedirectUri()
	{
		return noWebServerRedirectUri;
	}

	public void setNoWebServerRedirectUri(String noWebServerRedirectUri)
	{
		this.noWebServerRedirectUri = noWebServerRedirectUri;
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

	public String getNoAutoapprove()
	{
		return noAutoapprove;
	}

	public void setNoAutoapprove(String noAutoapprove)
	{
		this.noAutoapprove = noAutoapprove;
	}

}
