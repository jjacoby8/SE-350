package com.joshuacjacoby;

import com.joshuacjacoby.exceptions.BadParameterException;
import com.joshuacjacoby.exceptions.NullParameterException;

import java.util.Date;

public interface ExpensiveObject {
    void createFlight(String type, Airline airline, Airport origin, Airport destination, String flightNumber, Date departureTime, int passengerCapacity) throws BadParameterException, NullParameterException;
    Flight getFlightByNumber(String flightNumber) throws BadParameterException;
}

