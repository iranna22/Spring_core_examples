package com.iranna.setterInjection;


public class Address {
    private String city;
    private String state;

    // Setter for city
    public void setCity(String city) {
        this.city = city;
    }

    // Setter for state
    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return city + ", " + state;
    }
}
