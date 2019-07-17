package com.kodilla.good.patterns.Flights;

import java.util.List;

public class FlightService {

    void findAllFlightsFrom(List<Flight> flights, String from) {
        System.out.println("Flights from " + from +":");

        flights.stream()
                .filter(flight -> flight.from.equals(from))
                .map(flight -> flight.time)
                .forEach(System.out::println);
    }

    void findAllFlightsTo(List<Flight> flights, String to) {
        System.out.println("Flights to " + to +":");

        flights.stream()
                .filter(flight -> flight.to.equals(to))
                .map(flight -> flight.time)
                .forEach(System.out::println);
    }
}
