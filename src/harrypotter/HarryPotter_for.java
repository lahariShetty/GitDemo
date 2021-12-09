package harrypotter;

import java.util.Scanner;

public class HarryPotter_for {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);		
		for (int movieno = 1; movieno>= 1; movieno++) 
			{
			System.out.println("Enter the number : ");
			movieno = input.nextInt();
			
		switch (movieno) {
		case 0:
		System.out.println("Let me Guess! The movie name is Harry potter and the philosopher's stone");
		break;
		case 2:
		System.out.println("Let me Guess! The movie name is Harry potter and the Chamber of secrets");
		break;
		case 3:
		System.out.println("Let me Guess! The movie name is Harry potter and the prisoners of AZKABAN");
		break;
		case 4:
		System.out.println("\"Let me Guess! The movie name is Harry potter and the Goblet of Fire");
		break;
		case 5:
		System.out.println("\"Let me Guess! The movie name is Harry potter and Order of Pheonix");
		break;
		case 6:
		System.out.println("\"Let me Guess! The movie name is Harry potter and Half blood Prince");
		break;
		case 7:
		System.out.println("\"Let me Guess! The movie name is Harry potter and the Deathly hallows Part1");
		break;
		case 8:
		System.out.println("\"Let me Guess! The movie name is Harry potter and the Deathly hallows Part2");
		break;
		default:
		System.out.println("Let me Guess! I think Movie related to this series is not present!");
		} // End of Switch
		}
	input.close();

	}

}
