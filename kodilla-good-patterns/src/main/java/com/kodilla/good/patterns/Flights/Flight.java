package com.kodilla.good.patterns.Flights;

import java.time.LocalTime;

class Flight {
    String from;
    String to;
    LocalTime time;

    public Flight(String from, String to, LocalTime time) {
        this.from = from;
        this.to = to;
        this.time = time;
    }
}
