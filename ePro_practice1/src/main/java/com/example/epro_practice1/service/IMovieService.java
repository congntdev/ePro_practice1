package com.example.epro_practice1.service;

import com.example.epro_practice1.model.Movie;

import java.util.List;

public interface IMovieService {

    Movie likeMovie(String movieName);

    Movie unlikeMovie(String movieName);

    List<Movie>  getLikedMovie();
}
