//This program is the full quadratic formula and checks for roots.
import java.util.Scanner;

public class QuadraticFormula 
{

	public static void main(String[] args) 
	{
		//This declares variables for a, b, c, along with variables that calculate and store the answers
		double a, b, c, d, e; 
		double QuadraticFormulaAnswerN, QuadraticFormulaAnswerP; //N is for b - while b + is for P
		Scanner input = new Scanner (System.in);
		
		//Asks the user for A, B, and C
		System.out.println("Enter a, b, and c in this order." );
		
		System.out.println("A");
		a = input.nextDouble();
		
		System.out.println("B");
		b = input.nextDouble();
		
		System.out.println("C");
		c = input.nextDouble();
		
		
		//This does the calculations for b - and b + respectively
		QuadraticFormulaAnswerN = (-b - (Math.sqrt(Math.pow(b, 2) - (4 * a * c)))) / (2 * a) ;
		QuadraticFormulaAnswerP = (-b + (Math.sqrt(Math.pow(b, 2) - (4 * a * c)))) / (2 * a) ;
		
		//This sets the answers to variables with less characters and cast them to two decimal places.
		d = (int) (QuadraticFormulaAnswerN * 100) / 100.0;
		e = (int) (QuadraticFormulaAnswerP * 100) / 100.0;
		
		//Condition for two roots
		if(d != e && (d != 0 && e != 0))
			
			//Outputs the answers
			System.out.println("There are two roots. They are " + d + " and " + e);
		
		//Condition for one root
		else  if(d == e && (d != 0 || e != 0))
			System.out.println("There is only one root, and that root is " + d + ".");
		
		//Condition for no roots
		else if(d == 0 && e == 0)
			System.out.println("There are no real roots.");
		
		//Condition for invalid inputs
		else
			System.out.println("What is this? What are you doing?");
	}

}
