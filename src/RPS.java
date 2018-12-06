//A rock paper scissors program. It only executes once since I haven't placed in a loop
import java.util.Scanner;

public class RPS 
{

	public static void main(String[] args) 
	{
		//Declare variables for the user's and computer's inputs along with the scanner for user input
		int compGuess, userGuess;
		compGuess = (int) (Math.random() * 3);
		Scanner input = new Scanner(System.in);
		
		//Ask the user to input their guess
		System.out.println("Scissors (0), Rock (1), Paper (2)");
		userGuess = input.nextInt();
		
		//This is for when the user tries to be funny
		if(userGuess > 2)
			do
			{
				System.out.println("Don't be shy. The computer doesn't bite. Enter a valid number.");
				userGuess = input.nextInt();
				
			}while(userGuess > 2);
		
		
		//It's a draw
		if(userGuess == compGuess)
		{
			System.out.println("It's a draw!");
		}
		
		//User picks scissors and computer picks paper
		else if(userGuess == 0 && compGuess == 2)
		{
			System.out.println("The computer guessed paper, you win!");
		}
		
		//User picks scissors, but computer picks rock
		else if(userGuess == 0 && compGuess == 1)
		{
			System.out.println("The computer guessed Rock, you lose!");
		}
		
		//User picks rock and computer picks paper
		else if(userGuess == 1 && compGuess == 2)
		{
			System.out.println("The computer guessed paper, you lose!");
		}
		
		//User picks Rock, but computer picks scissors
		else if(userGuess == 1 && compGuess == 0)
		{
			System.out.println("The computer guessed Scissors, you win!");
		}
		
		//User picks paper, and computer picks Scissors
		else if(userGuess == 2 && compGuess == 0)
		{
			System.out.println("The computer guessed Scissors, you lose!");
		}
		
		//User picks paper, but computer picks rock
		else if(userGuess == 2 && compGuess == 1)
		{
			System.out.println("The computer guessed Rock, you win!");
		}
		
		
	}

}
