package pe.com.tintegro.sic.oauth2.utils;

import java.util.Calendar;
import java.util.Date;

public class Fechas {
	public static Integer obtenerDiferencia(Date fechaAnterior, Date fechaActual) {

		Date fechaMayor = fechaActual;
		Date fechaMenor = fechaAnterior;

		long diferenciaMils = fechaMayor.getTime() - fechaMenor.getTime();
		long segundos = diferenciaMils / 1000;

		return Integer.parseInt(Long.toString(segundos));
	}

	public static Date aumentaFechaExpiracion(Date date, int aumento) {
		Calendar calendar = Calendar.getInstance();

		calendar.setTime(date); // Configuramos la fecha que se recibe
		calendar.add(Calendar.HOUR, aumento); // numero de horas a añadir, o
												// restar en caso de horas<0

		return calendar.getTime();
	}
}
