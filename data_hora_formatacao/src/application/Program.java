package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {
		
		LocalDate d04 = LocalDate.parse("2023-04-10");
		LocalDateTime d05 = LocalDateTime.parse("2023-04-10T01:30:26");
		Instant d06 = Instant.parse("2023-04-10T01:30:26Z");
		
		//https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatterBuilder.html
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm");
		//Pega o fuso horário do Usuário
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm").withZone(ZoneId.systemDefault());
		DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
		
		
		
		System.out.println("d04: " + d04.format(fmt1));
		System.out.println("d04: " + fmt1.format(d04));		
		System.out.println("d04: " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyy")));
		
		System.out.println("d05: " + d05.format(fmt1));
		System.out.println("d05: " + d05.format(fmt2));
		System.out.println("d05: " + d05.format(fmt4));
		
		System.out.println("d06: " + fmt3.format(d06));
		
	}

}
