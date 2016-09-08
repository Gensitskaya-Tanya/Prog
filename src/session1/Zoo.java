package session1;

public class Zoo {
	private Animal[] animalArray = new Animal[10];
	private String zooName;

	public Zoo() {

	}

	public Zoo(String zooName) {
		this.zooName = zooName;
	}

	public String getZooName() {
		return zooName;
	}

	public void setZooName(String zooName) {
		this.zooName = zooName;
	}

	public void addAnimal(Animal animal) {
		if (isAnimal(animal)) {
			for (int i = 0; i < animalArray.length; i++) {
				if (animalArray[i] == null) {
					animalArray[i] = animal;
					return;
				}
			}
		}
	}

	private boolean isAnimal(Animal animal) {
		return animal instanceof Cat || animal instanceof Dog;
	}


	@Override
	public String toString() {
		String res = "";
		res += this.zooName + System.lineSeparator() + "///" + System.lineSeparator();
		for (Animal animal : animalArray) {
			if (animal != null) {
				res += animal + System.lineSeparator();
			}
		}
		return res;

	}
}
