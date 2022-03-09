package com.joshuacjacoby;

import com.joshuacjacoby.exceptions.BadParameterException;
import com.joshuacjacoby.exceptions.NullParameterException;

import java.util.Date;

public class FlightManagerProxy implements ExpensiveObject {
    private static ExpensiveObject object;

    @Override
    public void createFlight(String type, Airline airline, Airport origin, Airport destination, String flightNumber, Date departureTime, int passengerCapacity) throws BadParameterException, NullParameterException {
        if (object == null) {
            object = FlightManager.getInstance();
        }
        System.out.println("A flight is being created...");
        object.createFlight(type, airline, origin, destination, flightNumber, departureTime, passengerCapacity);
    }

    @Override
    public Flight getFlightByNumber(String flightNumber) throws BadParameterException {
        if (object == null) {
            object = FlightManager.getInstance();
        }
        System.out.println("Flight number [" + flightNumber + "] is being retrieved...");
        return object.getFlightByNumber(flightNumber);
    }
}
