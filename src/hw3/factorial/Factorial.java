package hw3.factorial;
/**
 * 1) Создайте сто потоков которые будут вычислять факториал
 числа равного номеру этого потока и выводить результат на
 экран.
 */

import java.math.BigInteger;

public class Factorial implements Runnable {

	private int id;

	public Factorial(int id) {
		this.id = id;
	}

	public void main(String[] args) {
		Factorial factorial;
		Thread thread;
		for (int i = 0; i < 100; i++) {
			factorial = new Factorial(i);
			thread = new Thread(factorial);
			thread.start();
		}
	}

	@Override
	public void run() {
		System.out.println("Thread-" + id + " " + factorial(BigInteger.valueOf(id)).toString());
	}

	private  BigInteger factorial(BigInteger num) {
		if (num.equals(new BigInteger("0"))) {
			return BigInteger.ONE;
		} else {
			return num.multiply(factorial(num.subtract(BigInteger.ONE)));
		}
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
