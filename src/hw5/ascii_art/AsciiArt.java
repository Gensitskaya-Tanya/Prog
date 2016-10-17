package hw5.ascii_art;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AsciiArt {
	private HashMap<String, String> wordArt = new HashMap<>();

	public void changeFontToArt(String text, String filePath) {
		String textNew = text.toUpperCase();
		createDictionaryFromFile(filePath);
		printTextAsciiArt(textNew);
	}


	private void createDictionaryFromFile(String filePath) {
		String str;
		int countLine = 1;
		String key = "";
		String value;
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
			while ((str = bufferedReader.readLine()) != null) {
				Pattern p = Pattern.compile("[A-Za-z]");
				Matcher m = p.matcher(str);
				if (m.matches()) {
					key = str;
				} else {
					value = str;
					wordArt.put((key + countLine), value);
					countLine++;
					if (countLine == 7) {
						countLine = 1;
						key = "";
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void printTextAsciiArt(String text) {
		String[] array = new String[text.length()];
		for (int i = 0; i < text.length(); i++) {
			array[i] = text.charAt(i) + "";
		}
		for (int i = 1; i < 7; i++) {
			for (int j = 0; j < array.length; j++) {
				if (j == array.length - 1) {
					System.out.println(wordArt.get(array[j] + i));
					break;
				}
				System.out.print(wordArt.get(array[j] + i));
			}
		}
	}
}
