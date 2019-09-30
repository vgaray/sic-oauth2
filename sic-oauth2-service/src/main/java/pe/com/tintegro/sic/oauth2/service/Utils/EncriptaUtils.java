package pe.com.tintegro.sic.oauth2.service.Utils;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.nio.file.Files;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.PublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.RSAPublicKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Arrays;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Base64;



public class EncriptaUtils
{

	private static final String ALGORITHM = "DESede";
	private static final String SECRET_KEY = "SiCKeyGenerat0r";

	private static Cipher cipher;

	public EncriptaUtils()
	{

		// Inicializaci�n de la llave
		try
		{
			cipher = Cipher.getInstance("RSA");
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

	public static String encriptar(String texto)
	{

		String base64EncryptedString = "";

		try
		{

			MessageDigest md = MessageDigest.getInstance("MD5");
			byte[] digestOfPassword = md.digest(SECRET_KEY.getBytes("utf-8"));
			byte[] keyBytes = Arrays.copyOf(digestOfPassword, 24);

			SecretKey key = new SecretKeySpec(keyBytes, ALGORITHM);
			Cipher cipher = Cipher.getInstance(ALGORITHM);
			cipher.init(Cipher.ENCRYPT_MODE, key);

			byte[] plainTextBytes = texto.getBytes("utf-8");
			byte[] buf = cipher.doFinal(plainTextBytes);
			byte[] base64Bytes = Base64.encodeBase64(buf);
			base64EncryptedString = new String(base64Bytes);

		}
		catch (Exception ex)
		{

		}
		return base64EncryptedString;
	}

	public static String desencriptar(String textoEncriptado) throws Exception
	{

		String base64EncryptedString = "";

		try
		{
			byte[] message = Base64.decodeBase64(textoEncriptado.getBytes("utf-8"));
			MessageDigest md = MessageDigest.getInstance("MD5");
			byte[] digestOfPassword = md.digest(SECRET_KEY.getBytes("utf-8"));
			byte[] keyBytes = Arrays.copyOf(digestOfPassword, 24);
			SecretKey key = new SecretKeySpec(keyBytes, "DESede");

			Cipher decipher = Cipher.getInstance("DESede");
			decipher.init(Cipher.DECRYPT_MODE, key);

			byte[] plainText = decipher.doFinal(message);

			base64EncryptedString = new String(plainText, "UTF-8");

		}
		catch (Exception ex)
		{

		}
		return base64EncryptedString;
	}

	// uso de Llaves encriptadoras

	

}
