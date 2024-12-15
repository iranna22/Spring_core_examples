package com.iranna.constructorInjection;



public class Student1 {
    private int id;
    private String name;

    // Constructor
    public Student1(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
