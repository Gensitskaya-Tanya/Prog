package hw4.multiThreaded_FileCopy;

import java.io.File;
import java.io.IOException;

/**

 */
public class ProgressThread implements Runnable {
	private Monitor action;
	private String inputPath;
	private String outputPath;

	public ProgressThread(Monitor action, String inputPath, String outputPath) {
		this.action = action;
		this.inputPath = inputPath;
		this.outputPath = outputPath;
	}


	@Override
	public void run() {
		File file = new File(inputPath);
		File newFile = new File(outputPath);
		long fileSize = file.length();
		System.out.println("progress copy file " + inputPath + " in _%_ :");
		double result = 0;
		while (!action.isStop()){
			long fileNewSize = newFile.length();
			result = (fileNewSize * 100) / fileSize;
			displayStatusBar(result);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		if (result != 100) {
			displayStatusBar(100);
		}
	}

//	public void run() {
//		long fileSize = monitor.getFile().length();
//		double result = 0;
//		while (!monitor.isComplete()) {
//			long newFileSize = monitor.getNewFile().length();
//			result = newFileSize * 100 / fileSize;
//			displayStatusBar(result);
//			try {
//				Thread.sleep(500);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
//		if (result != 100) {
//			displayStatusBar(100);
//		}
//
//	}


	private void displayStatusBar(double result) {
		StringBuilder sb = new StringBuilder();
		sb.append("\r");
		sb.append(result).append("% ");
		sb.append("[");
		for (int i = 0; i < 100; i++) {
			if (i % 2 == 0) {
				if (i <= result) {
					sb.append("=");
				} else {
					sb.append(".");
				}
			}
		}
		sb.append("]");
		try {
			System.out.write(sb.toString().getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Monitor getAction() {
		return action;
	}

	public String getInputPath() {
		return inputPath;
	}

	public String getOutputPath() {
		return outputPath;
	}
}
