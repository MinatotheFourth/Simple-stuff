import java.util.Scanner;

public class Divisibility 
{

	public static void main(String[] args) 
	{
		int number, five, six;
		boolean check;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		
		number = input.nextInt();

		System.out.println(number % 5);
		System.out.println(number % 6);
		
		
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
	}

}
