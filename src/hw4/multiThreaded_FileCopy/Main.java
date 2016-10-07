package hw4.multiThreaded_FileCopy;

/**
 2)  Реализуйте  программу  многопоточного  копирования  файла
 блоками, с выводом прогресса на экран.
 */
public class Main {
	public static void main(String[] args) {
		Monitor action = new Monitor();

		InputThread inputThread = new InputThread(action, "F:\\__one\\1.docx");
		OutputThread outputThread = new OutputThread(action, "F:\\__two\\1.docx");
		ProgressThread progressThread = new ProgressThread(action, "F:\\__one\\1.docx", "F:\\__two\\1.docx");

		Thread thread1 = new Thread(inputThread);
		Thread thread2 = new Thread(outputThread);
		Thread thread3 = new Thread(progressThread);

		thread1.start();
		thread2.start();
		thread3.start();



	}
}
