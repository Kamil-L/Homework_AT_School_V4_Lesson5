import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class MovieDeserialiser {

    public static void deserialiseMovie() {

        ObjectMapper mapper = new ObjectMapper();
        File movieFile = new File("src/main/resources/movies.json");

        {
            try {
                MovieLibrary.moviesList = mapper.readValue(movieFile, new TypeReference<List<Movie>>() {
                });
            } catch (
                    IOException e) {
                e.printStackTrace();
            }
        }
    }
}

