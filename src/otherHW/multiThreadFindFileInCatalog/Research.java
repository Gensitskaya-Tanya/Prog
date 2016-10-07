package otherHW.multiThreadFindFileInCatalog;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Research {
	public static ArrayList<String> arr = new ArrayList<String>();
	private static ArrayList<String> arrFile = new ArrayList<String>();

	private static void getListOfFolders(String folder) throws IOException {

		File f1 = new File(folder);
		if (f1.isDirectory()) {
			File[] foldernames = f1.listFiles();
			for (File foldername : foldernames) {
				File fl = new File(foldername.getCanonicalPath());
				if (fl.isDirectory() && (!fl.getName().contains("$"))) {
					arr.add(fl.toString());
					getListOfFolders(fl.toString());
				}

			}
		}

	}

	private void getListOfFiles(String folder, String file) throws IOException {

		File f1 = new File(folder);

		File[] foldernames = f1.listFiles();
		for (File foldername : foldernames) {
			File fl = new File(foldername.getCanonicalPath());
			if (fl.isFile()) {
				if (fl.getName().toString().equals(file)) {
					arrFile.add(fl.getCanonicalPath());
				}
			}
		}
	}

	public void find(String folder, String file, int start, int end) {
		if (arr.size() > 0) {
			for (int i = start; i < end; i++) {
				try {
					getListOfFiles(arr.get(i).toString(), file);
				} catch (IOException e) {
					System.out.println(e);
				}
			}
		}
		for (int i = 0; i < arrFile.size(); i++) {
		}
	}

	public static void multiThread(String folder, String file, int threadNumber) {
		int begin;
		int end;
		try {
			getListOfFolders(folder);
		} catch (IOException e) {
			System.out.println(e);
		}
		// System.out.println(arr.toString());
		CreateThread[] mltThread = new CreateThread[threadNumber];
		int size = arr.size() / threadNumber;
		for (int i = 0; i < threadNumber; i++) {
			begin = size * i;
			end = size * (i + 1);
			if ((arr.size() - end) < size) {
				end = arr.size();
			}
			Research rs = new Research();
			mltThread[i] = new CreateThread(rs, folder, file, begin, end);
		}

		for (int i = 0; i < mltThread.length; i++) {
			try {
				mltThread[i].getThr().join();
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
		if (arrFile.size() > 0) {
			System.out.println("All files were found");
			for (int i = 0; i < arrFile.size(); i++) {
				System.out.println(arrFile.get(i));
			}
		} else {
			System.out.println("Files weren't found");
		}
	}

}
