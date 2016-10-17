package otherHW.group;

import java.io.IOException;

/**
 * Created by Tanya on 07.10.2016.
 */
public class Main {
	public static void main(String[] args) throws IOException {
		Group group = createGroupQuiet();
		group.saveToFile(group);

		Group group1 = new Group();
		Group group2 = group1.readFromFile();
		System.out.println(group2.toString());
	}
	public static Group createGroupQuiet(){
		Student stud_man1 = new Student(true, 25, 70.3, 178.4, "Nikola", "GIS", 5, "Geodesy");
		Student stud_man2 = new Student(true, 25, 75.0, 181.1, "Tolik", "GIS", 5, "Geodesy");
		Student stud_man3 = new Student(true, 25, 80.3, 178.0, "Yaroslav", "GIS", 5, "Geodesy");
		Student stud_man4 = new Student(true, 25, 90.3, 179.8, "Konstantin", "GIS", 5, "Geodesy");
		Student stud_gerl1 = new Student(false, 18, 54.2, 151.8, "Helga", "BUH", 3, "Accounting");
		Student stud_gerl2 = new Student(false, 18, 52.0, 149.6, "Julia", "BUH", 3, "Accounting");
		Student stud_gerl3 = new Student(false, 18, 55.1, 154.1, "Kat", "BUH", 3, "Accounting");
		Student stud_gerl4 = new Student(false, 18, 51.6, 150.5, "Svetlana", "BUH", 3, "Accounting");


		Group group = new Group("HONORS");

		group.addStudentQuiet(stud_man1);
		group.addStudentQuiet(stud_gerl1);
		group.addStudentQuiet(stud_man2);
		group.addStudentQuiet(stud_gerl2);
		group.addStudentQuiet(stud_man3);
		group.addStudentQuiet(stud_gerl3);
		group.addStudentQuiet(stud_man4);
		group.addStudentQuiet(stud_gerl4);
		return group;
	}
}
