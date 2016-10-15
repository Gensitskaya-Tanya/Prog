package hw5.dictionary;


import java.io.*;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Dictionary {
	private HashMap<String, String> dictionary = new HashMap<>();

	public void translateText(String filePath, String writeTextPath, String filePathDictionary) {
		createDictionaryFromFile(filePathDictionary);
//		System.out.println(dictionary.toString());
		System.out.println("English text:");
		String text = readTextFromFile(filePath);
		System.out.println(text + "\n");
		String[] array = splitTextToArray(text);
		String translateText = getTranslateText(array);
		writeTextToFile(writeTextPath, translateText);
		System.out.println("Translate text:");
		System.out.println(readTextFromFile(writeTextPath));
	}

	private void createDictionaryFromFile(String filePath) {
		String str;
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
			while ((str = bufferedReader.readLine()) != null) {
				String[] array = str.split(" ");
				String key = array[0];
				String value = array[1];
				dictionary.put(key, value);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private String readTextFromFile(String filePath) {
		StringBuilder sb = new StringBuilder();
		String str;
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
			while ((str = bufferedReader.readLine()) != null) {
				sb.append(str).append(" ");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		String strNew = sb.toString();
		return strNew;
	}

	private String[] splitTextToArray(String str) {
		String[] array = str.split(" ");
		return array;
	}

	private String getTranslateText(String[] array) {
		StringBuilder translateText = new StringBuilder();
		String subWord;
		for (String word : array) {
			subWord = getSubWord(word);
			String ukrWordFromDictionary = dictionary.get(subWord);
			String translateWord = replaceSubWordInWordOnUkrainian(ukrWordFromDictionary, word, subWord);
			translateText.append(translateWord).append(" ");
		}
		return translateText.toString();
	}

	private String getSubWord(String word) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < word.length(); i++) {
			Character symbo = word.charAt(i);
			String symbol = "" + symbo;
			Pattern p = Pattern.compile("[A-Za-z]");
			Matcher m = p.matcher(symbol);
			if (m.matches()) {
				sb.append(symbol);
			}
		}
		String subWord = sb.toString();
		return subWord;
	}


	private String replaceSubWordInWordOnUkrainian(String ukrWordFromDictionary, String word, String subWord) {
		String wordUkr;
		int firstIndex = word.indexOf(subWord.charAt(0));
		int lastIndex = word.lastIndexOf(subWord.charAt(subWord.length() - 1));

		if (ukrWordFromDictionary != null) {
			if (firstIndex != 0 & lastIndex != word.length() - 1) {
				wordUkr = word.substring(0, firstIndex) + ukrWordFromDictionary + word.substring(lastIndex + 1, word.length());
			} else if (firstIndex == 0 & lastIndex != word.length()) {
				wordUkr = ukrWordFromDictionary + word.substring(lastIndex + 1, word.length());
			} else {
				wordUkr = ukrWordFromDictionary;
			}
		} else {
			if (firstIndex != 0 & lastIndex != word.length() - 1) {
				wordUkr = word.substring(0, firstIndex) + word + word.substring(lastIndex + 1, word.length());
			} else if (firstIndex == 0 & lastIndex != word.length()) {
				wordUkr = word + word.substring(lastIndex + 1, word.length());
			} else {
				wordUkr = word;
			}
		}
		return wordUkr;
	}

	private void writeTextToFile(String writeTextPath, String translateText) {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(writeTextPath, false))) {
			bw.write(translateText);
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public boolean addWordToDiCtionary(String englishWord, String translate, String filePathDictionary) throws WordAlreadyExistsException {
		String str = "\n" +englishWord + " " + translate;
		if(!dictionary.containsKey(englishWord)){
			try(BufferedWriter bw = new BufferedWriter(new FileWriter(filePathDictionary, true))){
				bw.write(str);
				bw.flush();
			}catch (IOException e){
				e.printStackTrace();
			}
		 return true;
		}else{
			throw new WordAlreadyExistsException();
		}
	}
}
