package com.example.epro_practice1;

import com.example.epro_practice1.model.Movie;
import com.example.epro_practice1.repository.MovieRepository;
import com.example.epro_practice1.service.IMovieService;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.springframework.test.util.AssertionErrors.assertEquals;

@SpringBootTest
public class IMovieServiceTest {

    @Autowired
    private IMovieService movieService;

    @Mock
    private MovieRepository movieRepository;

    @Test
    public void testLikeMovie() {
        String movieName = "Tenet";
        Movie likedMovie = movieService.likeMovie(movieName);
        assertEquals("successful", true, likedMovie.isLike());
    }

    @Test
    public void testUnlikeMovie() {
        String movieName = "Dune";
        Movie unlikedMovie = movieService.unlikeMovie(movieName);
        assertEquals("successful",false, unlikedMovie.isLike());
    }

    @Test
    public void testGetLikedMovie() {
        int expectedSize = 0;
        List<Movie> likedMovies = movieService.getLikedMovie();
        assertEquals("successful", expectedSize, likedMovies.size());
    }

}
