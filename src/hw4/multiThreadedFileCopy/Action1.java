package hw4.multiThreadedFileCopy;

/**

 */
public class Action1 {
	private byte[] buffer;
	private  int length;
	private boolean turn = false;
	private boolean stop = false;







	public synchronized byte[] getBuffer() {
		while (!turn){
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		byte[] temp = buffer;
		turn = false;
		System.out.println("getBuffer()");
		notifyAll();
		return temp;
	}

	public synchronized void setBuffer(byte[] buffer, int length) {
		while (turn){
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		this.buffer = buffer;
		this.length = length;
		turn = true;
		System.out.println("setBuffer");
		notifyAll();
	}

	public boolean isTurn() {
		return turn;
	}

	public boolean isStop() {
		return stop;
	}

	public void setStop(boolean stop) {
		this.stop = stop;
	}

	public synchronized int getLength() {
		return length;
	}


}
