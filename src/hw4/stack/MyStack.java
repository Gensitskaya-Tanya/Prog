package hw4.stack;

public class MyStack {
	private Object[] objectArray = new Object[2];
	private BlackList blackList;

	public MyStack() {
	}

	public MyStack(BlackList blackList) {
		this.blackList = blackList;
	}

	public void addWithCheckInBlackList(Object obj) {
		if (blackList.checkObjectInBlackList(obj)) {
			System.out.println("!!! the addition _"+ obj.getClass() + "_ is impossible !!!");
		} else {
			add(obj);
		}
	}

	public void add(Object obj) {
		for (int i = 0; i < objectArray.length; i++) {
			if (objectArray[i] == null) {
				objectArray[i] = obj;
				return;
			}
		}
		rebuildArray();
		add(obj);
	}

	private void rebuildArray() {
		int coefficient = 2;
		Object[] newArray = new Object[objectArray.length * coefficient];
		System.arraycopy(objectArray, 0, newArray, 0, objectArray.length);
		objectArray = newArray;
	}


	public Object getObject(Object obj) {
		for (Object e : objectArray) {
			if (e.equals(obj)) {
				return e;
			}
		}
		return null;
	}

	public Object getObjectFromTopStack() {
		if (objectArray[0] != null) {
			for (int i = 0; i < objectArray.length; i++) {
				if (objectArray[i] == null) {
					System.out.println(objectArray[i - 1]);
					return objectArray[i - 1];
				}
			}
			return objectArray[objectArray.length - 1];
		}
		return null;
	}

	public Object getObjectWithRemove(Object obj) {
		for (int i = 0; i < objectArray.length; i++) {
			if (objectArray[i].equals(obj)) {
				Object temp = objectArray[i];
				removeObject(i);
				return temp;
			}
		}
		return null;
	}

	private void removeObject(int i) {
		Object[] newArray = new Object[objectArray.length];
		System.arraycopy(objectArray, 0, newArray, 0, i);
		System.arraycopy(objectArray, i + 1, newArray, i, objectArray.length - i - 1);
		objectArray = newArray;
	}

	public void printObjectArray() {
		for (int i = 0; i < objectArray.length; i++) {
			System.out.println("Object " + i + " " + objectArray[i]);
		}
	}

	public Object[] getObjectArray() {
		return objectArray;
	}

	public BlackList getBlackList() {
		return blackList;
	}
}
