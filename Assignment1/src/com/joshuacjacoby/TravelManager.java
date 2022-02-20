package com.joshuacjacoby;

import com.joshuacjacoby.exceptions.BadParameterException;
import com.joshuacjacoby.exceptions.NullParameterException;

import java.util.Date;
import java.util.UUID;

public class TravelManager {

    public static void main(String[] args) throws BadParameterException, NullParameterException {
        FlightManager flightManager = FlightManager.getInstance();

	    Airport airport = AirportFactory.createAirport("ABC");
        Airline airline = AirlineFactory.createAirport("Delta");

        String flightNumber = UUID.randomUUID().toString();
        flightManager.createFlight("Commercial", airline, airport, airport, flightNumber, new Date(), 0);

        String flightNumber2 = UUID.randomUUID().toString();
        flightManager.createFlight("Passenger", airline, airport, airport, flightNumber2, new Date(), 40);

        System.out.println(flightManager.getFlightByNumber(flightNumber));
        System.out.println(flightManager.getFlightByNumber(flightNumber2));
    }
}
