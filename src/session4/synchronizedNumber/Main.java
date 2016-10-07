package session4.synchronizedNumber;

/**
 * Created by Tanya on 28.09.2016.
 */
public class Main {
	public static void main(String[] args) {
		Action action = new Action();
		Provider provider = new Provider(action);
		Receiver receiver = new Receiver(action);

		Thread threadOne = new Thread(provider);
		Thread threadTwo = new Thread(receiver);

		threadOne.start();
		threadTwo.start();

	}
}
