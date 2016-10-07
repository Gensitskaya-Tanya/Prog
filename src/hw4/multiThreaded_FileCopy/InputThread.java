package hw4.multiThreaded_FileCopy;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/**

 */
public class InputThread implements Runnable {
	private Monitor action;
	private String inputPath;

	public InputThread(Monitor action, String inputPath) {
		this.action = action;
		this.inputPath = inputPath;
	}

	@Override
	public void run() {

		try (InputStream is = new FileInputStream(new File(inputPath))) {
			byte[] buffer = new byte[1024];
			int length;
			while ((length = is.read(buffer)) > 0) {
				action.setBuffer(Arrays.copyOf(buffer, length), length);
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			action.setStop(true);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
