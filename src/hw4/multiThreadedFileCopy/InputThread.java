package hw4.multiThreadedFileCopy;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**

 */
public class InputThread implements Runnable {
	private Action1 action;
	private String inputPath;

	public InputThread(Action1 action, String inputPath) {
		this.action = action;
		this.inputPath = inputPath;
	}


	@Override
	public void run() {

			try (InputStream is = new FileInputStream(new File(inputPath))) {
				int count = 0;

				byte[] buffer = new byte[1024];
				int length;
					while ((length = is.read(buffer)) > 0) {
						action.setBuffer(buffer, length);
						System.out.println(count);
						count++;
					}

				action.setStop(true);

			}catch (IOException e){
				e.printStackTrace();
			}


	}

}
