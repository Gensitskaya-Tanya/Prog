package otherHW.multiThreadFindFileInCatalog;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String folder = "D:/books";
		//String file = "analit.txt";
		//int threadNumber = 3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input folder for researh");
		String folder = sc.nextLine();

		System.out.println("Input file for researh");
		String file = sc.nextLine();

		System.out.println("Input count of thread for researh");
		int threadNumber = sc.nextInt();

		Research.multiThread(folder, file, threadNumber);
		sc.close();
	}

}