package session1;

/**
 * Created by ZaR on 03-Sep-16.
 */
public class Animal {
	private String color;
	private int age;
	private String racion;

	public Animal() {

	}

	public Animal(String color, int age, String racion) {
		this.color = color;
		this.age = age;
		this.racion = racion;
	}

	protected void getVoice() {
		System.out.println("Animal");
	}


	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getRacion() {
		return racion;
	}

	public void setRacion(String racion) {
		this.racion = racion;
	}

	@Override
	public String toString() {
		return "color= " + color + " " + ", age= " + age + ", racion= " + racion + " ";
	}
}
