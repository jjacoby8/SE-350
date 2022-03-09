package com.joshuacjacoby;

import com.joshuacjacoby.exceptions.BadParameterException;
import com.joshuacjacoby.exceptions.NullParameterException;

import java.util.ArrayList;
import java.util.Date;

public final class FlightManager implements ExpensiveObject {
    private static FlightManager instance;
    private static ArrayList<Flight> flights;

    private FlightManager() {
        flights = new ArrayList<>();
    }

    public static FlightManager getInstance() {
        if (instance == null) {
            instance = new FlightManager();
        }
        return instance;
    }

    public void createFlight(String type, Airline airline, Airport origin, Airport destination, String flightNumber, Date departureTime, int passengerCapacity) throws BadParameterException, NullParameterException {
        Flight newFlight = FlightFactory.createFlight(type, airline, origin, destination, flightNumber, departureTime, passengerCapacity);
        flights.add(newFlight);
    }

    public Flight getFlightByNumber(String flightNumber) throws BadParameterException {
        for (Flight flight : flights) {
            if (flight.getFlightNumber().equals(flightNumber)) return flight;
        }
        throw new BadParameterException("Flight " + flightNumber + " was not found in registered flights.");
    }
}
