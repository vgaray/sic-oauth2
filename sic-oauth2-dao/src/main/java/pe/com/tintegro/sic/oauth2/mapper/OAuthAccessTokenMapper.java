package pe.com.tintegro.sic.oauth2.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import pe.com.tintegro.sic.oauth2.dominio.CRUDAnswer;



public interface OAuthAccessTokenMapper
{
	public List<CRUDAnswer> registrarAccessToken(@Param("userName") String username,
			@Param("token") String token,@Param("refreshToken") String refreshToken,
			@Param("authentication") byte[] authentication,@Param("authenticationId") String authenticationId,@Param("clientId") String clientId);
	
   public List<CRUDAnswer> obtenerAccessTokenByClientId(@Param("clientID") String clientID, @Param("token") String token, @Param("user_name") String username);
  
   public List<CRUDAnswer> actualizarFechaUsoToken (@Param("token") String token);
   
   
}
