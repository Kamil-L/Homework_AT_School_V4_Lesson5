import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Random;


public class MovieLibrary {
    private static List<Movie> moviesList;

    public static void deserialiseMovie(String path) {

        ObjectMapper objectMapper = new ObjectMapper();
        File movieFile = new File(path);

        {
            try {
                moviesList = objectMapper.readValue(movieFile, new TypeReference<>() {
                });

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void searchForMovieByDatesRange(int startingDate, int endDate) {
        for (Movie movie : moviesList) {
            if (movie.getDate() >= startingDate && movie.getDate() <= endDate) {
                System.out.println(movie.getTitle());
            }
        }
    }

    public void getRandomMovie() {
        Random randomMovie = new Random();
        int randomMovies = randomMovie.nextInt(moviesList.size());
        System.out.println(moviesList.get(randomMovies));
    }

    public void searchForMoviesByActorsName(String firstName, String lastName) {
        for (Movie movie : moviesList) {
            if (movie.getActors().stream().anyMatch(m -> m.getFirstName().equals(firstName))
                    && movie.getActors().stream().anyMatch(m -> m.getLastName().equals(lastName))) {
                System.out.println("Movies: " + movie.getTitle());
            }
        }
    }
}
