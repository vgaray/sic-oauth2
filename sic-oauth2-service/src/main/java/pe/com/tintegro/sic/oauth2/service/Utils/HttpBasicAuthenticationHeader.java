package pe.com.tintegro.sic.oauth2.service.Utils;

import org.apache.commons.codec.binary.Base64;

public class HttpBasicAuthenticationHeader
{
	public static String[] decode(final String encodedString)
	{
		final byte[] decodedBytes = Base64.decodeBase64(encodedString.getBytes());
		final String pair = new String(decodedBytes);
		final String[] userDetails = pair.split(":", 2);
		return userDetails;
	}

	public static String createEncodedText(final String username, final String password)
	{
		final String pair = username + ":" + password;
		final byte[] encodedBytes = Base64.encodeBase64(pair.getBytes());
		return new String(encodedBytes);
	}
}
