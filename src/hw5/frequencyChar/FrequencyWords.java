package hw5.frequencyChar;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;


public class FrequencyWords {

	public void getFrequencyWords(String filePath) {
		TreeMap<Character, Integer> treeMap = readFromFile(filePath);
		TreeMap<Character, Double> treeMapRelativeFrequency = makeRelativeFrequency(treeMap);
		ArrayList<CharObject> list = convertTreeMapToArrayList(treeMapRelativeFrequency);
		Collections.sort(list);
		printList(list);
	}

	private TreeMap<Character, Integer> readFromFile(String filePath) {
		TreeMap<Character, Integer> treeMapSortKey = new TreeMap<>();
		Character key;
		Integer value = 1;
		try (BufferedReader reader = new BufferedReader(new FileReader(new File(filePath)))) {
			int c;
			while ((c = reader.read()) != -1) {
				if(64<c && c<123 ) {
					key = (char) c;
					if (!treeMapSortKey.containsKey(key)) {
						treeMapSortKey.put(key, value);
					} else {
						Integer getValue = treeMapSortKey.get(key);
						treeMapSortKey.put(key, getValue + 1);
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return treeMapSortKey;
	}

	private TreeMap<Character, Double> makeRelativeFrequency(TreeMap<Character, Integer> treeMap) {
		TreeMap<Character, Double> treeMapRelativeFrequency = new TreeMap<>();
		for (Map.Entry<Character, Integer> e : treeMap.entrySet()) {
			Character key = e.getKey();
			Integer value = e.getValue();
			Double newValue = 1.0 /value;
			treeMapRelativeFrequency.put(key, newValue);
		}
		return treeMapRelativeFrequency;
	}

	private ArrayList<CharObject> convertTreeMapToArrayList(TreeMap<Character, Double> treeMap) {
		ArrayList<CharObject> list = new ArrayList<>();
		for (Map.Entry entry : treeMap.entrySet()) {
			Character key = (Character) entry.getKey();
			Double value = (Double) entry.getValue();
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
