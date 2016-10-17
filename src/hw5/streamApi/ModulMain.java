package hw5.streamApi;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Напишите метод который найдет в массиве целых чисел число модуль которого ближе всего к 0.
 * Если есть два таких числа (например 2 и -2) верните положительное
 */
public class ModulMain {
	public static void main(String[] args) {
		int[] array = new int[]{-10, 10, -2, 3, 4, 5, 6, 2, -8};
		System.out.println(Arrays.toString(array));

		Integer res = Arrays.stream(array)
				.mapToObj(n -> n)
				.sorted((a,b) ->(b-a))
				.collect(Collectors.minBy((a, b) -> Math.abs(a) - Math.abs(b))).get();
		System.out.println(res);
	}

}
