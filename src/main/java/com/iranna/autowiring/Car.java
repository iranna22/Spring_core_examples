package com.iranna.autowiring;

public class Car {
	private Engine engine1;

    // Autowiring by Constructor
	 public Car() {
			super();
		}

    public Car(Engine engine1) {
        this.engine1 = engine1;
    }

   
	public Engine getengine1() {
        return engine1;
    }

    public void setengine1(Engine engine1) {
        this.engine1 = engine1;
    }

    @Override
    public String toString() {
        return "Car with " + engine1;
    }
}
