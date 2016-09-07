package hw1.cat;

public class Main {
	public static void main(String[] args) {
		Cat cat1 = new Cat("Burmese", 1 , "male", "snow white", "milk", "Intelligence");
		Cat cat2 = new Cat("Balinese", 2 , "male", "beige", "milk", "Playfulness");
		Cat cat3 = new Cat("Siamese", 4 , "female", "snow white", "milk", "Need for Attention");
		Cat cat4 = new Cat("Persian", 3 , "male", "light brown", "milk", "Good with children");
		Cat cat5 = new Cat("Norwegian", 5 , "female", "white", "milk", "Good with other pets");

		Cat [] catArr = {cat1, cat2, cat3, cat4,cat5};
		for(int i=0; i<catArr.length; i++ ){
			System.out.println(catArr[i].playWithCat());
			System.out.println(catArr[i].feedCat());
		}


	}
}
