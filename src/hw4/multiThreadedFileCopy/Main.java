package hw4.multiThreadedFileCopy;

/**
 2)  Реализуйте  программу  многопоточного  копирования  файла
 блоками, с выводом прогресса на экран.
 */
public class Main {
	public static void main(String[] args) {
		Action1 action = new Action1();
//		InputThread inputThread = new InputThread(action, "F:\\__one\\1.docx");
//		OutputThread outputThread = new OutputThread(action, "F:\\__two\\1.docx");
		InputThread inputThread = new InputThread(action, "F:\\__one\\3.txt");
		OutputThread outputThread = new OutputThread(action, "F:\\__two\\3.txt");
		Thread thread1 = new Thread(inputThread);
		Thread thread2 = new Thread(outputThread);


		thread1.start();
		thread2.start();



//		try (InputStream is = new FileInputStream(new File("F:\\__one\\1.txt"));
//			 OutputStream os = new FileOutputStream(new File("F:\\__two\\1.txt"))) {
//			byte[] buffer = new byte[1024];
//			int length;
//			while ((length = is.read(buffer)) > 0) {
//				os.write(buffer, 0, length);
//			}
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
	}
}
