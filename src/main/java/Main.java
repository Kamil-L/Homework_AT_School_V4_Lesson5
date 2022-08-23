import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        MovieDeserialiser movieDeserialiser = new MovieDeserialiser();
        movieDeserialiser.deserialiseMovie();

        Scanner scanner = new Scanner(System.in);

        MovieLibrary movieLibrary = new MovieLibrary();
        movieLibrary.printMovieLibraryMenu();
        int choiceMenuOption = scanner.nextInt();
        switch (choiceMenuOption) {
            case 1 -> movieLibrary.searchForMovieByDatesRange();
            case 2 -> movieLibrary.displayDataAboutRandomMovie();
            case 3 -> movieLibrary.searchForMoviesByActorsName();
            case 4 -> {
                System.out.println("Program ended!");
            }

        }
    }
}
