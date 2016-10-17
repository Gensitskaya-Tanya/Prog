package hw5.frequencyChar;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;


public class FrequencyChars {

	public void getFrequencyWords(String filePath) {
		TreeMap<Character, Integer> treeMap = readFromFile(filePath);
		ArrayList<CharObject> list = convertTreeMapToArrayList(treeMap);
		Collections.sort(list);
		printList(list);
	}

	private TreeMap<Character, Integer> readFromFile(String filePath) {
		TreeMap<Character, Integer> treeMap = new TreeMap<>();
		Character key;
		Integer value = 1;
		try (BufferedReader reader = new BufferedReader(new FileReader(new File(filePath)))) {
			int c;
			while ((c = reader.read()) != -1) {
				if(64<c && c<123 ) {
					key = (char) c;
					if (!treeMap.containsKey(key)) {
						treeMap.put(key, value);
					} else {
						Integer getValue = treeMap.get(key);
						treeMap.put(key, getValue + 1);
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return treeMap;
	}


	private ArrayList<CharObject> convertTreeMapToArrayList(TreeMap<Character, Integer> treeMap) {
		ArrayList<CharObject> list = new ArrayList<>();
		for (Map.Entry entry : treeMap.entrySet()) {
			Character key = (Character) entry.getKey();
			int tempValue = (Integer) entry.getValue();
			Double value = 1d/ tempValue;
			CharObject charObject = new CharObject(key, value);
			list.add(charObject);
		}
		return list;
	}

	private void printList(ArrayList<CharObject> list) {
		for (CharObject e : list) {
			System.out.println(e);
		}
	}

}
