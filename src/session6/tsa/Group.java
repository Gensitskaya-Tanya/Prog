package com.gmail.tsa;

import java.util.ArrayList;

public class Group {
	
	public Group(String name) {
		super();
		this.name = name;
	}
	private String name;
	private ArrayList<Student> al=new ArrayList<>();
	public void addStudent(Student a){
		al.add(a);
	}
	public Student[] getGroup(){
		Student[] starr=new Student[al.size()];
		for(int i=0;i<al.size();i++){
			starr[i]=al.get(i);
		}
		return starr;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
