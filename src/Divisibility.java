import java.util.Scanner;

public class Divisibility 
{

	public static void main(String[] args) 
	{
		//Declared variables for the input number, a check, and Scanner
		int number;
		boolean check;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		
		//Number input
		number = input.nextInt();

		
		//This statement checks if the number is divisble by 5 AND 6
		if(number % 5 != 0 || number % 6 != 0)
		{
			check = false;
			System.out.println("Is " + number + " divisible by 5 & 6? " + check);
		}
		
		else if(number % 5 == 0 && number % 6 == 0)
		{
			check = true;
			System.out.println("Is " + number + " divisible by 5 & 6? " + check);
		}
		//Statement 1 end
		
		//This statement checks if the number is divisible by 5 OR 6
		if(number % 5 == 0 || number % 6 == 0)
		{
			check = true;
			System.out.println("Is " + number + " divisible by 5 or 6? " + check);
		}
		
		
		else if(number % 5 != 0 && number % 6 != 0)
		{
			check = false;
			System.out.println("Is " + number + " divisible by 5 or 6? " + check);
		}
		//End 2nd statement
		
		//This also checks if the number is divisible by 5 OR 6 but not both
		if(number % 5 == 0 || number % 6 == 0)
		{
			check = true;
			System.out.println("Is " + number + " divisible by 5 or 6 but not both? " + check);
		}
		
		else if(number % 5 != 0 || number % 6 != 0)
		{
			check = false;
			System.out.println("Is " + number + " divisible by 5 or 6 but not both? " + check);
		}
		//End statement 3
	}

}
