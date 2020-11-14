package api;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Objects;

class Person{}

public class Ex03 {
	
	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = null;
		
		System.out.println(Objects.isNull(p1));
		System.out.println(Objects.isNull(p2));
		System.out.println(Objects.nonNull(p1));
		
		GregorianCalendar cal = new GregorianCalendar();
		
		System.out.println(cal.getTime());
		System.out.println(cal.getWeekYear());
		System.out.println(cal.getTimeZone());
		
		Date date = new Date();
		
		System.out.println(date.getDay());
		System.out.println(date.getDate());
		
	}

}
