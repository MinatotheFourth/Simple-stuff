import java.util.Scanner;

public class CtF 
{

	public static void main(String[] args) 
	{
		//I declared a scanner variable and longs just in case someone put in a big input
		Scanner input = new Scanner(System.in);
		long minutes, minutesRem, hours, days, years;
		
		//Asks the user to enter the minutes in
		System.out.println("Enter a number of minutes");
		minutes = input.nextLong();

		//Calculations for years, days, and remaining minutes to toss out
		years = minutes / 525600;
		minutesRem = minutes % 525600;
		days = minutesRem / 1440;
		
		//Results!
		System.out.println(minutes + " minutes is around " + years + " years and " + days + " days.");

	}

}
