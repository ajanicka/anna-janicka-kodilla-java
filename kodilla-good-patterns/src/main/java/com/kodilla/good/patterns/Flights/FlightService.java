package com.kodilla.good.patterns.Flights;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FlightService {

    Set<Flight> findAllFlightsFrom(List<Flight> flights, String from) {
        return flights.stream()
                .filter(flight -> flight.getFrom().equals(from))
                .collect(Collectors.toSet());
    }

    Set<Flight> findAllFlightsTo(List<Flight> flights, String to) {
        return flights.stream()
                .filter(flight -> flight.getTo().equals(to))
                .collect(Collectors.toSet());
    }

    Set<TransferFlight> findAllTransferFlightsFromTo(List<Flight> flights, String from, String to) {
        return findAllFlightsTo(flights, to)
                .stream()
                .flatMap(flight -> findAllFlightsTo(flights, flight.getFrom()).stream())
                .distinct()
                .filter(flight -> flight.getFrom().equals(from))
                .map(flight -> new TransferFlight(flight.getFrom(), flight.getTo(), to))
                .collect(Collectors.toSet());
    }
}
