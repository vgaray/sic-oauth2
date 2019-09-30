package pe.com.tintegro.sic.oauth2.dto.response;

public class ResponseBase
{
	private Integer estado;
	private String mensaje;
	private String codError;

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

	public String getCodError()
	{
		return codError;
	}

	public void setCodError(String codError)
	{
		this.codError = codError;
	}

}
