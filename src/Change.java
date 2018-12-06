import java.util.Scanner;
//This is a change program that determines how many coins will be given upon receiving change.
public class Change 
{
	public static void main(String[] args) 
	{
		//Declares a scanner variable along with variables for coin change, total change, total cents, and payment.
		double payment, change, cents, total = 378.93;
		int dollars, quarters, dimes, nickles, pennies;
		Scanner input = new Scanner(System.in);
		
		//This is where the user will input their payment
		System.out.println("Your total is 378.93. Please pay now");
		payment = input.nextDouble();
		
		//Of course, someone will troll around, so I had a contingency plan
		if(payment < total)
		{
			System.out.println("That's not enough!");
		
		//And there's even a way to contain them too
		do
		{
			System.out.println("Enter a valid price!");
			payment = input.nextDouble();
			
		}while(payment < total);
		
		}
		//Calculates the change in dollars and coins
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
		
		
		//Outputs our results
		System.out.println("Your change is $" + (int)(change * 100) / 100.0);
		System.out.println("This means you're getting " + dollars + " dollars, " + quarters + " quarters, " + dimes + " dimes, " + nickles + " nickels, and " + pennies 
				+ " pennies.");
		

	}

}
