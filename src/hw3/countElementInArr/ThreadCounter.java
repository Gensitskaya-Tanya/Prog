package hw3.countElementInArr;

/**
 * 2) Написать код для многопоточного подсчета суммы элементов
 массива целых чисел. Сравнить скорость подсчета с простым
 алгоритмом.
 */
public class ThreadCounter implements Runnable {
	private int numberFirstIndexArr;
	private int numberNextIndexArr;
	private int [] arr;
	public static int summ = 0;

	public ThreadCounter(int numberFirstIndexArr, int numberNextIndexArr, int[] arr) {
		this.numberFirstIndexArr = numberFirstIndexArr;
		this.numberNextIndexArr = numberNextIndexArr;
		this.arr = arr;
	}


	@Override
	public void run() {
		for (int i = numberFirstIndexArr; i <numberNextIndexArr; i++) {
			summ += arr[i];
		}
	}
}
