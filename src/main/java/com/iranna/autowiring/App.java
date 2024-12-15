package com.iranna.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationAutowire.xml");
//		Car carByName = (Car) context.getBean("carByName");
//        System.out.println("By Name: " + carByName);

        // By Type
		/*
		 * Car carByType = (Car) context.getBean("carByType");
		 * System.out.println("By Type: " + carByType);
		 */
        // By Constructor
        Car carByConstructor = (Car) context.getBean("carByConstructor");
        System.out.println("By Constructor: " + carByConstructor);
	}

}
