package hw5.streamApi;

import java.util.ArrayList;
import java.util.stream.Collectors;

/**
 * На основе строки сгенерируйте массив целых чисел, каждое число должно быть ASCII кодом соответствующей буквы
 */
public class AsciiCodeMain {
	public static void main(String[] args) {
		String str = "I love Java";

		ArrayList<Character> charList = new ArrayList<>();
		for (char c : str.toCharArray()) {
			charList.add(c);
		}

		ArrayList<Integer> res = charList.stream()
				.map((n) -> (Integer.valueOf((int) n)))
				.collect(Collectors.toCollection(ArrayList::new));
		System.out.println(res);

	}
}
