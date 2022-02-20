package com.joshuacjacoby;

import com.joshuacjacoby.exceptions.BadParameterException;
import com.joshuacjacoby.exceptions.NullParameterException;

import java.util.ArrayList;
import java.util.Date;

public final class FlightManager {
    private static FlightManager instance;
    private static ArrayList<Flight> flights;

    /*
    public ArrayList<Flight> getFlights() {
        ArrayList<Flight> copyFlights = new ArrayList<>(flights);
        return copyFlights;
    }
    */

    private FlightManager() {
        flights = new ArrayList<>();
    }

    public static FlightManager getInstance() {
        if (instance == null) {
            instance = new FlightManager();
        }
        return instance;
    }

    public static void createFlight(String type, Airline airline, Airport origin, Airport destination, String flightNumber, Date departureTime, int passengerCapacity) throws BadParameterException, NullParameterException {
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
