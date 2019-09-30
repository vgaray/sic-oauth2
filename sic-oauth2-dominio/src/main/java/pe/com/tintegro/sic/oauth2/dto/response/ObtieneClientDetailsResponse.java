package pe.com.tintegro.sic.oauth2.dto.response;

import pe.com.tintegro.sic.oauth2.dominio.OAuthClientDetails;



public class ObtieneClientDetailsResponse
{
	private OAuthClientDetails clientDetails;

	public final OAuthClientDetails getClientDetails()
	{
		return clientDetails;
	}

	public final void setClientDetails(OAuthClientDetails clientDetails)
	{
		this.clientDetails = clientDetails;
	}
}
