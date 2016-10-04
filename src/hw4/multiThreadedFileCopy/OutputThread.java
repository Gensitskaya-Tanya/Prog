package hw4.multiThreadedFileCopy;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**

 */
public class OutputThread implements Runnable{
	private Action1 action;
	private String outputPath;

	public OutputThread(Action1 action, String outputPath) {
		this.action = action;
		this.outputPath = outputPath;
	}


	@Override
	public void run() {

			try(OutputStream os = new FileOutputStream(new File(outputPath))){
				while (!action.isStop()) {
					os.write(action.getBuffer(), 0, action.getLength());
					System.out.println("os.write");

				}
			} catch (IOException e){
				e.printStackTrace();
			}

	}
}
