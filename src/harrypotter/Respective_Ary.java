package harrypotter;
import java.util.Arrays;

public class Respective_Ary {

	public static void main(String[] args) {
		String hpMovieName[] = {"Harry Potter and the philosopher's stone","Harry Potter and Chamber of secrets","Harry potter and prisoners of AZKABAN","Harry potter and the Goblet of Fire","Harry potter and the Order of Pheonix","Harry potter and the Half blood Prince","Harry potter and the Deathly hallows Part1","Harry potter and the Deathly hallows Part2"};
		int hpMovieNumber[] = {1,2,3,4,5,6,7,8};
		int hpMovieRlsYr[] = {2001,2002,2004,2005,2007,2009,2010,2011};
		int index = Arrays.binarySearch(hpMovieName, "Harry potter and prisoners of AZKABAN");
	System.out.println("Index is : "+index);
		for (int i=0; i < hpMovieNumber.length; i++) {
		System.out.println ("HP movie name : "+hpMovieName[i]+ " movie number is : "+hpMovieNumber[i]+ " movie released year is : " +hpMovieRlsYr[i]);
		}

	}

}
