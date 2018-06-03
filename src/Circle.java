import java.util.Scanner;

public class Circle
{

	public static void main(String[] args) 
	{
		//Variables for x, y, x2 - x1 (xd), y2 - y1(yd), and distance formulas
		double x, y, xd, yd, distance;
		Scanner input = new Scanner(System.in);
		
		//Ask to enter the x coordinates
		System.out.println("Enter a point with two coordinates.");
		x = input.nextInt();
		
		//Now, the y coordinate
		System.out.println("Now, the second one.");
		y = input.nextInt();

		//calculates x2 -x1 squared and y2 - y1 squared
		xd = Math.pow(x - 0, 2);
		yd = Math.pow(y - 0, 2);
		
		//Determines the distance 
		distance = Math.sqrt(xd + yd);
		
		//This determines if the point is in the circle or not
		if(distance < 10)
			System.out.println("Point (" + x +", " + y + ") is in the circle.");
		
		else
			System.out.println("Point (" + x +", " + y + ") is not in the circle.");
	}

}
