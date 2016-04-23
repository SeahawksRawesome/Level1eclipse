package level1;

public class MovieTime {
	Movie StarWars;
	Movie HarryPotter;
	Movie RealSteel;
	Movie GameStandsTall;
	Movie TomBradyIsAwesome;
	
	public static void main(String[] args) {
		NetflixQueue netflixQueue = new NetflixQueue();
		// TODO Auto-generated method stub
		Movie StarWars = new Movie("StarWars", 5);
		Movie HarryPotter = new Movie("Harry Potter", 4);
		Movie RealSteel = new Movie("Real Steel", 3);
		Movie GameStandsTall = new Movie("Game Stands Tall", 2);
		Movie TomBradyIsAwesome = new Movie("Tom Brady Is Awesome", -500);
		StarWars.getTicketPrice();
		netflixQueue.addMovie(StarWars);
		netflixQueue.addMovie(RealSteel);
		netflixQueue.addMovie(HarryPotter);
		netflixQueue.addMovie(GameStandsTall);
		netflixQueue.addMovie(TomBradyIsAwesome);
		netflixQueue.printMovies();
		netflixQueue.sortMoviesByRating();
		System.out.println("The best movie is" + netflixQueue.getBestMovie());
		System.out.println("The second best movie is" + netflixQueue.getMovie(1) );
	}

}
