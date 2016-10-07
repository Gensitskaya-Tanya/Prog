package hw4.multiThead_FileFind;

import java.io.File;
import java.util.ArrayList;

public class FinderDirectory {
	private ArrayList<File> directotyList = new ArrayList<>();

	public FinderDirectory() {

	}

	public void findAllDirectory(File pathDirectory) {
		File[] listFile = pathDirectory.listFiles();
		if (listFile != null) {
			for (int i = 0; i < listFile.length; i++) {
				if (listFile[i].isDirectory()) {
					directotyList.add(listFile[i]);
					findAllDirectory(listFile[i]);
				}
			}
		}
	}

	public void findFileByRecursia(File dir, String fileName) {
		String pattern = fileName;
		File[] listFile = dir.listFiles();

		if (listFile != null) {
			for (int i = 0; i < listFile.length; i++) {
				if (listFile[i].isDirectory()) {
					findFileByRecursia(listFile[i], fileName);
				} else {
					if (listFile[i].getName().equals(pattern)) {
						System.out.println(listFile[i].getPath());
					}
				}
			}
		}
	}

	public void printDirectoryFromList() {
		for (File aDirectotyList : directotyList) {
			System.out.println(aDirectotyList);
		}
	}

	public ArrayList<File> getDirectotyList() {
		return directotyList;
	}
}