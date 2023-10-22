package com.example.epro_practice1.repository;

import com.example.epro_practice1.constant.Genre;
import com.example.epro_practice1.constant.MovieType;
import com.example.epro_practice1.model.Movie;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface MovieRepository {

    List<Movie> movies = new ArrayList<>() {
        {
            add(new Movie("Tenet", "USA", 2020, Genre.SCIENCE_FICTION, MovieType.SERIES, "A mind-bending thriller", "PG-13"));
            add(new Movie("Dune", "USA", 2021, Genre.SCIENCE_FICTION, MovieType.SERIES, "A sci-fi epic", "PG-13"));
            add(new Movie("No Time to Die", "UK", 2021, Genre.ACTION, MovieType.SERIES, "The latest James Bond film", "PG-13"));
            add(new Movie("Spider-Man: No Way Home", "USA", 2021, Genre.ACTION, MovieType.FILM, "Spider-Man faces multiverse threats", "PG-13"));
            add(new Movie("A Quiet Place Part II", "USA", 2021, Genre.HORROR, MovieType.SERIES, "Surviving in silence", "PG-13"));
            add(new Movie("Black Widow", "USA", 2021, Genre.ACTION, MovieType.FILM, "The origin story of Black Widow", "PG-13"));
            add(new Movie("Cruella", "USA", 2021, Genre.COMEDY, MovieType.FILM, "The backstory of Cruella de Vil", "PG-13"));
            add(new Movie("The French Dispatch", "USA", 2021, Genre.COMEDY, MovieType.FILM, "A Wes Anderson film", "R"));
            add(new Movie("Jungle Cruise", "USA", 2021, Genre.ACTION, MovieType.FILM, "Adventure down the Amazon", "PG-13"));
            add(new Movie("Free Guy", "USA", 2021, Genre.COMEDY, MovieType.FILM, "A video game adventure", "PG-13"));
        }
    };
}
