package pe.com.tintegro.sic.oauth2.dto.response;

public class OAuthErrorResponse
{
	private String error;
	private String descripcionError;

	public OAuthErrorResponse(){
		
	}
	
	public OAuthErrorResponse(String error, String descripcionError)
	{

		this.error = error;
		this.descripcionError = descripcionError;
	}

	public String getDescripcionError()
	{
		return descripcionError;
	}

	public String getError()
	{
		return error;
	}
}
