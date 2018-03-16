package abcd;

// importing the date class
import java.util.Date;
import java.util.Calendar;

public class Date_time {
	public static void main(String[] args)
	{
		// using the instance of date class
		Date date = new Date();
		
		// printing the date...
		System.out.println("Today's date and time are "+date);
		
		// getting instance of 
		// getInstance() method returns the Calendar object whose calendar fields 
		 // have been initialized with current date and time.
		Calendar cal = Calendar.getInstance();
		
		System.out.println("Current Month is "+ (cal.get(Calendar.MONTH)+1));
		System.out.println("Present Day Date is "+ (cal.get(Calendar.DATE)));
		System.out.println("Present Year is "+ (cal.get(Calendar.YEAR)));
		
	}
}
