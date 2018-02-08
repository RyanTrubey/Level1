
public class NetflixRunner {
public static void main(String[] args) {
	Movie m1 = new Movie("Thor Ragnorok", 4);
	Movie m2 = new Movie("The Death Cure", 3);
	Movie m3 = new Movie("Dead Chickens", 1);
	Movie m4 = new Movie("Chicken with a Jetpack", 5);
	Movie m5 = new Movie("A piece of grass", 6);
	m1.getTicketPrice();
	m2.getTicketPrice();
	m3.getTicketPrice();
	m4.getTicketPrice();
	m5.getTicketPrice();
	NetflixQueue queue = new NetflixQueue();
	queue.addMovie(m1);
	queue.addMovie(m2);
	queue.addMovie(m3);
	queue.addMovie(m4);
	queue.addMovie(m5);
	//queue.printMovies();
	queue.sortMoviesByRating();
	Movie best = queue.getBestMovie();
	System.out.println("The Best Movie is " + best);
	Movie secondBest = queue.getMovie(1);
	System.out.println("The Second Best Movie is " + secondBest);
	for(int i = 0; i < 5; i++) {
		
		Movie thing = queue.getMovie(i);
		System.out.println(thing);
	}
}
}
