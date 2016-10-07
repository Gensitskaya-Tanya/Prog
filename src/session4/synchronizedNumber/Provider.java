package session4.synchronizedNumber;

import java.util.Random;

/**

 */
public class Provider implements Runnable {
	private Action action;
	private Random rn = new Random();

	public Provider(Action action) {
		this.action = action;
	}
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			int randomNumber = rn.nextInt(100);
			action.setValue(randomNumber);
			System.out.println(i);
		}
		action.setStop(true);
	}
}
