package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {

    public boolean findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> map = new HashMap<>();
        map.put("Airport1", true);
        map.put("Airport2", true);

        if (!map.containsKey(flight.getArrivalAirport())) {
            throw new RouteNotFoundException();
        }

        return map.get(flight.getArrivalAirport());
    }
}
