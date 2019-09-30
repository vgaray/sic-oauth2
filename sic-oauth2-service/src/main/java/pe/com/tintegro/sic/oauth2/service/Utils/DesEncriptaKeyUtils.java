package pe.com.tintegro.sic.oauth2.service.Utils;

import java.io.File;
import java.io.InputStream;
import java.nio.file.Files;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

import javax.crypto.Cipher;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

@Component("desencriptaUtils")
public class DesEncriptaKeyUtils
{
	private Cipher cipher;

	@Value("classpath:publicKey")
	private Resource publicKey;
	
	public DesEncriptaKeyUtils()
	{

		// Inicialización de la llave
		try
		{
			cipher = Cipher.getInstance("RSA");
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	public  PublicKey getPublic(String filename) throws Exception
	{
		InputStream inputStream = publicKey.getInputStream();
		File plantillaTemp = File.createTempFile("test", "");
		
		try {
			FileUtils.copyInputStreamToFile(inputStream, plantillaTemp);
		} finally {
			IOUtils.closeQuietly(inputStream);
		}

		byte[] keyBytes = Files.readAllBytes(plantillaTemp.toPath());
		X509EncodedKeySpec spec = new X509EncodedKeySpec(keyBytes);
		KeyFactory kf = KeyFactory.getInstance("RSA");
		return kf.generatePublic(spec);
	}

	public String textoDesEncriptado(String msg) throws Exception
	{
		// String mensajeDesencriptado = "";

		PublicKey publicKey = getPublic("publicKey");

		cipher.init(Cipher.DECRYPT_MODE, publicKey);

		return new String(cipher.doFinal(Base64.decodeBase64(msg)), "UTF-8");
	}
	
}
