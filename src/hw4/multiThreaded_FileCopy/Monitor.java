package hw4.multiThreaded_FileCopy;

import java.util.Arrays;

/**

 */
public class Monitor {
	private byte[] buffer;
	private int length;
	private boolean turn = false;
	private boolean stop = false;

	public synchronized byte[] getBuffer() {
		if (!turn) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		byte[] temp = Arrays.copyOf(buffer, length);
		buffer = null;
		turn = false;
//		System.out.println("getBuffer()");
		notifyAll();
		return temp;
	}

	public synchronized void setBuffer(byte[] buffer, int length) {
		if (turn) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		this.buffer = buffer;
		this.length = length;
		turn = true;
//		System.out.println("setBuffer");
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

	public boolean isBufferNotNull() {
		return buffer != null;
	}
}
