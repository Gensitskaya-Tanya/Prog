package com.gmail.tsa;

public class Student {
	
public Student(String name, String lastname, int course) {
		super();
		this.name = name;
		this.lastname = lastname;
		this.course = course;
	}
private String name;
private String lastname;
private int course;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public int getCourse() {
	return course;
}
public void setCourse(int course) {
	this.course = course;
}

}
