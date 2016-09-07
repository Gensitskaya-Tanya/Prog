package hw1.phone;

public class Main {
	public static void main(String[] args) {
		Network network = new Network();

		Phone phone1 = new Phone("0631502020");
		Phone phone2 = new Phone("0631502021");
		Phone phone3 = new Phone("0631502022");
		Phone phone4 = new Phone("0631502023");
		Phone phone5 = new Phone("0631502024");
		Phone phone6 = new Phone("0631502025");
		Phone phone7 = new Phone("0631502026");
		Phone phone8 = new Phone("0631502027");
		Phone phone9 = new Phone("0939999999");

		Phone [] phoneArr = {phone1, phone2, phone3, phone4, phone5, phone6, phone7, phone8, phone9};

		for(Phone e: phoneArr){
			System.out.println(e.registeringInNetwork(network));
		}
		String [] phone = network.getPhones();
		for (String e: phone) {
			System.out.println(e);
		}

		phone1.call(phone2, network);


	}
}
