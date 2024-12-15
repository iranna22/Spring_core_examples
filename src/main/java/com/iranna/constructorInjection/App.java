package com.iranna.constructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
     // Load the Spring context
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationConstructorInjection.xml");

        // Get the Person bean
        Person person = (Person) context.getBean("person");

        // Print the Person details
        System.out.println(person);   
        
        Car car =  context.getBean("car",Car.class);
        System.out.println(car);
        
        School school =  (School) context.getBean("school");
        System.out.println(school);
        
        School1 school1 = (School1) context.getBean("school1");
        System.out.println(school1);
    }
}
