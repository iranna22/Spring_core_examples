package com.iranna.constructorInjection;

public class Car {
	private String brand;
	private Engine engine; // Dependent object

	// Constructor
	public Car(String brand, Engine engine) {
		this.brand = brand;
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Car{" + "brand='" + brand + '\'' + ", engine=" + engine + '}';
	}
}
