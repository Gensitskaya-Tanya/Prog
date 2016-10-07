package hw4.stack;

import hw1.cat.Cat;
import hw2.Human;
import hw2.Student;

/**
 * Создайте класс контейнер - стек (класс в который можно добавлять и
 * удалять  объекты  других  классов,  только  в  вершину  стека)  в  который
 * можно  сохранять  объекты  произвольного  типа.  Должен  быть  метод
 * добавления элемента в стек,получение с удалением элемента из стека, и
 * просто  получение  элемента  из  вершины  из  стека.    Должна  быть
 * реализована  работа  с  «черным  списком»  классов  (смотри  ниже).  Если
 * объект  который  добавляется  в  стек  принадлежит  классу  из  черного
 * списка, то добавление такого объекта запрещено
 */
public class Main {
	public static void main(String[] args) {

		Human human = new Human("human", "human", 1, 1, "human");
		Student student = new Student("zb", "zb", 1, 2, "zb", "zb", 1, "zb");
		Cat cat = new Cat("cat", 1, "cat", "cat", "cat", "cat");

		MyStack stack = new MyStack();



		stack.add(student);
		stack.add(human);
		stack.add(cat);
		stack.add(student);
		stack.add(student);

		stack.printObjectArray();
		System.out.println("------------------");

		stack.getObjectWithRemove(cat);
		stack.printObjectArray();

	}
}
