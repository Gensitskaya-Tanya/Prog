package hw2;


public class Main {
	public static void main(String[] args) throws StudentIndexOutOfBoundsException {
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

		Group group = new Group();
		System.out.println("add Student in Group");
				for (int i = 0; i < studentGroup.length; i++) {
			try {
				group.addStudent(studentGroup[i]);
			} catch (StudentIndexOutOfBoundsException e) {
				System.out.println(e.getMessage());
			}
		}
		group.printStudent();

//		group.addStudent(student1);
//		System.out.println("Add student 11");

		System.out.println("findStudentByLastName _Dovikova_" );
		System.out.println(group.findStudentByLastName("Dovikova"));
//
//

		System.out.println("\n" + "delete Student _student2_");
		group.deleteStudent(student2);
		group.printStudent();


//		group.addStudentInteractive();


		System.out.println("sortStudentByParametr123(1)");
		group.sortStudentByParametr123(2);
		group.printStudent();

		Student[] ar = group.getStudentAgeAfter18();
		System.out.println("getStudentAgeAfter18");

		for (Student e: ar){
			System.out.println(e.toString());
		}

	}
}
