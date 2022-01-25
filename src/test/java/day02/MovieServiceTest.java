package day02;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MovieServiceTest {

    MovieService movieService;

// MovieService    movieService = new MovieService();

    Movie m1 = new Movie("Tulipános Fanfan", 110, List.of("Vincent Perez", "Kiss Béla", "Nagy László"));
    Movie m2 = new Movie("Fekete tulipán", 100, List.of("Alein Delon", "Nagy László"));
    Movie m3 = new Movie("Operaház fantomja", 90, List.of("Emmy Rossum", "Lópici Gáspár"));

    @BeforeEach
    void init() {

        movieService.addMovie(m1);
        movieService.addMovie(m2);
        movieService.addMovie(m3);
    }

    @Test
    void testEmptyList() {
        Exception e = assertThrows(IllegalStateException.class, () -> new MovieService().getLongestMovies());
        assertEquals("Empty", e.getMessage());
    }

    @Test
    void containsActor() {
        assertEquals(List.of(m2), movieService.containsActor("Nagy László"));
        assertEquals(List.of(m1, m2), movieService.containsActor("Kiss Béla"));
    }

    @Test
    void getLongestMovies() {
        assertEquals(110, movieService.getLongestMovies());
    }
}