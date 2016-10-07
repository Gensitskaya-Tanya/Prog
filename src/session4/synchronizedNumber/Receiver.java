package session4.synchronizedNumber;

/**
 * Created by Tanya on 28.09.2016.
 */
public class Receiver implements Runnable {
	private Action action;
	public Receiver(Action action) {
		this.action = action;
	}
	@Override
	public void run() {
		for (; !action.isStop();) {
			int number = action.getValue();
		}
	}
}
