package pe.com.tintegro.sic.oauth2.mapper;

import java.util.List;

import pe.com.tintegro.sic.oauth2.dominio.OAuthApprovals;



public interface OAuthApprovalsMapper
{
	public List<OAuthApprovals> getAll();

	public OAuthApprovals findByPK(Integer userId);

	public void update(OAuthApprovals oauthApprovals);

	public void remove(OAuthApprovals oauthApprovals);

	public void insert(OAuthApprovals oauthApprovals);
}
