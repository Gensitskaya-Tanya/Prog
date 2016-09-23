package hw3.saveGroup;


import hw2.Student;
import hw2.StudentIndexOutOfBoundsException;

public class Main {

	public static void main(String[] args) {
		testWriteGroupToFile("F:\\_Prog\\Prog\\src\\hw3\\saveGroup\\group.txt");
		testReadGroupFromFile("F:\\_Prog\\Prog\\src\\hw3\\saveGroup\\group.txt");
	}






	public static void testWriteGroupToFile(String filePath) {
		Group group = createGroupWithStudent();
		group.printStudent();
		group.saveGroupToFile(group, filePath);
	}

	public static void testReadGroupFromFile(String filePath) {
		Group group = new Group();
		Group groupFromFile = group.readGroupFromFile(filePath);
		groupFromFile.printStudent();
	}

	private static Student[] createStudent() {
		Student student1 = new Student("Akarovvvv", "Adamvvvvv", 31, 95, "male__", "KPI", 5, "PO-41");
		Student student2 = new Student("Bobreevvv", "Egorvvvvv", 2, 95, "male__", "KPI", 4, "PO-32");
		Student student3 = new Student("Cyznecova", "Veronikav", 3, 55, "famale", "KPI", 1, "PO-02");
		Student student4 = new Student("Dovikovav", "Margarita", 34, 45, "famale", "KPI", 2, "PO-12");
		Student student5 = new Student("Mkarovvvv", "Adamvvvvv", 5, 95, "male__", "KPI", 5, "PO-41");
		Student student6 = new Student("Lobreevvv", "Egorvvvvv", 6, 95, "male__", "KPI", 4, "PO-32");
		Student student7 = new Student("Syznecova", "Veronikav", 37, 55, "famale", "KPI", 1, "PO-02");
		Student student8 = new Student("Vovikovav", "Margarita", 8, 45, "famale", "KPI", 2, "PO-12");
		Student student9 = new Student("Rkarovvvv", "Adamvvvvv", 39, 95, "male__", "KPI", 5, "PO-41");
		Student student10 = new Student("Wobreevvv", "Egorvvvvv", 10, 95, "male__", "KPI", 4, "PO-32");
		Student[] studentGroup = {student1, student2, student3, student4, student5, student6, student7, student8, student9, student10};
		return studentGroup;
	}

	private static Group createGroupWithStudent() {
		Group group = new Group();
		Student[] student = createStudent();
		for (Student aStudent : student) {
			try {
				group.addStudent(aStudent);
			} catch (StudentIndexOutOfBoundsException e) {
				e.printStackTrace();
			}
		}
		return group;
	}
}
