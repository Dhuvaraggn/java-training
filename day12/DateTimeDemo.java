package day12;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class DateTimeDemo {
	public static void main(String [] s) {
		LocalDateTime timenow=LocalDateTime.now();
		System.out.print(timenow);
		
		LocalDate dat1=timenow.toLocalDate();
		System.out.println(dat1);
		
		LocalTime tim1=timenow.toLocalTime();
		System.out.println(tim1);
		
		Month month=timenow.getMonth();
		System.out.print(timenow.getMonth());
		System.out.print(timenow.getDayOfMonth());
		System.out.print(timenow.getYear());
		
		LocalDateTime t1=timenow.withDayOfMonth(7).withYear(2012);
		System.out.println(t1);
		
		LocalDate t2=LocalDate.of(2014,Month.DECEMBER,12);
		System.out.println(t2);
		
		LocalTime t3=LocalTime.of(12, 12);
		System.out.print(t3);
		
		LocalTime t4=LocalTime.parse("20:12:12");
		System.out.println(t4);
		
		LocalDate today=LocalDate.now();
		System.out.println(today);
		
		LocalDate nw=today.plus(1,ChronoUnit.WEEKS);
		System.out.println(nw);
		
		LocalDate nm=today.plus(1,ChronoUnit.MONTHS);
		System.out.println(nm);
		LocalDate ny=today.plus(2,ChronoUnit.YEARS);
		System.out.println(ny);
		
	}
}
