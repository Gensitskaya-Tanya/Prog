package otherHW.group;

/**
 * Created by Tanya on 07.10.2016.
 */
import java.util.Comparator;

/**
 * Created by Hamster4n.
 */
public class Student extends Human implements CalledToArmyable {
	private String group;
	private int course;
	private String department;

	public Student(boolean sex, int age, double weigth, double growth, String name, String group, int course, String department) {
		super(sex, age, weigth, growth, name);
		this.group = group;
		this.course = course;
		this.department = department;
	}

	public Student() {
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public int getCourse() {
		return course;
	}

	public void setCourse(int course) {
		this.course = course;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public void print() {
		System.out.println("My name is " + super.getName() + ". I am learning in " + group + " group, " + course +
				" course, " + department + " department.");
	}

	@Override
	public boolean isInductee() {
		if (super.isSex() && super.getAge() > 18){
			return true;
		} else return false;
	}

	@Override
	public String toString() {
		return "\n course= " + course + ", department= " + department + ", " + super.toString();
	}

	public static Comparator<Student> nameStudent = new Comparator<Student>() {
		@Override
		public int compare(Student o1, Student o2) {
			if (o1 == null ){
				return 1;
			} else if (o2 == null){
				return -1;
			} else return o1.getName().compareTo(o2.getName());

		}
	};

	public static Comparator<Student> departmentStudent = new Comparator<Student>() {
		@Override
		public int compare(Student o1, Student o2) {
			if (o1 == null){
				return 1;
			} else if (o2 == null){
				return -1;
			} else return o1.getDepartment().compareTo(o2.getDepartment());
		}
	};

	public static Comparator<Student> courseStudent = new Comparator<Student>() {
		@Override
		public int compare(Student o1, Student o2) {
			if (o1 == null){
				return 1;
			} else if(o2 == null){
				return -1;
			} else return o1.getCourse() - o2.getCourse();
		}
	};


}
