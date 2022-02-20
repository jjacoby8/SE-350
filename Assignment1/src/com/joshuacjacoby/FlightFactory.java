package com.joshuacjacoby;

import com.joshuacjacoby.exceptions.BadParameterException;
import com.joshuacjacoby.exceptions.NullParameterException;

import java.util.Date;

public class FlightFactory {

    private FlightFactory() {}

    public static Flight createFlight(String type, Airline airline, Airport origin, Airport destination, String flightNumber, Date departureTime, int passengerCapacity) throws NullParameterException, BadParameterException {
        if (type == null) throw new NullParameterException("Type of flight was null.");
        if (airline == null) throw new NullParameterException("Airline for flight was null.");
        if (origin == null) throw new NullParameterException("Origin of flight was null.");
        if (destination == null) throw new NullParameterException("Destination of flight was null.");
        if (flightNumber == null) throw new NullParameterException("Number of flight was null.");
        if (departureTime == null) throw new NullParameterException("Departure time of flight was null.");

        if (type.length() == 0) throw new BadParameterException("Type was empty.");
        if (flightNumber.length() == 0) throw new BadParameterException("Flight number was empty.");

        switch (type) {
            case "Commercial": return new CommercialFlight(airline, origin, destination, flightNumber, departureTime);
            case "Passenger":
                if(passengerCapacity <= 0) throw new BadParameterException("Passenger capacity for Passenger Flights must be larger than 0.");
                return new PassengerFlight(airline, origin, destination, flightNumber, departureTime, passengerCapacity);
            default: throw new BadParameterException("Type was not a valid flight.");
        }
    }
}
