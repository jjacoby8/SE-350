package com.joshuacjacoby;

import com.joshuacjacoby.exceptions.BadParameterException;
import com.joshuacjacoby.exceptions.NullParameterException;

import java.util.Date;
import java.util.Objects;

public class Flight {

    private Airline airline;
    private Airport origin;
    private Airport destination;
    private String flightNumber;
    private Date departureTime;

    @Override
    public String toString() {
        return "Flight{" +
                "airline=" + airline +
                ", origin=" + origin +
                ", destination=" + destination +
                ", flightNumber='" + flightNumber + '\'' +
                ", departureTime=" + departureTime +
                '}';
    }

    public Flight(Airline airline, Airport origin, Airport destination, String flightNumber, Date departureTime) throws NullParameterException, BadParameterException {
        setAirline(airline);
        setOrigin(origin);
        setDestination(destination);
        setFlightNumber(flightNumber);
        setDepartureTime(departureTime);
    }

    public String getAirline() {
        return airline.getName();
    }

    public void setAirline(Airline airline) throws NullParameterException {
        if (airline == null) {
            throw new NullParameterException("Null value passed in for airline.");
        }
        this.airline = airline;
    }

    public String getOrigin() {
        return origin.getName();
    }

    public void setOrigin(Airport origin) throws NullParameterException {
        if (origin == null) {
            throw new NullParameterException("Null value passed in for origin.");
        }
        this.origin = origin;
    }

    public String getDestination() {
        return destination.getName();
    }

    public void setDestination(Airport destination) throws NullParameterException {
        if (destination == null) {
            throw new NullParameterException("Null value passed in for destination.");
        }
        this.destination = destination;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) throws BadParameterException, NullParameterException {
        if (flightNumber == null) {
            throw new NullParameterException("Null value passed in for flightNumber.");
        }
        if (flightNumber.equals("")) {
            throw new BadParameterException("Empty string passed in for flightNumber.");
        }
        this.flightNumber = flightNumber;
    }

    public Date getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Date departureTime) throws NullParameterException {
        if (departureTime == null) {
            throw new NullParameterException("Null value passed in for departureTime");
        }
        this.departureTime = departureTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return getAirline().equals(flight.getAirline()) && getOrigin().equals(flight.getOrigin()) && getDestination().equals(flight.getDestination()) && getFlightNumber().equals(flight.getFlightNumber()) && getDepartureTime().equals(flight.getDepartureTime());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAirline(), getOrigin(), getDestination(), getFlightNumber(), getDepartureTime());
    }
}
