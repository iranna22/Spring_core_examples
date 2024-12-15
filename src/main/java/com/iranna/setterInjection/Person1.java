package com.iranna.setterInjection;


import java.util.List;

public class Person1 {
    private int id;
    private String name;
    private Address address; // Object injection
    private List<Address> previousAddresses; // Collection of objects

    // Setter for id
    public void setId(int id) {
        this.id = id;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Setter for address
    public void setAddress(Address address) {
        this.address = address;
    }

    // Setter for previousAddresses
    public void setPreviousAddresses(List<Address> previousAddresses) {
        this.previousAddresses = previousAddresses;
    }

    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Current Address: " + address);
        System.out.println("Previous Addresses:");
        for (Address addr : previousAddresses) {
            System.out.println(" - " + addr);
        }
    }
}

