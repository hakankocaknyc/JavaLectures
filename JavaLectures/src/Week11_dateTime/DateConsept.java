package Week11_dateTime;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class DateConsept {

	public static void main(String[] args) {
		

		LocalDate today = LocalDate.now();
		System.out.println("Today's date : " + today);
		System.out.println("Tomorrow's date :" + today.plusDays(1));
		System.out.println("Yesterday's date :" + today.minusDays(1));
		System.out.println("date after 1 week   :" + today.plusWeeks(1));
		
		
		// Length of the year 
		
		System.out.printf(" %s days in  %s\n", today.lengthOfYear(),today.getYear()); // printf  f var dikkat
		
		System.out.println(today.lengthOfYear() );
		System.out.println(today.minusYears(3).lengthOfYear());

		
			// Is leap year ? demek subat ayinin 29 gun olmasi demek
		System.out.printf("%s is leao year ? %s",today.get(ChronoField.YEAR),today .isLeapYear());
		
		
	}

}
