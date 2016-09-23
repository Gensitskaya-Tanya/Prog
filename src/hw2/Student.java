package hw2;


import java.io.Serializable;

public class Student extends Human implements Serializable {
	private String university;
	private int course;
	private String group;

	public Student(String lastName, String firsttName, int age, int weight, String sex, String university, int course, String group) {
		super(lastName, firsttName, age, weight, sex);
		this.university = university;
		this.course = course;
		this.group = group;
	}

	@Override
	public String toString() {
		return "Student: " +
				"university= " + university +
				", course= " + course +
				", group= " + group + ", "+ super.toString();
	}
}
