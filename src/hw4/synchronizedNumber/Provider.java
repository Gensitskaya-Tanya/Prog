package hw4.synchronizedNumber;

import hw4.synchronizedNumber.Action;

import java.util.Random;

/**
 * Created by Tanya on 28.09.2016.
 */
public class Provider implements Runnable {
	private Action action;
	private Random rn = new Random();
	public Provider(Action action) {
		super();
		this.action = action;
	}
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			int randomNumber = rn.nextInt(100);
			action.setValue(randomNumber);
		}
		action.setStop(true);
	}
}
