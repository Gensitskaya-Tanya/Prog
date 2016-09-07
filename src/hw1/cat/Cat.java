package hw1.cat;

/**
 * Описать  класс  «Cat»  (в  качестве  образца  можно  взять  домашнего  питомца).
 * Наделить его свойствами и методами. Создать несколько экземпляров объектов этого
 * класса. Использовать эти объекты.
 */
public class Cat {
	private String breed;
	private int age;
	private String sex;
	private String colorFur;
	private String food;
	private String character;

	public Cat(String breed, int age, String sex, String colorFur, String food, String character) {
		this.breed = breed;
		this.age = age;
		this.sex = sex;
		this.colorFur = colorFur;
		this.food = food;
		this.character = character;
	}

	public String playWithCat () {
		return this.getBreed() + " playing now...";
	}
	public String 	feedCat () {
		return this.getBreed() + " eats " + this.food + " now." ;
	}
	@Override
	public String toString() {
		return "Cat{" +
				"breed='" + breed + '\'' +
				", age=" + age +
				", sex='" + sex + '\'' +
				", colorFur='" + colorFur + '\'' +
				", food='" + food + '\'' +
				", character='" + character + '\'' +
				'}';
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getColorFur() {
		return colorFur;
	}

	public void setColorFur(String colorFur) {
		this.colorFur = colorFur;
	}

	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}

	public String getCharacter() {
		return character;
	}

	public void setCharacter(String character) {
		this.character = character;
	}
}
