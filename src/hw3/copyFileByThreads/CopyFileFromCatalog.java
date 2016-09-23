package hw3.copyFileByThreads;

/**
 * Реализуйте многопоточное копирование каталога,
 содержащего несколько файлов.
 */
import java.io.*;

public class CopyFileFromCatalog {

	private String inputPath;
	private String outputPath;
	private File file;
	private String[] fileNamesArray;

	public CopyFileFromCatalog() {
	}

	public CopyFileFromCatalog(String inputPath, String outputPath) {
		this.inputPath = inputPath;
		this.outputPath = outputPath;
		this.file = new File(inputPath);
		this.fileNamesArray = file.list();
	}


	public void copyFilesFromCatalogByThread() {
		Thread thread1 = new Thread(new Runnable() {
			@Override
			public void run() {
				copyFilesFromCatalog(0, fileNamesArray.length/2);
			}
		});
		Thread thread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				copyFilesFromCatalog(fileNamesArray.length/2, fileNamesArray.length);
			}
		});
		thread1.start();
		thread2.start();
	}

	private void  copyFilesFromCatalog(int firstIndexArray, int nextIndexArray){
		for (int i = firstIndexArray; i <nextIndexArray; i++) {
			try (InputStream is = new FileInputStream(new File(inputPath + fileNamesArray[i]));
				 OutputStream os = new FileOutputStream(new File(outputPath + fileNamesArray[i]))) {
				byte[] buffer = new byte[1024];
				int length;
				while ((length = is.read(buffer)) > 0) {
					os.write(buffer, 0, length);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
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

	public File getFile() {
		return file;
	}

	public void setInputPath(String inputPath) {
		this.inputPath = inputPath;
	}

	public void setOutputPath(String outputPath) {
		this.outputPath = outputPath;
	}

	public void setFile(File file) {
		this.file = file;
	}

	public void setFileNamesArray(String[] fileNamesArray) {
		this.fileNamesArray = fileNamesArray;
	}

}
