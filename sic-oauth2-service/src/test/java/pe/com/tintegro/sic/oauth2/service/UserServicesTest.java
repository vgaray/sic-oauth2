package pe.com.tintegro.sic.oauth2.service;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import pe.com.tintegro.sic.oauth2.config.ApplicationContextDaoConfig;
import pe.com.tintegro.sic.oauth2.service.Utils.DesEncriptaKeyUtils;
import pe.com.tintegro.sic.oauth2.service.Utils.EncriptaUtils;
import pe.com.tintegro.sic.oauth2.utils.Fechas;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { ApplicationContextDaoConfig.class })
public class UserServicesTest
{

	
	@Autowired
	DesEncriptaKeyUtils desencripta;
	
	//@Test
	public void testDesencripar(){
		 
		
		try
		{
		   String desen= desencripta.textoDesEncriptado("HwunK0/Zf5EXhg/+0NuqdWZgSv0bCOfKYu5F6PzVVsHqUwP5m82chK+pIeh7ofvebeg5CGX0mJZjp1SuUcF+BPC0YSX2OnNvgZ8d0f3RgW5uzuq+w+LoVUaObEO09U+/Qe28jyGRFAgLlH9ckTnj/S4T683mxzRam+bhlfbZ+AQ=");
			
			System.out.println("Resultado:   "+ desen);
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		
	}
	
	@Test
	public void testFechasDiferencias(){
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS");
		String dateInString = "2018-02-01 12:50:01.323";
		try
		{
			Date parsedDate = formatter.parse(dateInString);
			Date fecha2 = new Date();
			System.out.println(parsedDate);
			System.out.println(fecha2);
			Integer segundos= Fechas.obtenerDiferencia(parsedDate, fecha2);
			
			System.out.println("Son "+segundos+"  segundos");
		}
		catch (Exception e)
		{
			// TODO: handle exception
		}
		
	}
}
