package Week11_dateTime;

import java.time.LocalTime;

public class TimeConsept {

	public static void main(String[] args) {
		

		LocalTime time = LocalTime.now();
		System.out.println("Now time is :" + time);
		
		// Add an hour to our current time
		
		System.out.println(" Meeting in next hour :" +time.plusHours(1));
	}

}
