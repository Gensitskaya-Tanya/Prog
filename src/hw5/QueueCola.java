package hw5;

import java.util.LinkedList;

/**
 * 4) Шелдон, Леонард, Воловиц, Кутрапалли и Пенни стоят в очереди
 * за  «двойной  колой».  Как  только  человек  выпьет  такой  колы  он
 * раздваивается и оба становятся в конец очереди, что бы выпить еще
 * стаканчик.    Напишите  программу  которая  выведет  на  экран
 * состояние  очереди    в  зависимости  от  того  сколько  стаканов  колы
 * выдал аппарат с чудесным напитком. Например если было выдано
 * только два стакана, то очередь выглядит как:
 * [Volovitc, Kutrapalli, Penny,Sheldon,Sheldon,Leonard,Leonard]
 */
public class QueueCola {
	public static void main(String[] args) {
		QueueCola queueCola = new QueueCola();
		queueCola.statusQueueByCola(2);
	}

	public void statusQueueByCola(int glassNumber) {
		LinkedList<String> linkedList = createList();
		for (int i = 0; i < glassNumber; i++) {
			String people = linkedList.get(0);
			linkedList.remove(0);
			linkedList.add(people);
			linkedList.add(people);
		}
		System.out.println(linkedList.toString());
	}

	public LinkedList<String> createList() {
		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add("Sheldon");
		linkedList.add("Leonard");
		linkedList.add("Volovitc");
		linkedList.add("Kutrapalli");
		linkedList.add("Penny");
		return linkedList;
	}

}
