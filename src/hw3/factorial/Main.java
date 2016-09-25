package hw3.factorial;

/**
 * 1) Создайте сто потоков которые будут вычислять факториал
 числа равного номеру этого потока и выводить результат на
 экран.
 */
public class Main {
	public static void main(String[] args) {
		create100Thread();
	}

	public static void create100Thread() {
		Factorial factorial;
		Thread thread;
		for (int i = 0; i < 100; i++) {
			factorial = new Factorial(i);
			thread = new Thread(factorial);
			thread.start();
		}
	}
}
