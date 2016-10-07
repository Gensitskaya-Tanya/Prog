package hw4.stack;

import hw1.cat.Cat;
import hw2.Human;
import hw2.Student;

/**
 2)    Создайте класс контейнер - стек (класс в который можно добавлять и
 удалять  объекты  других  классов,  только  в  вершину  стека)  в  который
 можно  сохранять  объекты  произвольного  типа.  Должен  быть  метод
 добавления элемента в стек,получение с удалением элемента из стека, и
 просто  получение  элемента  из  вершины  из  стека.    Должна  быть
 реализована  работа  с  «черным  списком»  классов  (смотри  ниже).  Если
 объект  который  добавляется  в  стек  принадлежит  классу  из  черного
 списка, то добавление такого объекта запрещено

 3)     Для описанного выше стека создайте класс «Черный список» в котором
 будут  описаны   классы  объектов  которые  нельзя  добавлять  в  стек.
 Должна быть возможность добавления классов в черный список, проверка
 объекта — на то что класс к которому он принадлежит или
 не принадлежит к классам в черном списке.
 */
public class Main {
	public static void main(String[] args) {

		Human human = new Human("human", "human", 1, 1, "human");
		Student student = new Student("zb", "zb", 1, 2, "zb", "zb", 1, "zb");
		Student student1 = new Student("zb1", "zb1", 1, 2, "zb1", "zb1", 1, "zb1");
		Cat cat = new Cat("cat", 1, "cat", "cat", "cat", "cat");


		BlackList blackList = new BlackList();
		blackList.add(cat);
		MyStack stack = new MyStack(blackList);


		stack.addWithCheckInBlackList(student);
		stack.addWithCheckInBlackList(human);
		stack.addWithCheckInBlackList(cat);
		stack.addWithCheckInBlackList(student1);
		stack.addWithCheckInBlackList(cat);
		stack.addWithCheckInBlackList(student);

		stack.printObjectArray();
		System.out.println("------------------");
		stack.getObjectWithRemove(student1);
		stack.printObjectArray();

	}
}
