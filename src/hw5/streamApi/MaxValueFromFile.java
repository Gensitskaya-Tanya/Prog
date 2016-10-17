package hw5.streamApi;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;

public class MaxValueFromFile {
	public static void main(String[] args) {

		int maxValueFromFile = 0;

		try {
			maxValueFromFile = Files.lines(Paths.get("F:\\_Prog\\Prog\\src\\hw5\\streamApi\\num.txt"))
					.mapToInt (n -> Integer.valueOf(n))
					.mapToObj(n -> n)
					.collect(Collectors.maxBy((a, b) -> a-b)).get();
		} catch (IOException e) {
			System.out.println(e);
		}
		System.out.println(maxValueFromFile);

	}
}
