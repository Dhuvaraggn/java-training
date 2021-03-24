package daytwelve;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class Assignment {
	public static void main(String [] args) {
		Delivery d=new Delivery(LocalDateTime.now().withMonth(12).withDayOfMonth(31).withYear(2020),10000,60,8);
		System.out.print(d.calcDuration());
	}
}
class Delivery
{
	LocalDateTime started;
	int Distance;
	int TravelSpeed;
	int NoofHoursWorking;
	public Delivery(LocalDateTime started,int d,int t,int n) {
		this.started=started;
		this.Distance=d;
		this.TravelSpeed=t;
		this.NoofHoursWorking=n;
	}
	public static boolean checkleave(LocalDateTime d)
	{
		holiday h=holiday.aug15;
		holiday[] hv=holiday.values();
		if(d.getDayOfWeek()==DayOfWeek.SUNDAY) {
			System.out.println(d);
			d=LocalDateTime.now().plus(1,ChronoUnit.DAYS);
			return true;
		}
		else {
			for(holiday hi:hv) {
				Month month=hi.date.getMonth();
				int day=hi.date.getDayOfMonth();
				if(month==d.getMonth()&&day==d.getDayOfMonth()) {
					System.out.println(hi.date);
					return true;
				}
			}
		}
		return false;
	}
	public LocalDateTime calcDuration() {
		int timereq=this.Distance/this.TravelSpeed;
		int noofdays=timereq/this.NoofHoursWorking;
		int count=0;
		LocalDateTime d=this.started;
		//if(this.started<this.started.withHour(18))
		//System.out.print(LocalDateTime.now().getDayOfWeek());
		
		holiday h=holiday.jan1;
		int l=0;
		while(noofdays!=count){
			if(checkleave(d)) {
				
				l++;
			}
			else {
			count++;}
			d=d.plus(1,ChronoUnit.DAYS);
		}
		System.out.println(l+" "+count);
		LocalDateTime day=LocalDateTime.now().plus((noofdays+l+1),ChronoUnit.DAYS);
		return day;
		}
	
	
}
enum holiday
{jan1(LocalDateTime.now().withMonth(1).withDayOfMonth(1))
	,jan26(LocalDateTime.now().withMonth(1).withDayOfMonth(26))
			,aug15(LocalDateTime.now().withMonth(8).withDayOfMonth(15)),
			oct2(LocalDateTime.now().withMonth(10).withDayOfMonth(2));
	LocalDateTime date;
	holiday(LocalDateTime d){
		date=d;
	}
	
}