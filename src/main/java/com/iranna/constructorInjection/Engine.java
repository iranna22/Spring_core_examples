package com.iranna.constructorInjection;

public class Engine {
	private String type;

	// Constructor
	public Engine(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Engine{" + "type='" + type + '\'' + '}';
	}
}
