package hw5.dictionary;

/**
 * 1. Написать программу переводчик, которая будет переводить текст
 в файле English.in,написанный на английском языке, на украинский
 язык согласно заранее составленному словарю. Результат
 сохранить в файл Ukrainian.out.
 */
public class Main {
	public static void main(String[] args) {
		Dictionary dictionary = new Dictionary();
		String readFilePath = "F:\\_Prog\\Prog\\src\\hw5\\dictionary\\English.in.txt";
		String writeTextPath = "F:\\_Prog\\Prog\\src\\hw5\\dictionary\\Ukrainian.out.txt";
		String filePathDictionary = "F:\\_Prog\\Prog\\src\\hw5\\dictionary\\dictionary";
		dictionary.translateText(readFilePath, writeTextPath, filePathDictionary);
//		try {
//			dictionary.addWordToDiCtionary("nice", "красивий", filePathDictionary);
//		} catch (WordAlreadyExistsException e) {
//			e.printStackTrace();
//		}

	}

}
