package com.iranna.constructorInjection;

import java.util.List;

public class School {
	private String name;
	private List<Student> students; // Collection of dependent objects

	// Constructor
	public School(String name, List<Student> students) {
		this.name = name;
		this.students = students;
	}

	@Override
	public String toString() {
		return "School{" + "name='" + name + '\'' + ", students=" + students + '}';
	}
}
