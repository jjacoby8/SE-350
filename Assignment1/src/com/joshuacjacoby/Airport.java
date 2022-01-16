package com.joshuacjacoby;

import java.security.InvalidParameterException;
import java.util.Objects;

public class Airport {

    private String name;

    public Airport(String name) {
        setName(name);
    }

    private void setName(String name) {
        if (name.length() != 3
                || !name.matches("^[A-Z]*$")) {
            throw new InvalidParameterException("Airport name must be 3 capitalized letters.");
        }

        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Airport airport = (Airport) o;
        return getName().equals(airport.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }

    @Override
    public String toString() {
        return "Airport{" +
                "name='" + name + '\'' +
                '}';
    }
}
