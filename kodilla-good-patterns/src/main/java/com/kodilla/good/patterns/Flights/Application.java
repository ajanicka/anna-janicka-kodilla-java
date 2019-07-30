package com.kodilla.good.patterns.Flights;

class Application {

    public static void main(String[] args) {
        FlightsRetriever retriever = new FlightsRetriever();

        FlightService service = new FlightService();
        System.out.println("Flights from Wrocław:");
        service.findAllFlightsFrom(retriever.retrieve(), "Wrocław").stream().forEach(System.out::println);

        System.out.println("\nFlights to Wrocław:");
        service.findAllFlightsTo(retriever.retrieve(), "Wrocław").stream().forEach(System.out::println);

        System.out.println("\nTransfer flights from Wrocław to Gdańsk:");
        service.findAllTransferFlightsFromTo(retriever.retrieve(), "Wrocław", "Gdańsk").stream().forEach(System.out::println);
    }
}
