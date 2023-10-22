package com.example.epro_practice1.model;

import com.example.epro_practice1.constant.Genre;
import com.example.epro_practice1.constant.MovieType;
import lombok.Data;

@Data
public class Movie {

    private String title;
    private String country;
    private int year;
    private Genre genre;
    private MovieType moiveType;
    private String description;
    private String rating;
    private boolean isLike;

    public Movie() {
    }

    public Movie(String title, String country, int year, Genre genre, MovieType moiveType, String description, String rating) {
        this.title = title;
        this.country = country;
        this.year = year;
        this.genre = genre;
        this.moiveType = moiveType;
        this.description = description;
        this.rating = rating;
        this.isLike = false;
    }
}
