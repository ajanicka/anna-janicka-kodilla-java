package com.kodilla.good.patterns.challenges;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task13_1 {

    public static void main(String[] args) {

        MovieStore movieStore = new MovieStore();
        Map<String, List<String>> movies = movieStore.getMovies();

        String moviesString = movies.entrySet()
                .stream()
                .flatMap(movie -> movie.getValue().stream())
                .collect(Collectors.joining(","));

        System.out.println(moviesString);
    }
}