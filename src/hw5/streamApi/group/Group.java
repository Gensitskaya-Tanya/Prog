package hw5.streamApi.group;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.stream.Collectors;

public class Group {

	ArrayList<Student> studList;

	public Group() {
		this.studList = new ArrayList<Student>();
	}

	public void addStudent (Student st){
		studList.add(st);
	}

	public void filterByFirstLetterInSername (char l){

		ArrayList<Student> res = studList.stream()
				.filter(st -> st.getSername().charAt(0) == Character.toUpperCase(l))
				.collect(Collectors.toCollection(ArrayList :: new));

		System.out.println("List of students with first letter of sername is '"+Character.toUpperCase(l)+"'");
		Iterator<Student> it = res.iterator();
		for(;it.hasNext();){
			System.out.println(it.next());
		}
	}
}
