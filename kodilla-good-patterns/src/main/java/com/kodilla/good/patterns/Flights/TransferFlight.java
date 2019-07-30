package com.kodilla.good.patterns.Flights;

class TransferFlight {
    String from;
    String via;
    String to;

    public TransferFlight(String from, String via, String to) {
        this.from = from;
        this.via = via;
        this.to = to;
    }

    @Override
    public String toString() {
        return "TransferFlight{" +
                "from='" + from + '\'' +
                ", via='" + via + '\'' +
                ", to='" + to + '\'' +
                '}';
    }
}
