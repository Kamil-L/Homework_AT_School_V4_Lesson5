import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        MovieLibrary moviesList = new MovieLibrary();
        moviesList.deserialiseMovie("src/main/resources/movies.json");

        Menu menu = new Menu();
        menu.printMovieLibraryMenu();

        Scanner scn = new Scanner(System.in);

        int choiceMenuOption = scn.nextInt();
        switch (choiceMenuOption) {
            case 1 -> {
                System.out.println("Please input dates' range (starting date,end date) to filter movies: ");
                System.out.println("Starting date: ");
                int startingDate = scn.nextInt();
                System.out.println("End date: ");
                int endDate = scn.nextInt();
                moviesList.searchForMovieByDatesRange(startingDate, endDate);
            }
            case 2 -> moviesList.getRandomMovie();
            case 3 -> {
                System.out.println("Please input actor's name (first name, last name) to filter movies: ");
                System.out.println("Input first name:");
                String firstName = scn.next();

                System.out.println("Input last name:");
                String lastName = scn.next();
                moviesList.searchForMoviesByActorsName(firstName,lastName);

            }
            case 4 -> System.out.println("Program ended!");
        }
    }
}
