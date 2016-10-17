package hw5.ascii_art;

/**
 4. Реализуйте программу которая сопоставит каждой букве ее
 представление в виде ASCII - art, например
                          *
                         * *
                        *   *
 А                     *******
                      *       *
                     *         *
 Ваша программа должна дать возможность вывода произвольного
 текста на экран в виде его ASCII-art представления.
 */
public class Main {
	public static void main(String[] args) {
		 AsciiArt asciiArt = new AsciiArt();
		String filePath = "F:\\_Prog\\Prog\\src\\hw5\\ascii_art\\words_art";
		asciiArt.changeFontToArt("hello", filePath);
	}
}
