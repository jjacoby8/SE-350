package com.joshuacjacoby;

import com.joshuacjacoby.exceptions.BadParameterException;
import com.joshuacjacoby.exceptions.NullParameterException;

import java.util.Date;

public interface Flight {
    String getAirline();
    void setAirline(Airline airline) throws NullParameterException;

    String getOrigin();
    void setOrigin(Airport origin) throws NullParameterException;

    String getDestination();
    void setDestination(Airport destination) throws NullParameterException;

    String getFlightNumber();
    void setFlightNumber(String flightNumber) throws BadParameterException, NullParameterException;

    Date getDepartureTime();
    void setDepartureTime(Date departureTime) throws NullParameterException;

    boolean equals(Object o);
    int hashCode();
}
