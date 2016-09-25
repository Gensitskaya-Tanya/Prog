package hw3.copyFilesFromCatalog;

/**
 * 1. Напишите программу которая скопирует файлы (с заранее
 определенным  расширением  —  например  только  doc)  из
 каталога источника в каталог приемник.
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

	public CopyFileFromCatalog(String inputPath, String outputPath, String[] pathname) {
		this.inputPath = inputPath;
		this.outputPath = outputPath;
		useMyFileFilter(pathname);
	}

	private void useMyFileFilter(String[] pathname) {
		this.file = new File(inputPath);
		FileFilter mFF = new MyFileFilter(pathname);
		File[] fileList = file.listFiles(mFF);
		this.fileNamesArray = new String[fileList.length];
		for (int i = 0; i < fileNamesArray.length; i++) {
			fileNamesArray[i] = fileList[i].getName();
		}
	}

	public boolean copyTextToNewFiles() {
		for (String filename : fileNamesArray) {
			try (InputStream is = new FileInputStream(new File(inputPath + filename));
				 OutputStream os = new FileOutputStream(new File(outputPath + filename))) {
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
