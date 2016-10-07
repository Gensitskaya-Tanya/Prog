package hw4.multiThead_FileFind;

import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class ThreadPool {


	public void findFileInCatalog(File pathDirectory, String fileName, int numberThreads){

		FinderDirectory finderDirectory = new FinderDirectory();
		finderDirectory.findAllDirectory(pathDirectory);
		ArrayList<File> dyrectoryList = finderDirectory.getDirectotyList();

		ExecutorService exSer = Executors.newFixedThreadPool(numberThreads);


		for (File e : dyrectoryList) {
			exSer.submit(new FileFinderThread(e, fileName));
		}

		exSer.shutdown();

	}

}
