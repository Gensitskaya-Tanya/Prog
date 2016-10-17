package hw5.streamApi.group;
public class Student {
	private String name;
	private String sername;
	private int age;
	private String dep;

	public Student(String name, String sername, int age, String dep) {
		this.name = name;
		this.sername = sername;
		this.age = age;
		this.dep = dep;
	}

	public Student() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSername() {
		return sername;
	}

	public void setSername(String sername) {
		this.sername = sername;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDep() {
		return dep;
	}

	public void setDep(String dep) {
		this.dep = dep;
	}

	@Override
	public String toString() {
		return "Student {"+name+" "+sername + ", "+age+" years; "+dep+" dep.}";
	}



}