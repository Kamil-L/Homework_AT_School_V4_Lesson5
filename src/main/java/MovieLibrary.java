import java.util.List;
import java.util.Scanner;

public class MovieLibrary {

    public static List<Movie> moviesList;
    Scanner scn = new Scanner(System.in);

    public void searchForMovieByDatesRange() {
        System.out.println("Please input dates' range (starting date,end date) to filter movies: ");
        System.out.println("Starting date: ");
        int startingDate = scn.nextInt();
        System.out.println("End date: ");
        int endDate = scn.nextInt();
        for (Movie movie : moviesList) {
            if (movie.getDate() >= startingDate && movie.getDate() <= endDate) {
                System.out.println(movie.getTitle());
            }
        }
    }

    public void displayDataAboutRandomMovie() {
        Movie movie = new Movie();
        System.out.println(movie.getRandomMovie(moviesList));
    }

    public void searchForMoviesByActorsName() {
        System.out.println("Please input actor's name (first name, last name) to filter movies: ");
        System.out.println("Input first name: ");
        String actorName = scn.nextLine();
        System.out.println("Input last name: ");
        String actorSurname = scn.nextLine();
        for (Movie movie : moviesList) {
            if (movie.getActors().stream().anyMatch(m -> m.getFirstName().equals(actorName))
                    && movie.getActors().stream().anyMatch(m -> m.getLastName().equals(actorSurname))) {
                System.out.println("Movies: " + movie.getTitle());
            }
        }
    }

    public void printMovieLibraryMenu() {
        System.out.println("Menu:");
        System.out.println(
                """                    
                        1 - Search for movies by dates' range\s
                        2 - Display all data about random movie search \s
                        3 - Search for movies by actor's name\s
                        4 - Exit\s
                                                    
                        Select option from menu:""");

    }
}
