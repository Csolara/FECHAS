package Controladores;

import java.time.LocalDateTime;

public class Inicio {

	public static void main(String[] arg) {
		
		System.out.println("Dia: " + LocalDateTime.now().getDayOfMonth());
		System.out.println("Mes: " + LocalDateTime.now().getMonth());
		System.out.println("Año: " + LocalDateTime.now().getYear());
		System.out.println("Hora: " + LocalDateTime.now().getHour());	
		System.out.println("Minutos: " + LocalDateTime.now().getMinute());
		System.out.println("Segundos: " + LocalDateTime.now().getSecond());
		System.out.println("Dia de la semana: " + LocalDateTime.now().getDayOfWeek());
		System.out.println("Dia del año: " + LocalDateTime.now().getDayOfYear());
		
	}
}
