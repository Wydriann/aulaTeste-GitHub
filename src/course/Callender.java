package course;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Callender {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		
		System.out.println(sdf.format(d));
		
		Calendar cal = Calendar.getInstance();
			
		cal.setTime(d);
		cal.add(Calendar.HOUR_OF_DAY, 4); // Adiciona 4 horas á data
		
		d = cal.getTime();
		
		System.out.println(sdf.format(d));
		
		System.out.println("-----------------------------");
		
		int minutes = cal.get(Calendar.MINUTE);
		
		System.out.println("Minutes: " + minutes);
		
		int month = 1 + cal.get(Calendar.MONTH); // Os meses começam em 0 assim como o vetor, pra imprimir o mes certo do calendario, se adiciona 1
		
		System.out.println("Month: " + month);
		
		
		
		
	}

}
