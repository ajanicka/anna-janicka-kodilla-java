package com.kodilla.good.patterns.Flights;

class Flight {
    String from;
    String to;

    public Flight(String from, String to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                '}';
    }
}