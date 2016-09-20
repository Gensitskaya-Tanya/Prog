package hw2;


public class StudentIndexOutOfBoundsException extends Exception {

	@Override
	public String getMessage() {
		return "You can not add new student, generate IndexOutOfBoundsException";
	}


}
