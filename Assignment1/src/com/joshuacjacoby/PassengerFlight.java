package com.joshuacjacoby;

import com.joshuacjacoby.exceptions.BadParameterException;
import com.joshuacjacoby.exceptions.NullParameterException;

import java.util.Date;

public class PassengerFlight extends Flight {

    int passengerCapacity;

    public int getPassengerCapacity() { return passengerCapacity; }
    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public PassengerFlight(Airline airline, Airport origin, Airport destination, String flightNumber, Date departureTime, int passengerCapacity) throws NullParameterException, BadParameterException {
        setAirline(airline);
        setOrigin(origin);
        setDestination(destination);
        setFlightNumber(flightNumber);
        setDepartureTime(departureTime);
        setPassengerCapacity(passengerCapacity);
    }

    @Override
    public String toString() {
        return "Flight{" +
                "airline=" + getAirline() +
                ", origin=" + getOrigin() +
                ", destination=" + getDestination() +
                ", flightNumber='" + getFlightNumber() + '\'' +
                ", departureTime=" + getDepartureTime() +
                ", passengerCapacity=" + getPassengerCapacity() +
                '}';
    }
}
