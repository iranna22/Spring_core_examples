package com.iranna.constructorInjection;

import java.util.List;

public class Person {
    private int age;
    private String name;
    private List<String> hobbies;

    // Constructor for constructor injection
    public Person(int age, String name, List<String> hobbies) {
        this.age = age;
        this.name = name;
        this.hobbies = hobbies;
    }

    // Getters
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    @Override
    public String toString() {
        return "Person [age=" + age + ", name=" + name + ", hobbies=" + hobbies + "]";
    }
}
