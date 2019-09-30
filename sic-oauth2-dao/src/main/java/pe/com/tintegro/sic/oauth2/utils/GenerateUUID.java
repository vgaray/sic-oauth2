package pe.com.tintegro.sic.oauth2.utils;

import java.util.UUID;

public class GenerateUUID
{
	public static String generarToken()
	{
		UUID idOne = UUID.randomUUID();
		return String.valueOf(idOne);

	}
}
