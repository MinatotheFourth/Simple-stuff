import java.util.Scanner;

public class NumberSort 
{
	/*
	 * Here is an example of swaps. Say I want to swap 12 and 16 to 16 and 12. Here's what I'd do.
	 * I would declare variables for 12, 16, and a temporary variable for storage
	 * int a = 12;
	 * int b = 16;
	 * int temp;
	 * 
	 * the formula is 
	 * int temp = a;  Temp stores the value of a for safe-keeping.
	 * a = b;         Now, a has the value of b.
	 * b = temp;      B now takes what A's initial value was. Ta-da!
	 */

	public static void main(String[] args) 
	{
		//Variables for input and the three numbers to be input
		Scanner input = new Scanner(System.in);
		int n1, n2, n3;
		
		//Ask the user to input the first number
		System.out.println("Enter three numbers, and they'll be sorted from smallest to largest.");
		n1 = input.nextInt();
		
		//Now, the second
		System.out.println("The second one");
		n2 = input.nextInt();
		
		//And the third
		System.out.println("The third");
		n3 = input.nextInt();
		
		
		//This is for when the 2nd number is smaller than the 1st and 3rd
		if(n2 > n3 && (n1 < n2 && n1 < n3))
		{
			int temp = n2;
			n2 = n3;
			n3 = temp;
		}
		
		//This is for when the first number is bigger than the third but smaller than the second
		else if(n1 > n3 && n2 > n1)
		{
			int temp = n1;
			n1 = n3;
			n3 = temp;
			
			temp = n2;
			n2 = n3;
			n3 = temp;
		}	
			
		//This is for when the 1st is bigger than the 2nd, and the 3rd is bigger than the 2nd and 1st
		else if(n1 > n2 && n3 > n2 && n3 > n1)
		{
			int temp = n1;
			n1 = n2;
			n2 = temp;
		}
		
		/*This is for when the 1st is bigger than the 2nd and eventually when the 2nd is bigger than the first
		 * Or if the 1st is bigger than the 2nd and 3rd along with the 2nd being bigger than the 3rd
		 */
		else if(n1 > n2 && n2 > n1 || n1 > n2 && n1 > n3 && n2 > n3)
		{
			int temp = n1;
			n1 = n3;
			n3 = temp;
		}
		
		//This is for when the 1st is bigger than the 2nd yet the 2nd is smaller than the 3rd
		else if(n1 > n2 && n2 < n3)
		{
			int temp = n1;
			n1 = n3;
			n3 = temp;
			
			temp = n1;
			n1 = n2;
			n2 = temp;

		}
		

		//This is for if the number is sorted from the beginning.
		else if(n1 < n2 && n1 < n3)
		{
			System.out.println("Here you go " + n1 + ", " + n2 + ", " + n3);
			System.exit(0);
		}
		
		//Output for the other decisions besides the last one
		System.out.println("Here you go " + n1 + ", " + n2 + ", " + n3);

	}

}
