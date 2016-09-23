package hw3.copyFilesFromCatalog;

/**
 * 1. Напишите программу которая скопирует файлы (с заранее
 определенным  расширением  —  например  только  doc)  из
 каталога источника в каталог приемник.
 */
public class Main {
	public static void main(String[] args) {
		CopyFileFromCatalog cp = new CopyFileFromCatalog("F:\\__one\\", "F:\\__two\\");
		cp.copyTextToNewFiles();

	}
}
