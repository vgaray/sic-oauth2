package pe.com.tintegro.sic.oauth2.dao;

import java.util.List;

import pe.com.tintegro.sic.oauth2.dominio.OAuthApprovals;



public interface OAuthApprovalsDAO
{

	public List<OAuthApprovals> obtenerApprovals();

	public OAuthApprovals findByPK(Long userid);

	public void actualizarOAuthApprovals(OAuthApprovals oauthApprovals);

	public void eliminarOAuthApprovals(OAuthApprovals oauthApprovals);

	public void insertarOAuthApprovals(OAuthApprovals oauthApprovals);
}
