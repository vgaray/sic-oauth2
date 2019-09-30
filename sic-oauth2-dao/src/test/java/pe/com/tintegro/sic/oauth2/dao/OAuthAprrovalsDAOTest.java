package pe.com.tintegro.sic.oauth2.dao;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import pe.com.tintegro.sic.oauth2.config.ApplicationContextDaoConfig;
import pe.com.tintegro.sic.oauth2.dominio.OAuthApprovals;




@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={ApplicationContextDaoConfig.class})
public class OAuthAprrovalsDAOTest
{
	@Autowired
	OAuthApprovalsDAO oauthaprrovalsDAO;
	
	@Test
	public void testInsertarOAuthAprobaciones(){
		OAuthApprovals oauth=new OAuthApprovals();
		oauth.setClientId("a21i2833w");
		oauth.setExpiresAt(new Date());
		oauth.setLastModifiedAt(new Date());
		oauth.setScope("asdo1");
		oauth.setStatus("up12");
		oauth.setUserId("awdawdas");
		oauthaprrovalsDAO.insertarOAuthApprovals(oauth);
		
	}
}
