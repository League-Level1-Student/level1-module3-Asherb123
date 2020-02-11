package _05_netflix;

public class Netflix_Runner {
public static void main(String[] args) {
	
Movie AnimalHouse = new Movie("Animal House",  10); 

Movie Inception = new Movie("Inception", 9);

Movie BeeMovie = new Movie("Bee Movie", 1);

Movie DumbAndDumber = new Movie("Dumb and Dumber", 7);

Movie Tron = new Movie("Tron", 8);



NetflixQueue Q = new NetflixQueue();

Q.addMovie(AnimalHouse);

Q.addMovie(Inception);

Q.addMovie(BeeMovie);

Q.addMovie(Tron);

Q.addMovie(DumbAndDumber);

Q.printMovies();

System.out.println(Q.getBestMovie().getTicketPrice() +"  Is the best movie");

System.out.println(Q.getMovie(1).getTicketPrice());








Q.getBestMovie();

Q.getMovie(0);

Q.sortMoviesByRating();








}
}
