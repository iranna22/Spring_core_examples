package com.iranna.setterInjection;

import java.util.List;

//Person.java
public class Person {
 private int id;
 private String name;
 private String address;
 private List<String> hobbies;

 // Setter for id
 public void setId(int id) {
     this.id = id;
 }

 // Setter for name
 public void setName(String name) {
     this.name = name;
 }

 // Setter for address
 public void setAddress(String address) {
     this.address = address;
 }

 // Setter for hobbies
 public void setHobbies(java.util.List<String> hobbies) {
     this.hobbies = hobbies;
 }

 public void display() {
     System.out.println("ID: " + id);
     System.out.println("Name: " + name);
     System.out.println("Address: " + address);
     System.out.println("Hobbies: " + hobbies);
 }
}

