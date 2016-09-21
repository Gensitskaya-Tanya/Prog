package hw3;


import java.io.*;

public class CopyFile {

	public static void main(String[] args) {
		String [] arr = {"docx"};
		CopyFile cp = new CopyFile("F:\\__one\\", "F:\\__two\\");
		cp.createNewEmptyFiles();
		cp.copyTextToNewEmptyFiles();

	}

	private String inputPath;
	private String outputPath;
	private File file;
	private String[] fileNamesArray;

	public CopyFile() {
	}

	public CopyFile(String inputPath, String outputPath) {
		this.inputPath = inputPath;
		this.outputPath = outputPath;
		this.file = new File(inputPath);
		this.fileNamesArray = file.list();
	}

	public CopyFile(String inputPath, String outputPath, String [] pathname) {
		this.inputPath = inputPath;
		this.outputPath = outputPath;
		useMyFileFilter(pathname);

	}

	private final void useMyFileFilter (String [] pathname){
		this.file = new File(inputPath);
		FileFilter mFF =  new MyFileFilter(pathname);
		File[] fileList = file.listFiles(mFF);
		this.fileNamesArray = new String[fileList.length];
		for (int i=0; i<fileNamesArray.length; i++){
			fileNamesArray[i] =fileList[i].getName();
		}
	}


	public boolean createNewEmptyFiles() {
		File fileForCreate;
		if (file.isDirectory()) {
			for (String filename : fileNamesArray) {
				fileForCreate = new File(outputPath + filename);
				try {
					fileForCreate.createNewFile();
				} catch (IOException e) {
					e.printStackTrace();
					return false;
				}
			}
		}
		return true;
	}

	public  boolean copyTextToNewEmptyFiles() {
		for (String filename : fileNamesArray){
			try (InputStream is = new FileInputStream(new File(inputPath+filename));
					OutputStream os = new FileOutputStream(new File(outputPath+filename))) {
				 byte[] buffer = new byte[1024];
				 int length;
				 while ((length = is.read(buffer)) > 0) {
				os.write(buffer, 0, length);
			}
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
		}
		return true;
	}


	public String getInputPath() {
		return inputPath;
	}

	public String getOutputPath() {
		return outputPath;
	}

	public String[] getFileNamesArray() {
		return fileNamesArray;
	}
}
