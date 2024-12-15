package com.iranna.setterInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationSetterInjection.xml");

        // Get the Person bean
        Person person = (Person) context.getBean("person");
     // Display the injected values
        person.display();
        
        Person1 person1 = (Person1) context.getBean("person1");

        // Display the injected values
        person1.display();
	}

}
