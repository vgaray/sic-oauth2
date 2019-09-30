package pe.com.tintegro.sic.oauth2.dominio;

import java.io.Serializable;

public class Role implements Serializable
{
	private static final long serialVersionUID = -6256292942291243692L;

	private Integer idRole;
	private String noRol;
	private String noDescrip;
	private Boolean ilActivo;
	public Integer getIdRole()
	{
		return idRole;
	}
	public void setIdRole(Integer idRole)
	{
		this.idRole = idRole;
	}
	public String getNoRol()
	{
		return noRol;
	}
	public void setNoRol(String noRol)
	{
		this.noRol = noRol;
	}
	public String getNoDescrip()
	{
		return noDescrip;
	}
	public void setNoDescrip(String noDescrip)
	{
		this.noDescrip = noDescrip;
	}
	public Boolean getIlActivo()
	{
		return ilActivo;
	}
	public void setIlActivo(Boolean ilActivo)
	{
		this.ilActivo = ilActivo;
	}
}
