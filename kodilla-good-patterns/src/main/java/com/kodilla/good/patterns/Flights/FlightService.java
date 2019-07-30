package com.kodilla.good.patterns.Flights;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FlightService {

    Set<Flight> findAllFlightsFrom(List<Flight> flights, String from) {
        return flights.stream()
                .filter(flight -> flight.from.equals(from))
                .collect(Collectors.toSet());
    }

    Set<Flight> findAllFlightsTo(List<Flight> flights, String to) {
        return flights.stream()
                .filter(flight -> flight.to.equals(to))
                .collect(Collectors.toSet());
    }

    Set<TransferFlight> findAllTransferFlightsFromTo(List<Flight> flights, String from, String to) {
        return findAllFlightsTo(flights, to)
                .stream()
                .flatMap(flight -> findAllFlightsTo(flights, flight.from).stream())
                .distinct()
                .filter(flight -> flight.from.equals(from))
                .map(flight -> new TransferFlight(flight.from, flight.to, to))
                .collect(Collectors.toSet());
    }
}
