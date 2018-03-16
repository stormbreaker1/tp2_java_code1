package abcd;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Date_time2 {
	public static void main(String[] args)
	{
		// Testing Date class 
		Date dt =  new Date();
		
		
		// toString() can be applied to object only.
		System.out.println("Today's date is:- " + dt.toString());
		
		System.out.println("");
		System.out.println("Date and Time in formatted manner...");
		
		// formatting the date
		SimpleDateFormat sdf = new SimpleDateFormat(" yyyy--MM--dd  hh:mm:ss ");
		System.out.println(sdf.format(dt));
		
		
	}
}
