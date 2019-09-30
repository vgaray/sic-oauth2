package pe.com.tintegro.sic.oauth2.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import pe.com.tintegro.sic.oauth2.dao.OAuthApprovalsDAO;
import pe.com.tintegro.sic.oauth2.dominio.OAuthApprovals;
import pe.com.tintegro.sic.oauth2.mapper.OAuthApprovalsMapper;



@Repository("oauthApprovalsDAO")
public class OAuthApprovalsDAOImpl implements OAuthApprovalsDAO
{
	
	@Autowired
	private OAuthApprovalsMapper oauthapprovalsMapper;
	

	public List<OAuthApprovals> obtenerApprovals()
	{
		// TODO Auto-generated method stub
		return null;
	}

	public OAuthApprovals findByPK(Long userid)
	{
		// TODO Auto-generated method stub
		return null;
	}

	public void actualizarOAuthApprovals(OAuthApprovals oauthApprovals)
	{
		// TODO Auto-generated method stub

	}

	public void eliminarOAuthApprovals(OAuthApprovals oauthApprovals)
	{
		// TODO Auto-generated method stub

	}

	public void insertarOAuthApprovals(OAuthApprovals oauthApprovals)
	{
		oauthapprovalsMapper.insert(oauthApprovals);
	}

}
