package com.joshuacjacoby;

import com.joshuacjacoby.exceptions.BadParameterException;
import com.joshuacjacoby.exceptions.NullParameterException;

import java.util.Date;

public class CommercialFlight extends Flight {

    public CommercialFlight(Airline airline, Airport origin, Airport destination, String flightNumber, Date departureTime) throws NullParameterException, BadParameterException {
        setAirline(airline);
        setOrigin(origin);
        setDestination(destination);
        setFlightNumber(flightNumber);
        setDepartureTime(departureTime);
    }
}
