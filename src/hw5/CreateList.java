package hw5;

import java.util.ArrayList;
import java.util.List;

/**
 * Написать метод, который создаст список, положит в него 10
 элементов, затем удалит первые два и последний, а затем выведет
 результат на экран.
 */
public class CreateList<V> {
	public static void main(String[] args) {

		String [] array = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10",};
		new CreateList<String>().createList(array);

	}
	public void createList(V [] element ){
	  ArrayList<V> list = new ArrayList<>();
		for(int i =0; i< element.length; i++){
			list.add(element[i]);
		}
		List<V> temp = new ArrayList<>();
		temp = list.subList(2,(list.size()-2));
		for(int i=0; i<temp.size(); i++){
			System.out.println(temp.get(i));
		}
	}
}
