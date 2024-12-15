package com.iranna.constructorInjection;



import java.util.Map;

public class School1 {
    private String name;
    private Map<String, String> info; // Map of String values
    private Map<Integer, Student1> students; // Map of dependent objects

    // Constructor
    public School1(String name, Map<String, String> info, Map<Integer, Student1> students) {
        this.name = name;
        this.info = info;
        this.students = students;
    }

    @Override
    public String toString() {
        return "School1{" +
                "name='" + name + '\'' +
                ", info=" + info +
                ", students=" + students +
                '}';
    }
}
