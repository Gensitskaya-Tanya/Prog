package hw3.copyFileByThreads;
/**
 * Реализуйте многопоточное копирование каталога,
 содержащего несколько файлов.
 */

public class Main {
	public static void main(String[] args) {
		CopyFileFromCatalog cp = new CopyFileFromCatalog("F:\\__one\\", "F:\\__two\\");
		cp.copyFilesFromCatalogByThread();
	}
}
