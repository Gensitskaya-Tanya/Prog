package hw5.dictionary;

/**
 * Created by Tanya on 15.10.2016.
 */
public class WordAlreadyExistsException extends Exception{

	@Override
	public void printStackTrace() {
		super.printStackTrace();
		System.out.println("Word already exists");
	}
}
