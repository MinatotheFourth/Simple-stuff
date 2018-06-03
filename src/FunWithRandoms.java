import java.util.Random;
import java.util.Scanner;

public class FunWithRandoms 
{

	public static void main(String[] args) 
	{
		//Declare variables for input, the three integers, and the sum
		Scanner input = new Scanner(System.in);
		int num1 = (int)(Math.random() * 10);
		int num2 = (int)(Math.random() * 10);
		int num3 = (int)(Math.random() * 10);
		int sum;
		
		//Output a message to the user telling them top find the sum of the three ints
		System.out.println("Enter the sum of these numbers. " + num1 + ", " + num2 + ", " + num3);
		sum = input.nextInt();
		
		//Condition for a correct input
		if (sum == (num1 + num2 + num3))
			System.out.println("That's right!");
		
		//Condition for being wrong.
		else
			System.out.println("You need to know, what's right from wrong....");
	}

}
