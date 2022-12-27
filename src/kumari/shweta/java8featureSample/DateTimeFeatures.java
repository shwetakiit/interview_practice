package kumari.shweta.java8featureSample;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
public class DateTimeFeatures {
	
	
	public static void main(String[] args) {
		
		LocalDateTime currentDateTime= LocalDateTime.now();
		System.out.println("Current time is "+currentDateTime);
		
		System.out.println(currentDateTime.toLocalDate()+" "+currentDateTime.toLocalTime());
		
		LocalDateTime date2=currentDateTime.withDayOfYear(362); 
		/*
		 * here it will change date 28 and 12 month becoz day of year is 362 but time
		 * will same as time of currentDateTime
		 */
		System.out.println("date2 is "+date2);
		
		/* Suppose we want to Change the time also then below code  */
		
		LocalDateTime date3=currentDateTime.withDayOfYear(362).withHour(3);
		System.out.println("date3 is "+date3);
		
		//LocalDate class API 
		
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);
		
		LocalDate date4 = LocalDate.of(2014, Month.DECEMBER, 12);
		System.out.println(date4);
		
		LocalTime date5= LocalTime.of(22, 15);
		System.out.println("date5 is  "+date5);
		
	    LocalTime date6 = LocalTime.parse("20:15:30");
	    System.out.println("Date is "+date6);
	    
	    
	    //Zondate time API
	    ZonedDateTime zonedDateTime= ZonedDateTime.now();
	    System.out.println("current time with zone"+zonedDateTime);
	     ZoneId id = ZoneId.of("Europe/Paris");
	     System.out.println("Zone id is "+id);
	     ZoneId currentId=ZoneId.systemDefault();
	     System.out.println("Current zone id is "+currentId);
	     
	     //Period 
	     Period period = Period.ofYears(2024);
	     System.out.println("Period of year is"+period);
	     
	   Period period1 =Period.ofDays(10);
	   System.out.println("period day is "+period1);
	    
		
		
	}
	

}
