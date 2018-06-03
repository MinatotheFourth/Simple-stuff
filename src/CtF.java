import java.util.Scanner;

public class CtF 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int minutes, minutesRem, hours, days, years;
		
		System.out.println("Enter a number of minutes");
		minutes = input.nextInt();

		years = minutes / 525600;
		minutesRem = minutes % 525600;
		days = minutesRem / 1440;
		
		System.out.println(minutes + " minutes is around " + years + " years and " + days + " days.");

	}

}
