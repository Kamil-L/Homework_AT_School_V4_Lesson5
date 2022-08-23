import java.util.List;
import java.util.Random;

public class Movie {

    private String title;
    private Director director;
    private String genre;
    private int date;
    private List<Actor> actors;

    public Movie() {
    }

    public String getGenre() {
        return genre;
    }

    public String getTitle() {
        return title;
    }

    public int getDate() {
        return date;
    }

    public Director getDirector() {
        return director;
    }

    public List<Actor> getActors() {
        return actors;
    }

    public Movie getRandomMovie(List<Movie> movieList) {
        Random randomMovie = new Random();
        return movieList.get(randomMovie.nextInt(movieList.size()));
    }

    @Override
    public String toString() {
        return '\n' + "title: " + getTitle() + '\n' +
                "director: " + getDirector() + '\n' +
                "genre: " + getGenre() + '\n' +
                "date: " + getDate() + '\n' +
                "actors: " + getActors() + '\n';
    }
}
