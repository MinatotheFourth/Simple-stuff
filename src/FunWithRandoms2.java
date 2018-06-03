/*
 * 
 * This program is nothing really. It just prints out random months using an integer randomizer.
 * What ever number it gets will output the corresponding month (eg: January 1, February 2, etc.)
 */
public class FunWithRandoms2 
{

	public static void main(String[] args) 
	{
		int month = (int)(Math.random() * 12 + 1);
		
		switch(month)
		{
		case 1:
			System.out.println("January");
		break;
		
		case 2:
			System.out.println("February");
		break;
		
		case 3:
			System.out.println("March");
			break;
		
		case 4:
			System.out.println("April");
			break;
			
		case 5:
			System.out.println("May");
			break;
			
		case 6:
			System.out.println("June");
			break;
			
		case 7:
			System.out.println("July");
			break;
			
		case 8:
			System.out.println("August");
			break;
			
		case 9:
			System.out.println("September");
			break;
			
		case 10:
			System.out.println("October");
			break;
			
		case 11:
			System.out.println("November");
			break;
			
		case 12:
			System.out.println("December");
			break;
			
			default:
				System.out.println("Must've been a 0.");
				
		}

	}

}
