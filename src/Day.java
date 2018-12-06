import java.util.Scanner;

public class Day 
{

	public static void main(String[] args) 
	{
		
	//Declaring an input variable via scanner
		Scanner input = new Scanner (System.in);
		int year, h, q, m, j, k; 
		/*h is the day of the week in integer form
		 * q is the day of the month variable
		 * m is the month variable
		 * j is the century variable
		 * k is the century's year variable
		 */
		
		//Asks for the year (e.g 2012)
		System.out.println("What's the year?");
		year = input.nextInt();
		
		//Asks for the month number (1 for January, 2 for February, etc)
		System.out.println("Enter the month as an integer (1 = January, 2 = February, etc)");
		m = input.nextInt();
		
		//The formula turns January and February to 13 and 14 respectively, and the year variable must be decreased by 1.So, this block converts them after input.
		if(m == 1)
		{
			m = 13;
			year = year - 1;
		}
		
		else if(m == 2)
		{
			m = 14;
			year = year - 1;
		}
		
		//Asks for the numerical day of the month
		System.out.println("Enter the day of the month.");
		q = input.nextInt();
		
		//Sets the century and the century's year
		j = year / 100;
		k = year % 100;
		
		//This formula is what gives the day's int value
		h = (q + ((26 * (m + 1)) / 10) + k + k / 4 + j / 4 + 5 * j) % 7;
		
		
		//This ultimately determines what day it was
		switch(h) //Begin Switch
		{
			case 0:
				System.out.println("That was a Saturday.");
				break;
			
			case 1: 
				System.out.println("That was a Sunday.");
				break;
				
			case 2: 
				System.out.println("That was a Monday.");
				break;
				
			case 3: 
				System.out.println("That was a Tuesday.");
				break;
				
			case 4: 
				System.out.println("That was a Wednesday.");
				break;
				
			case 5: 
				System.out.println("That was a Thursday.");
				break;
				
			case 6: 
				System.out.println("That was a Friday.");
				break;
				
				default:
					System.out.println("Error?");
					break;

		
		}//End switch
		

	}

}
