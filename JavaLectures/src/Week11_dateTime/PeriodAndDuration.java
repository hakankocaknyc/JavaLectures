package Week11_dateTime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodAndDuration {

	public static void main(String[] args) {
		
// This example demonstrates duration between time and date
		
		LocalDate initialDate = LocalDate.now();
		
	
		LocalDate finalDate = initialDate .plus(Period.ofWeeks(4) );	// number* 7 % 30 
		 int days = Period.between(initialDate, finalDate).getDays();
		 System.out.println(days);
		 
		 long between = ChronoUnit.DAYS.between(initialDate, finalDate);
		 System.out.println("duration between the two time :" + between);
		 
		 
		 LocalTime initialTime = LocalTime.now();
		 
		  LocalTime  finalTime = initialTime.plus(Duration.ofSeconds(36));
		  
		  long second = Duration.between(initialTime, finalTime).getSeconds();
		  
		  System.out.println("duration between the two time :" + second);
		 
		  long between2 = ChronoUnit.SECONDS.between(initialTime, finalTime);
		  
		  System.out.println("duration between the two time :" + between2);
		 
		 
		 
	}

}
