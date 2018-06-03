/*
 * All this short program does is print the numbers divisible by 3 from 1 to 100
 * After that, it adds those numbers up and print them at the end.
 */


import java.util.Scanner;

public class By3 
{

	public static void main(String[] args) 
	{
		int total = 0;
		
		for(int x = 1; x <= 100; x++)
		{
			//This condition checks to see if the number is divisible by 3 and prints it if it is
			if(x % 3 == 0 )
				System.out.println(x);
			
			//On top of that, it will add itself to the sum
			if(x % 3 == 0)
				total = total + x;
			
			//Otherwise, the total will remain the same
			else
				total = total;
			
		}

			System.out.println("The sum of these numbers is " + total); //Prints out the sum
	}

}
