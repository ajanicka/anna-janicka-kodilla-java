package com.kodilla.good.patterns.Flights;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class FlightsRetriever {
    List<Flight> flights = new ArrayList<>();

    public FlightsRetriever() {
        flights.add(new Flight("Gdańsk", "Wrocław", LocalTime.of(3,40)));
        flights.add(new Flight("Gdańsk", "Wrocław", LocalTime.of(12,00)));
        flights.add(new Flight("Gdańsk", "Wrocław", LocalTime.of(21,30)));
        flights.add(new Flight("Gdańsk", "Kraków", LocalTime.of(19,00)));
        flights.add(new Flight("Strzegom", "Katowice", LocalTime.of(23,30)));
        flights.add(new Flight("Kraków", "Wrocław", LocalTime.of(21,00)));
        flights.add(new Flight("Wrocław", "Gdańsk", LocalTime.of(21,00)));
    }

    List<Flight> retrieve() {
        return flights;
    }
}
