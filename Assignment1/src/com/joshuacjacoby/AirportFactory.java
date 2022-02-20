package com.joshuacjacoby;

import com.joshuacjacoby.exceptions.BadParameterException;

import java.util.HashMap;
import java.util.Map;

public class AirportFactory {
    private AirportFactory () { }

    private static Map<String, Airport> airportCache = new HashMap<>();

    public static Airport createAirport(String airportName) throws BadParameterException {
        if (airportName.length() != 3 || !airportName.matches("^[A-Z]*$")) {
            throw new BadParameterException("Airport name must be 3 capitalized letters.");
        }
        Airport airport = airportCache.computeIfAbsent(airportName, newAirport -> {
            try {
                return new Airport(newAirport);
            } catch (BadParameterException e) {
                e.printStackTrace();
                return null;
            }
        });
        return airport;
    }
}
