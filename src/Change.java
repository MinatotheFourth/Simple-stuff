import java.util.Scanner;

public class Change 
{
	public static void main(String[] args) 
	{
		//Declares a scanner variable along with variables for coin change, total change, total cents, and payment.
		double payment, change, cents, total = 378.93;
		int dollars, quarters, dimes, nickles, pennies;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Your total is 378.93. Please pay now");
		payment = input.nextDouble();
		
		change = payment - total;
		cents = (int)(change * 100);
		

		
		dollars = (int) (cents / 100);
		cents = cents % 100;
		
		quarters = (int) (cents / 25);
		cents = cents % 25;
		
		dimes = (int) (cents / 10);
		cents = cents % 10;
		
		nickles = (int) (cents / 5);
		cents = cents % 5;
		
		pennies = (int) cents;
		
		System.out.println("Your change is $" + (int)(change * 100) / 100.0);
		System.out.println("This means you're getting " + dollars + " dollars, " + quarters + " quarters, " + dimes + " dimes, " + nickles + " nickels, and " + pennies 
				+ " pennies.");
		

	}

}
