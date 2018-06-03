import java.util.Scanner;

public class By3 
{

	public static void main(String[] args) 
	{
		int total = 0;
		
		for(int x = 1; x <= 100; x++)
		{
			if(x % 3 == 0 )
				System.out.println(x);
			
			if(x % 3 == 0)
				total = total + x;
			else
				total = total;
			
		}

			System.out.println("The sum of these numbers is " + total);
	}

}
