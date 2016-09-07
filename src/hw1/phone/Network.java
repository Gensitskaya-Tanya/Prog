package hw1.phone;


public class Network {
	private String[] phones = new String[3];

	public Network() {
	}


	public String[] getPhones() {
		return phones;
	}

	public boolean setPhones(String number) {
		if (!isNumberRegisteringInNetwork(number)) {
			if (isEmptyInArray()) {
				addPhoneInArray(number);
				return true;
			} else {
				increaseSizeArray();
				addPhoneInArray(number);
				return true;
			}
		}
		return false;

	}

	public  boolean isNumberRegisteringInNetwork(String number) {
		for (String e : phones) {
			if (e == null) {
				return false;
			} else if (e.equals(number)) {
				System.out.println("Number is already registered");
				return true;
			}
		}
		return false;
	}

	private boolean isEmptyInArray() {
		for (String e : phones) {
			if (e == null) {
				return true;
			}
		}
		return false;
	}

	private void addPhoneInArray(String number) {
		for (int i = 0; i < phones.length; i++) {
			if (phones[i] == null) {
				phones[i] = number;
				return;
			}
		}
	}

	private void increaseSizeArray() {
		String[] temp = new String[phones.length * 2];
		System.arraycopy(phones, 0, temp, 0, phones.length);
		phones = new String[temp.length];
		System.arraycopy(temp, 0, phones, 0, temp.length);
	}


}
