package hw3;

import java.io.File;
import java.io.FileFilter;


public class MyFileFilter implements FileFilter {
	private String[] arrPathNameOfFile;

	public MyFileFilter(String[] arr) {     //{"docx", "pdf", "jpg"}
		this.arrPathNameOfFile = arr;
	}

	private boolean checkPathNameOfFileInArr(String pathname) {
		for (String stringExt : arrPathNameOfFile) {
			if (stringExt.equals(pathname)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean accept(File pathname) {
		int pointerIndex = pathname.getName().lastIndexOf(".");
		if (pointerIndex == -1) {
			return false;
		}
		String ext = pathname.getName().substring(pointerIndex + 1);
		return checkPathNameOfFileInArr(ext);
	}
}
