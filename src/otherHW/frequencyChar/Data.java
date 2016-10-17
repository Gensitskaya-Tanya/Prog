package otherHW.frequencyChar;

public class Data {

	int freq;
	Character name;

	public Data(int freq, char i) {
		super();
		this.freq = freq;
		this.name = i;
	}

	@Override
	public String toString() {
		return "Data [freq=" + freq + ", name=" + name + "]";
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Data data = (Data) o;

		if (freq != data.freq) return false;
		if (name != null ? !name.equals(data.name) : data.name != null) return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = freq;
		result = 31 * result + (name != null ? name.hashCode() : 0);
		return result;
	}

	public int getFreq() {
		return freq;
	}

	public void setFreq(int freq) {
		this.freq = freq;
	}

	public Character getName() {
		return name;
	}

	public void setName(Character name) {
		this.name = name;
	}
}