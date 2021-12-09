package harrypotter;

public class HarryPotter_ApproxyrsofMovies {

	public static void main(String[] args) {
		int hpFirstMovieYear = 2001;
        int hpLastMovieYear = 2011;
        int hpTotalmovies= 8;
        int hpmovieyearElapsed = hpLastMovieYear-hpFirstMovieYear;
        int numbofyears=hpmovieyearElapsed / hpTotalmovies;  // =1 year 
        double numbofmonths=hpmovieyearElapsed % hpTotalmovies; //=2 months

System.out.println("Approx time for each of Harry potter movie release is "+numbofyears+" year and "+numbofmonths+" months");

	}

}
