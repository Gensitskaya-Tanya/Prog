package hw4.stack;

import java.util.ArrayList;

public class BlackList {
	private ArrayList<Object> objectArray = new ArrayList<>();

	public void add(Object obj) {
		objectArray.add(obj);
	}

	public boolean checkObjectInBlackList(Object obj) {
		for (Object e : objectArray) {
			if (e != null && e.equals(obj)) {
				return true;
			}
		}
		return false;
	}

	public ArrayList<Object> getObjectArray() {
		return objectArray;
	}
}
