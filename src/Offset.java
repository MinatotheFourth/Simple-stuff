/*
 * This program will ask for the offset of the time-zone of the user's choice.
 * It will also display the user's desired time in military time or 24-hour format.
 */
import java.util.Scanner;

public class Offset 
{

	public static void main(String[] args)
	{
		//This declares a Scanner variable for offset input
		Scanner input = new Scanner (System.in);
		
		//Declare variables for total minutes, seconds, and hours along with the actual time. Also one for the offset variable
		long hours, minutes, seconds, milliseconds, offset, currentSecond, currentMinute, currentHour;
		String timeType;
		
		//Ask the user for the GMT Offset
		System.out.println("Enter a time-zone offset to GMT.");
		
		//Input the offset
		offset = input.nextInt();
		
		//Gets the current time in milliseconds
		milliseconds = System.currentTimeMillis();
		
		//Gets the total seconds and then the current seconds are in 60 second format
		seconds = milliseconds / 1000;
		currentSecond = seconds % 60;
		
		//Get the total minutes and current minutes are in a 60 minute format.
		minutes =  seconds / 60;
		currentMinute = minutes % 60;
		
		//Get the total hours along with the current hour in GMT military time
		hours = minutes / 60;
		currentHour = hours % 24;
		
		//Equation to get the current offset hour
		currentHour = currentHour + offset;
		
		if(currentHour < 23 && currentHour >= 12)
		{
			timeType = "PM";
			currentHour = currentHour % 12;
		
		}
		else
			timeType = "AM";
		
		//Outputs the time-zone offset to GMT.
		System.out.println("The time would be " + currentHour + ": " + currentMinute + ": " + currentSecond + " " + timeType);

	}

}
