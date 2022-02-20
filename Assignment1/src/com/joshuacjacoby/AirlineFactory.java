package com.joshuacjacoby;

import com.joshuacjacoby.exceptions.BadParameterException;

import java.util.HashMap;
import java.util.Map;

public class AirlineFactory {
    private AirlineFactory () {}

    private static Map<String, Airline> airlineCache = new HashMap<>();

    public static Airline createAirport(String airlineName) throws BadParameterException {
        if (airlineName.length() >= 8) { throw new BadParameterException("Airline name must be less than 8 characters."); }

        Airline airline = airlineCache.computeIfAbsent(airlineName, newAirline -> {
            try {
                return new Airline(newAirline);
            } catch (BadParameterException e) {
                e.printStackTrace();
                return null;
            }
        });
        return airline;
    }
}
