package com.iranna.autowiring;

public class Engine {
	private String type;

    public Engine() {}

    public Engine(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Engine Type: " + type;
    }
}
