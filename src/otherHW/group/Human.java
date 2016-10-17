package otherHW.group;

/**
 * Created by Tanya on 07.10.2016.
 */
public class Human {
	private boolean sex;
	private int age;
	private double weigth;
	private double growth;
	private String name;

	public Human(boolean sex, int age, double weigth, double growth, String name) {
		this.sex = sex;
		this.age = age;
		this.weigth = weigth;
		this.growth = growth;
		this.name = name;
	}

	public Human() {
	}

	public boolean isSex() {
		return sex;
	}

	public void setSex(boolean sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getWeigth() {
		return weigth;
	}

	public void setWeigth(double weigth) {
		this.weigth = weigth;
	}

	public double getGrowth() {
		return growth;
	}

	public void setGrowth(double growth) {
		this.growth = growth;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void print(){
		System.out.println("My name is " + name + ". I am a " + (sex == true ? "boy. " : "girl. ") +
				"My age is " + age + ". My weigth is " + weigth + ". And peoples say, that may grows is " + growth + " sm.");
	}

	@Override
	public String toString() {
		return "sex= " + sex + ",   age= " + age + ", weigth= " + weigth + ", growth= " + growth + ", name= " + name;
	}


}