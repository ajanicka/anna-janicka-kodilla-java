package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {

    public void findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> map = new HashMap<>();

        if (!map.containsKey(flight.getArrivalAirport())) {
            throw new RouteNotFoundException();
        }

        if (!map.containsKey(flight.getDepartureAirport())) {
            throw new RouteNotFoundException();
        }
    }
}
