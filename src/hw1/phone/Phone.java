package hw1.phone;

/**
 * Опишите класс Phone (одним из свойств должен быть его номер). Так же опишите
 * класс  Network  (сеть  мобильного  оператора).    Телефон  должен  иметь  метод
 * регистрации в сети мобильного оператора. Так же у телефона должен быть метод call
 * (номер другого  телефона), который  переберет все телефоны зарегистрированные в
 * сети. Если такой номер найден, то осуществить вызов, если нет вывести сообщение
 * о неправильности набранного номера.
 */
public class Phone {
	private String number;

	public Phone(String number) {
		this.number = number;
	}

	public  boolean registeringInNetwork (Network network){
		  return network.setPhones(number);
	}

	public void call(Phone anotherNumber, Network network){
		  if(network.isNumberRegisteringInNetwork(anotherNumber.getNumber())){
			  System.out.println("calling....to number : " + anotherNumber.getNumber());
		  } else {
			  System.out.println("number is not in the network");
		  }
		}

	public String getNumber() {
		return number;
	}
}
