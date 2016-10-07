package hw4.stack;

import java.util.ArrayList;

public class BlackList {
	private ArrayList<Class<?>> objectArray = new ArrayList<>();

	public void add(Object obj) {
		objectArray.add(obj.getClass());
	}

	public boolean checkObjectInBlackList(Object obj) {
		for (Object e : objectArray) {
			if (e != null && e == obj.getClass()) {
				return true;
			}
		}
		return false;
	}


	public ArrayList<Class<?>> getObjectArray() {
		return objectArray;
	}
}
