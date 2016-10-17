package otherHW.ascii_atr83;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class Letter {

	private HashMap<Character, String> letterMap = new HashMap<>();

	public Letter() {
		super();
	}

	public void loadFromFile(File file) {
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			String text = "";
			for (; (text = br.readLine()) != null;) {
				String[] textDate = text.split("   ");
				Character key = textDate[0].charAt(0);
				String value = textDate[1];
				letterMap.put(key, value);

			}
		} catch (IOException e) {
			System.out.println(e);
		}

	}

	public String translate(String text) {
		text = text.toUpperCase();
		StringBuilder sb = new StringBuilder();
		for (Character let : text.toCharArray())

		{

			try (BufferedReader br = new BufferedReader(new FileReader("F:\\_Prog\\Prog\\src\\otherHW\\ascii_atr83\\" + letterMap.get(let) + ".txt"))) {
				String text2 = "";

				for (; (text2 = br.readLine()) != null;) {

					System.out.println(text2);

				}
			} catch (IOException e) {
				System.out.println(e);
			}

		}

		return sb.toString();

	}
}
