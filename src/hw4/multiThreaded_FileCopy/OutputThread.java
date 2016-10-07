package hw4.multiThreaded_FileCopy;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**

 */
public class OutputThread implements Runnable {
	private Monitor action;
	private String outputPath;

	public OutputThread(Monitor action, String outputPath) {
		this.action = action;
		this.outputPath = outputPath;
	}


	@Override
	public void run() {

		try (OutputStream os = new FileOutputStream(new File(outputPath))) {
			while (!action.isStop() || action.isBufferNotNull()) {
				os.write(action.getBuffer(), 0, action.getLength());
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
