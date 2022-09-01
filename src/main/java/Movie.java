import java.util.List;

public class Movie {

    private String title;
    private Director director;
    private String genre;
    private int date;
    private List<Actor> actors;

    public Movie() {
    }

    public String getTitle() {
        return title;
    }

    public Director getDirector() {
        return director;
    }

    public String getGenre() {
        return genre;
    }

    public int getDate() {
        return date;
    }

    public List<Actor> getActors() {
        return actors;
    }

    @Override
    public String toString() {
        return "title: " + getTitle() + '\n' +
                "director: " + getDirector() + '\n' +
                "genre: " + getGenre() + '\n' +
                "date: " + getDate() + '\n' +
                "actors: " + getActors() + '\n';
    }
}

