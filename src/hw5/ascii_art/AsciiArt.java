package hw5.ascii_art;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class AsciiArt {
	private HashMap<String, String> wordArt = new HashMap<>();

	public void changeFontToArt(String text, String filePath){
		createDictionaryFromFile(filePath);
//		System.out.println(wordArt.toString());
		text.toUpperCase();

		for (int i = 0; i < text.length(); i++) {
			char symbolTemp = text.charAt(i);
			String symbol = symbolTemp + "";
			String value = wordArt.get(symbol);
			System.out.print(value);
		}
	}


	private void createDictionaryFromFile(String filePath) {
		String str;
		StringBuilder sb = new StringBuilder();
		int numberLine = 1;
		int count = 1;
		String key = "";
		String value = "";
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
			while ((str = bufferedReader.readLine()) != null) {

				if (numberLine == count) {
					key = str;
					numberLine++;
					count+=7;
				} else if (numberLine == count-1){
					sb.append(str).append("\n");
					value = sb.toString();
					sb.delete(0, value.length()+1);
				} else {
					sb.append(str).append("\n");
					numberLine++;
				}
				if (key != "" && value != "") {
					wordArt.put(key, value);
					key = "";
					value = "";
					numberLine++;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
