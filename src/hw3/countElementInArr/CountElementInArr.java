package hw3.countElementInArr;

/**
 * 2) Написать код для многопоточного подсчета суммы элементов
 массива целых чисел. Сравнить скорость подсчета с простым
 алгоритмом.
 */
import java.util.Random;

public class CountElementInArr {
	public static void main(String[] args) {
		int[] array = generateArray();
		workingTimeSimpleAlgorithm(array);
		System.out.println();
		workingTimeWithTwoThread(array);

//		System.out.println(ThreadCounter.summ);
	}

	public static int[] generateArray() {
		Random random = new Random();
		int[] array = new int[10];
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(10);
		}
		return array;
	}

	public static int countSummElementInArrayConventionalManner(int[] arr) {
		int summ = 0;
		for (int i = 0; i < arr.length; i++) {
			summ += arr[i];
		}
		return summ;
	}

	public static long workingTimeSimpleAlgorithm(int[] array) {
		long start = System.currentTimeMillis();

		int summ = countSummElementInArrayConventionalManner(array);
		System.out.println("summ in array by simple algorithm: " + summ);

		long finish = System.currentTimeMillis();
		long timeConsumedMillis = finish - start;
		System.out.println("time working simple algorithm " + timeConsumedMillis);
		return timeConsumedMillis;
	}

	public static long workingTimeWithTwoThread(int[] array) {

		long start = System.currentTimeMillis();
		ThreadCounter threadCounter1 = new ThreadCounter(0, (array.length / 2), array);
		Thread thread1 = new Thread(threadCounter1);
		ThreadCounter threadCounter2 = new ThreadCounter(array.length / 2, array.length, array);
		Thread thread2 = new Thread(threadCounter2);

		thread1.start();
		thread2.start();
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

			System.out.println("summ in array by two thread: " + ThreadCounter.summ);
			long finish = System.currentTimeMillis();
			long timeConsumedMillis = finish - start;
			System.out.println("time working with two thread: " + timeConsumedMillis);

		return 1;

	}

}
