package hw2;


public class Human {
	private String lastName;
	private String firstName;
	private int age;
	private int weight;
	private String sex;

	public Human() {
	}

	public Human(String lastName, String firsttName, int age, int weight, String sex) {
		this.lastName = lastName;
		this.firstName = firsttName;
		this.age = age;
		this.weight = weight;
		this.sex = sex;
	}

	@Override
	public String toString() {
		return 	"Human: " + "lastName= " + lastName  +
				", firstName= " + firstName +
				", age= " + age +
				", weight=" + weight +
				", sex= " + sex;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
}
