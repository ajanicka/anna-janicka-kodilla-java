package com.kodilla.good.patterns.Flights;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FlightService {

    Set<String> findAllFlightsFrom(List<Flight> flights, String from) {
        System.out.println("Flights from " + from +":");

        return flights.stream()
                .filter(flight -> flight.from.equals(from))
                .map(flight -> flight.to)
                .collect(Collectors.toSet());
    }

    Set<String> findAllFlightsTo(List<Flight> flights, String to) {
        System.out.println("Flights to " + to +":");

        return flights.stream()
                .filter(flight -> flight.to.equals(to))
                .map(flight -> flight.from)
                .collect(Collectors.toSet());
    }

    void findAllTransferFlightsFromTo(List<Flight> flights, String from, String to) {
        List<Flight> flightsTo = flights.stream()
                .filter(flight-> flight.to.equals((to)))
                .collect(Collectors.toList());


    }
}
