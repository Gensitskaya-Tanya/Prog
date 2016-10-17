package otherHW.frequencyChar;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class LettersFreq {

	static ArrayList<Character> a = new ArrayList<Character>();

	TreeSet<Data> ts = new TreeSet<>(new LetterCopm());

	public void loadFromFile(File file) {
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			String text = "";

			for (; (text = br.readLine()) != null;) {
				text = text.toUpperCase();
				for (char c : text.toCharArray()) {
					a.add(c);
				}
			}

			//System.out.println("Array list");
			//System.out.println(a);

			for (char i = 'A'; i <= 'Z'; i++) {
				int index = Collections.frequency(a, i);
				System.out.println("Frequency of " + i + " :" + index);

				ts.add(new Data(index, i));

			}



			Iterator<Data> itr = ts.iterator();
			System.out.println();
			System.out.println("V poriadke ybivaniya");
			for (; itr.hasNext();) {
				System.out.println(itr.next());
			}

		} catch (IOException e) {
			System.out.println(e);
		}

	}

}