package hw4.stack;

public class BlackList {
	private Object[] objectArray = new Object[2];

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

	public boolean checkObjectInBlackList(Object obj){
		for (Object e : objectArray) {
			if (e!=null && e.equals(obj)) {
				return true;
			}
		}
		 return false;
	}


	public Object[] getObjectArray() {
		return objectArray;
	}
}
