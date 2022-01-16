package com.joshuacjacoby;

import com.joshuacjacoby.exceptions.BadParameterException;
import com.joshuacjacoby.exceptions.NullParameterException;

import java.util.Date;
import java.util.UUID;

public class TravelManager {

    public static void main(String[] args) throws BadParameterException, NullParameterException {
	    Airport airport = new Airport("ABC");
        Airline airline = new Airline("Delta");

        UUID uuid = UUID.randomUUID();
        Flight flight = new Flight(airline, airport, airport, uuid.toString(), new Date());
       /*System.out.println("Flight " + flight.getFlightNumber()
                + " for " + flight.getAirline() + " airlines"
                + " will be departing " + flight.getOrigin() + " airport"
                + " at " + flight.getDepartureTime()
                + " with destination of " + flight.getDestination() + " airport."); */

        System.out.println(flight);
    }
}
