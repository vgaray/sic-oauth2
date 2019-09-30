package pe.com.tintegro.sic.oauth2.dominio;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;


@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(value = JsonInclude.Include.NON_NULL)
public class User implements Serializable
{
	private static final long serialVersionUID = 8479335352408813278L;

	private String noLogin;
	private String noPassword;
	private String noNombre;
	private String noApellido;
	private String noEmail;
	private String noProfesion;
	private boolean ilActivo;
	private Date feCreacion;
	private boolean ilAccountNonExpired;
	private boolean ilCredentialsNonExpired;
	private boolean ilAccountNonLocked;

	

	public String getNoLogin()
	{
		return noLogin;
	}

	public void setNoLogin(String noLogin)
	{
		this.noLogin = noLogin;
	}

	public String getNoPassword()
	{
		return noPassword;
	}

	public void setNoPassword(String noPassword)
	{
		this.noPassword = noPassword;
	}

	public String getNoNombre()
	{
		return noNombre;
	}

	public void setNoNombre(String noNombre)
	{
		this.noNombre = noNombre;
	}

	public String getNoApellido()
	{
		return noApellido;
	}

	public void setNoApellido(String noApellido)
	{
		this.noApellido = noApellido;
	}

	public String getNoEmail()
	{
		return noEmail;
	}

	public void setNoEmail(String noEmail)
	{
		this.noEmail = noEmail;
	}

	public String getNoProfesion()
	{
		return noProfesion;
	}

	public void setNoProfesion(String noProfesion)
	{
		this.noProfesion = noProfesion;
	}

	public boolean isIlActivo()
	{
		return ilActivo;
	}

	public void setIlActivo(boolean ilActivo)
	{
		this.ilActivo = ilActivo;
	}

	public Date getFeCreacion()
	{
		return feCreacion;
	}

	public void setFeCreacion(Date feCreacion)
	{
		this.feCreacion = feCreacion;
	}

	public boolean isIlAccountNonExpired()
	{
		return ilAccountNonExpired;
	}

	public void setIlAccountNonExpired(boolean ilAccountNonExpired)
	{
		this.ilAccountNonExpired = ilAccountNonExpired;
	}

	public boolean isIlCredentialsNonExpired()
	{
		return ilCredentialsNonExpired;
	}

	public void setIlCredentialsNonExpired(boolean ilCredentialsNonExpired)
	{
		this.ilCredentialsNonExpired = ilCredentialsNonExpired;
	}

	public boolean isIlAccountNonLocked()
	{
		return ilAccountNonLocked;
	}

	public void setIlAccountNonLocked(boolean ilAccountNonLocked)
	{
		this.ilAccountNonLocked = ilAccountNonLocked;
	}
}
