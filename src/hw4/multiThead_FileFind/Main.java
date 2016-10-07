package hw4.multiThead_FileFind;

import java.io.File;

/**
 3)  Реализуйте  процесс  многопоточного  поиска  файла  в
 файловой системе. Т.е. вы вводите название файла и в какой
 части  файловой  системы  его  искать.  Программа  должна
 вывести на экран все адреса в файловой системе файлов с
 таким названием.
 */
public class Main {
	public static void main(String[] args) {
//		//Search for a file in a single-threaded mode
//		new FinderDirectory().findFileByRecursia(new File("F:\\"), "3.txt");

		//Search files in multithreaded mode
		ThreadPool threadPool = new ThreadPool();
		threadPool.findFileInCatalog(new File("F:\\"), "3.txt", 3);
	}
}
