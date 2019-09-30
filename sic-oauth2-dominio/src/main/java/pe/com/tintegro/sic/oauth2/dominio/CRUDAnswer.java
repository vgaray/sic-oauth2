package pe.com.tintegro.sic.oauth2.dominio;

import java.io.Serializable;

public class CRUDAnswer implements Serializable
{
	private static final long serialVersionUID = 1L;

	private Integer idAnswer;
	private String noAnswer;

	public final Integer getIdAnswer()
	{
		return idAnswer;
	}

	public final void setIdAnswer(Integer idAnswer)
	{
		this.idAnswer = idAnswer;
	}

	public final String getNoAnswer()
	{
		return noAnswer;
	}

	public final void setNoAnswer(String noAnswer)
	{
		this.noAnswer = noAnswer;
	}
}
