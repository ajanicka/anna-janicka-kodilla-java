package com.kodilla.good.patterns.Flights;

import java.util.ArrayList;
import java.util.List;

public class FlightsRetriever {
    List<Flight> flights = new ArrayList<>();

    public FlightsRetriever() {
        flights.add(new Flight("Wrocław", "Katowice"));
        flights.add(new Flight("Katowice", "Gdańsk"));
        flights.add(new Flight("Katowice", "Warszawa"));
        flights.add(new Flight("Warszawa", "Poznań"));
        flights.add(new Flight("Poznań", "Gdańsk"));
        flights.add(new Flight("Wrocław", "Poznań"));
        flights.add(new Flight("Wrocław", "Gdańsk"));
        flights.add(new Flight("Gdańsk", "Wrocław"));
    }

    List<Flight> retrieve() {
        return flights;
    }
}
