package day02;

import java.util.List;

public class MovieService {

    private List<Movie> movies;

    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    public List<Movie> containsActor(String actor) {
        return movies.stream()
                .filter(movie -> movie.getActor().contains(actor))
                .toList();
    }

    public int getLongestMovies(String movie) {
        return movies.stream()
                .mapToInt(m -> m.getLength())
                .max()
                .orElseThrow(() -> new IllegalStateException("Empty list"));
    }
}
