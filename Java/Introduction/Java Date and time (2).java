import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/*
 * The Calendar class is an abstract class that provides methods for converting between a 
 * specific instant in time and a set of calendar fields such as YEAR, MONTH, DAY_OF_MONTH, HOUR, and so on,
 * and for manipulating the calendar fields, such as getting the date of the next week.
 * You are given a date. Your task is to find what the day is on that date.
 */


public class Java_Date_And_Time {

	public static void main(String[] args){
		 Scanner in = new Scanner(System.in);
	        String month = in.next();
	        String day = in.next();
	        String year = in.next();
		
	        String dateString = String.format("%d-%d-%d", Integer.valueOf(year), Integer.valueOf(month), Integer.valueOf(day));
	        Date date = null;
			try {
				date = new SimpleDateFormat("yyyy-M-d").parse(dateString);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	        // Then get the day of week from the Date based on specific locale.
	        String dayOfWeek = new SimpleDateFormat("EEEE", Locale.ENGLISH).format(date);

	        System.out.println(dayOfWeek.toUpperCase()); // Friday
	
		
	        in.close();
	
		
		
	}//main
	
	
	
	
	
}//Java_Date_and_Time
