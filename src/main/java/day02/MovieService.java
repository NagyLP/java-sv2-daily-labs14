package day02;

import java.util.ArrayList;
import java.util.List;

public class MovieService {

    private List<Movie> movies = new ArrayList<>();

    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    public List<Movie> containsActor(String actor) {
        return movies.stream()
                .filter(movie -> movie.getActor().contains(actor))
                .toList();
    }

    public int getLongestMovies() {
        return movies.stream()
                .mapToInt(m -> m.getLength())
                .max()
                .orElseThrow(() -> new IllegalStateException("Empty list"));
    }
}
