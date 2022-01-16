package com.joshuacjacoby;


import com.joshuacjacoby.exceptions.BadParameterException;

import java.util.Objects;

public class Airline {
    private String name;

    public Airline(String name) throws BadParameterException {
        setName(name);
    }

    private void setName(String name) throws BadParameterException {
        if (name.length() >= 8) {
            throw new BadParameterException("Airline name must be less than 8 characters.");
        }

        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Airline airline = (Airline) o;
        return getName().equals(airline.getName());
    }

    @Override
    public String toString() {
        return "Airline{" +
                "name='" + name + '\'' +
                '}';
    }
}
