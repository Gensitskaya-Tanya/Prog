package otherHW.ascii_atr83;

import java.io.File;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Letter lt=new Letter();
		lt.loadFromFile(new File("F:\\_Prog\\Prog\\src\\otherHW\\ascii_atr83\\code.txt"));

		Scanner sc = new Scanner(System.in);
		String text="";
		System.out.println("Input text  ");
		text = sc.nextLine();
		System.out.println(lt.translate(text));
		sc.close();
	}
}