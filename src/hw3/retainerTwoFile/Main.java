package hw3.retainerTwoFile;
/**
 * 2. Напишите программу которая примет на вход 2 текстовых
 файла,  а  вернет  один.  Содержимым  этого  файла  должны
 быть слова которые есть и в первом и во втором файле.
 */
public class Main {
	public static void main(String[] args) {
		RetainerTwoFile m = new RetainerTwoFile("F:\\_Prog\\Prog\\src\\hw3\\retainerTwoFile\\file1.txt",
				"F:\\_Prog\\Prog\\src\\hw3\\retainerTwoFile\\file2.txt");
		m.writeRetainTwoFileToOtherFile("F:\\_Prog\\Prog\\src\\hw3\\retainerTwoFile\\file3.txt");
	}
}
