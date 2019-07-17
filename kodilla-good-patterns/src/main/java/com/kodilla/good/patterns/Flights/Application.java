package com.kodilla.good.patterns.Flights;

class Application {

    public static void main(String[] args) {
        FlightsRetriever retriever = new FlightsRetriever();

        FlightService service = new FlightService();
        service.findAllFlightsFrom(retriever.retrieve(), "Wrocław");
        service.findAllFlightsTo(retriever.retrieve(), "Wrocław");
    }
}
