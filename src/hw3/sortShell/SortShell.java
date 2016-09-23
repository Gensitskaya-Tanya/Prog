package hw3.sortShell;

import java.util.Arrays;

/**
 * 3) Напишите многопоточный вариант сортировки массива
 * методом Шелла.
 */

public class SortShell {
	public static void main(String[] args) {
		int[] a = {9, 8, 7, 6, 5, 4, 3, 2, 1, 1, 2};
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(sortShellByThreads(a)));

	}


	public static int[] sortShellByThreads(int[] array) {
		Thread thread1 = new Thread(new Runnable() {
			@Override
			public void run() {
				shellSort(0, array.length / 2, array);
			}
		});
		Thread thread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				shellSort((array.length / 2 - 1), array.length, array);
			}
		});
		thread1.start();
		thread2.start();
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return array;
	}

	public static int[] shellSort(int firstIndexArray, int nextIndexArray, int[] array) {
		int step = array.length / 4;
		while (step > 0) {
			for (int i = firstIndexArray; i < (nextIndexArray - step); i++) {
				int j = i;
				while (j >= 0 && array[j] > array[j + step]) {
					int temp = array[j];
					array[j] = array[j + step];
					array[j + step] = temp;
					j--;
				}
			}
			step = step / 2;
		}
		return array;

	}

}
