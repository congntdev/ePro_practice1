package com.example.epro_practice1.service;

import com.example.epro_practice1.model.Movie;
import com.example.epro_practice1.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MovieServiceImpl implements IMovieService, MovieRepository {

    @Override
    public Movie likeMovie(String movieName) {
        Movie movie = movies.stream().filter(movie1 -> movieName.equals(movie1.getTitle())).findAny().get();
        movie.setLike(true);
        return movie;
    }

    @Override
    public Movie unlikeMovie(String movieName) {
        Movie movie = movies.stream().filter(movie1 -> movieName.equals(movie1.getTitle())).findAny().get();
        movie.setLike(false);
        return movie;
    }

    @Override
    public List<Movie> getLikedMovie() {
        return movies.stream().filter(Movie::isLike).collect(Collectors.toList());
    }
}
