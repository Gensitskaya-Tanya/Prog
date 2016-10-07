package hw4.multiThead_FileFind;

import java.io.File;


public class FileFinderThread implements Runnable {
	private File dyrectory;
	private String fileName;

	public FileFinderThread(File dyrectory, String fileName) {
		this.dyrectory = dyrectory;
		this.fileName = fileName;
	}

	@Override
	public void run() {
		File [] listFile = dyrectory.listFiles();
		if(listFile != null) {
			for(int i=0; i<listFile.length; i++) {
				if(listFile[i].getName().equals(fileName)) {
					System.out.println(listFile[i].getPath());
				}
			}
		}
	}

}
