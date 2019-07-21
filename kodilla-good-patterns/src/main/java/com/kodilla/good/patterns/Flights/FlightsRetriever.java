package com.kodilla.good.patterns.Flights;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class FlightsRetriever {
    List<Flight> flights = new ArrayList<>();

    public FlightsRetriever() {
        flights.add(new Flight("Gdańsk", "Wrocław"));
        flights.add(new Flight("Gdańsk", "Wrocław"));
        flights.add(new Flight("Gdańsk", "Wrocław"));
        flights.add(new Flight("Gdańsk", "Kraków"));
        flights.add(new Flight("Strzegom", "Katowice"));
        flights.add(new Flight("Kraków", "Wrocław"));
        flights.add(new Flight("Wrocław", "Gdańsk"));
    }

    List<Flight> retrieve() {
        return flights;
    }
}
