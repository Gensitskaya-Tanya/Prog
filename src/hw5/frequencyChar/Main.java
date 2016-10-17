package hw5.frequencyChar;

/**
 * 3)  Считайте  из  файла  текст  на  английском  языке,  вычислите
 * относительную  частоту  повторения  каждой  буквы  и  выведите  на
 * экран  результат  в  порядке  убывания  относительной  частоты
 * повторения.
 */
public class Main {
	public static void main(String[] args) {
		FrequencyChars fw = new FrequencyChars();
		fw.getFrequencyWords("F:\\_Prog\\Prog\\src\\hw5\\words");
	}
}
