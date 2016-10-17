package otherHW.group;

/**
 * Created by Tanya on 07.10.2016.
 */
public class MyException extends Exception {
	@Override
	public String getMessage() {
		return "In this group already has 10 students.";
	}
}