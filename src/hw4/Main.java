package hw4;

import java.util.Scanner;

/**
 * Created by Tanya on 27.09.2016.
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(check(sc, Scanner.class));
		System.out.println(check(sc, int.class));
	}

	public static boolean check(Object obj, Class<?> classOne) {
		Class<?> classTwo = obj.getClass();
		if (classOne == classTwo) {
			return true;
		}
		return false;
	}
}
