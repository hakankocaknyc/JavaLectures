package Week11_dateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Set;

public class ZoneDateTimeTest {

	public static void main(String[] args) {
	 
		ZoneId zoneId = ZoneId.of("Asia/Tokyo");
//		
//		Set<String > availableZoneIds= ZoneId.getAvailableZoneIds();
//		for (String string : availableZoneIds) {
//			System.out.println(string);
//		}
//		
		ZonedDateTime zonedDateTime = ZonedDateTime.of(LocalDateTime.now(),zoneId);
		System.out.println(zonedDateTime);
				
				LocalDateTime localDateTime = LocalDateTime.of(2015, Month.FEBRUARY,20, 06, 30);
				System.out.println(localDateTime);
				
				ZoneOffset offset =ZoneOffset.of("+02:00");
				
				OffsetDateTime offsetDateTime = OffsetDateTime.of(localDateTime, offset);
				System.out.println(offsetDateTime);
				
	}

}
