//This is just a program that calculates a person's monthly payment based on the interest formula
import java.util.Scanner;

public class MonthlyPayment 
{

	public static void main(String[] args) 
	{
		//Declaring variables for annual and monthly rates, total payments, years, and monthly payments
		double annualinterestRate, loanAmount, monthlyPayment, totalPayment, monthlyRate;
		int years;
		
		//Scanner variables
		Scanner loan = new Scanner(System.in);
		Scanner year = new Scanner(System.in);
		
		//Ask for the annual interest rate and get the monthly payment
		System.out.println("Enter the annual interest rate of your loan");
		
		annualinterestRate = loan.nextDouble();
		
		monthlyRate = annualinterestRate / 1200;
		
		//Asks for the loan amount
		System.out.println("Now, enter the loan amount");
		loanAmount = loan.nextDouble();
		
		//Asks for the years the user will pay
		System.out.println("How many years will you spend paying off your loan?");
		years = year.nextInt();
		
		//This calculates the monthly and total payments
		monthlyPayment = (loanAmount * monthlyRate) / (1 - 1 / Math.pow(1 + monthlyRate, years * 12));
		totalPayment = monthlyPayment * years * 12;
		
		//Outputs the results.
		System.out.println("Your monthly payment is " + (int)(monthlyPayment * 100) / 100.00);
		System.out.println("Your total payment is " + (int)(totalPayment * 100) / 100.00);
	}

}
