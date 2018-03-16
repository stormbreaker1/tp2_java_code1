package abcd;

import java.util.Calendar;

public class Calender_tom1 {
	public static void main(String[] args)
	{
		Calendar cal = Calendar.getInstance();
		
		System.out.printf("Today's Date is " + (cal.get(Calendar.MONTH)+1) + "-" + cal.get(Calendar.DATE) + "-" + cal.get(Calendar.YEAR));
		
	}
}
