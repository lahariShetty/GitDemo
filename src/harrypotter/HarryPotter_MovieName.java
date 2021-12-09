package harrypotter;

import java.util.Scanner;

public class HarryPotter_MovieName {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
System.out.println("Enter the Series number to know Harry potter's mobie name: ");
		int movieno = input.nextInt();
		input.close();
		if (movieno == 1)
			System.out.println("Harry Potter and the philosopher's stone");
			else if (movieno == 2 )
			{
			System.out.println("Harry Potter and Chamber of secrets");
			}
			else if (movieno == 3) System.out.println("Harry potter and prisoners of AZKABAN");
			else if (movieno == 4) System.out.println("Harry potter and the Goblet of Fire");
			else if (movieno == 5) System.out.println("Harry potter and the Order of Pheonix"); 
			else if (movieno == 6) System.out.println("Harry potter and the Half blood Prince");
			else if (movieno == 7) System.out.println("Harry potter and the Deathly hallows Part1");
			else if (movieno == 8) System.out.println("Harry potter and the Deathly hallows Part2");
			else {
			System.out.println(" Sorry, I could not find any movie with this series number, Please try again");
			}
	}

}
