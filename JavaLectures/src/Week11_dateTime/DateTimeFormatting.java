package Week11_dateTime;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatting {

	public static void main(String[] args) {
		 
		try {
			// Date formatter example
			LocalDate date = LocalDate.of(2020, 12, 290);
			System.out.println(date);
			
			String dateStr = date.format(DateTimeFormatter.ofPattern("MMM dd yy Q G"));
			System.out.println(dateStr);
			
			// Time formatter example
			LocalTime time = LocalTime.now();
			
			System.out.println(time);
			String timeStr = time.format(DateTimeFormatter.ofPattern("hh:mm a"));
			System.out.println(timeStr);
			
		} catch (DateTimeException e) {
			 System.out.println("Fail to format");
		}
		
		
	}

}
