package com.kodilla.exception.test;

public class RouteNotFountExceptionRunner {

    public static void main(String[] args) {
        FlightFinder flightFinder = new FlightFinder();

        try {
            flightFinder.findFlight(new Flight("From", "To"));
        } catch (RouteNotFoundException e) {
            System.out.println("Flight not found!");
        }
    }
}
