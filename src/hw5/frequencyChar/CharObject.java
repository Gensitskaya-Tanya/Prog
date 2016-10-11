package hw5.frequencyChar;


public class CharObject implements Comparable {
	private Character key;
	private Double value;

	public CharObject(Character key, Double value) {
		this.key = key;
		this.value = value;
	}

	@Override
	public int compareTo(Object other) {
		return (((CharObject) other).getValue()).compareTo(this.getValue());
	}

	public Character getKey() {
		return key;
	}

	public void setKey(Character key) {
		this.key = key;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}


	@Override
	public String toString() {
		return key + " " + value;
	}
}
