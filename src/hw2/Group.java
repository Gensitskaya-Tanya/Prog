package hw2;


import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Group implements Voenkom {
	private int maxSumStudents = 10;
	private Scanner scan = new Scanner(System.in);

	private Student[] students = new Student[maxSumStudents];

	public Group() {
	}

	public boolean addStudent(Student student) throws StudentIndexOutOfBoundsException {
		if (getRealCountStudent() + 1 > maxSumStudents) throw new StudentIndexOutOfBoundsException();
		for (int i = 0; i < students.length; i++) {
			if (null == students[i]) {
				students[i] = student;
				return true;
			}
		}
		return false;
	}

	private int getRealCountStudent() {
		int count = 0;
		for (Student e : students) {
			if (null == e) {
				return count;
			}
			count++;
		}
		return count;
	}

	public void deleteStudent(Student student) {
		for (int i = 0; i < students.length; i++) {
			if (students[i] == student) {
				students[i] = null;
			}
		}

	}

	public boolean findStudentByLastName(String lastName) {
		for (int i = 0; i < students.length; i++) {
			if (null == students[i]) {
				continue;
			}
			if (students[i].getLastName().equals(lastName)) {
				return true;
			}
		}
		return false;
	}

	public Student[] getStudentsInArray() {
		return students;
	}


	public int getMaxSumStudents() {
		return maxSumStudents;
	}

	public void setMaxSumStudents(int maxSumStudents) {
		this.maxSumStudents = maxSumStudents;
	}

	public void sortStudentByLastName() {
		shiftNULLtoTheEndInArray();
		for (int i = students.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if(students[j]!=null && students[j+1]!=null){
					if (students[j].getLastName().compareTo(students[j + 1].getLastName()) > 0) {
						Student tmp = students[j];
						students[j] = students[j + 1];
						students[j + 1] = tmp;
					}
				}

			}
		}
	}
	public void  shiftNULLtoTheEndInArray(){
		for (int i = 0; i <students.length ; i++) {
			 if(null==students[i]){
				 for (int j =students.length-1; j>i; j--) {
					if(students[j]!=null){
						Student temp = students[j];
						students[j]= students[i];
						students[i] = temp;
						break;
					}
				 }
			 }
		}
	}
	public void sortStudentByFirstName(){
		shiftNULLtoTheEndInArray();
		Arrays.sort(students, new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				if (o1 != null && o2 != null) {
					return o1.getFirstName().compareTo(o2.getFirstName());
				}
				return 0;

			}
		});
	}

	public void sortStudentByAge(){
		shiftNULLtoTheEndInArray();
		Arrays.sort(students, new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				if (o1 != null && o2 != null) {
					Integer a = o1.getAge();
					Integer b = o2.getAge();
					return (a.compareTo(b));
				}
				return 0;
			}
		});
	}
	public void sortStudentByParametr123(int parametr){
		switch (parametr){
			case 1:
				sortStudentByLastName();
				break;
			case 2:
				sortStudentByFirstName();
				break;
			case 3:
				sortStudentByAge();
				break;
			default:
				break;

		}
	}
	@Override
	public String toString() {
		Arrays.sort(students, new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				if (o1 != null && o2 != null) {
					return o1.getLastName().compareTo(o2.getLastName());
				}
				return 0;
			}
		});
		StringBuilder sb = new StringBuilder();
		for (Student student : students) {
			if (null == student) {
				sb.append("null " + "\n");
				continue;
			}
			sb.append(student.toString() + "\n");
		}
		return sb.toString();
	}

	public void printStudent(){
		StringBuilder sb = new StringBuilder();
		for (Student student : students) {
			if (null == student) {
				sb.append("null " + "\n");
				continue;
			}
			sb.append(student.toString() + "\n");
		}
		System.out.println(sb.toString());
	}

	public boolean addStudentInteractive() {
		System.out.println("Enter lastName:");
		isNextLine();
		String lastName = scan.nextLine();
		System.out.println("Enter firstName:");
		isNextLine();
		String firstName = scan.nextLine();
		System.out.println("Enter age:");
		isNextInt();
		int age = scan.nextInt();
		System.out.println("Enter weight:");
		isNextInt();
		int weight = scan.nextInt();
		scan.nextLine();
		System.out.println("Enter sex:");
		isNextLine();
		String sex = scan.nextLine();
		System.out.println("Enter university:");
		isNextLine();
		String university = scan.nextLine();
		System.out.println("Enter course:");
		isNextInt();
		int course = scan.nextInt();
		scan.nextLine();
		System.out.println("Enter group:");
		isNextLine();
		String groupS = scan.nextLine();
		scan.close();

		Student student0 = new Student(lastName, firstName, age, weight, sex, university, course, groupS);
		System.out.println(student0.toString());
		try {
			addStudent(student0);
		} catch (StudentIndexOutOfBoundsException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	private void isNextLine() {
		while (!scan.hasNext("[A-Za-z]+$")) {
			System.out.println("Error, enter line:");
			scan.nextLine();
		}
	}

	private void isNextInt() {
		while (!scan.hasNextInt()) {
			System.out.println("Error, enter number:");
			scan.nextInt();
		}
	}


	@Override
	public Student[] getStudentAgeAfter18() {
		int countStudAfter18 =0;
		for (int i = 0; i < students.length; i++) {
			 if(students[i]!=null && students[i].getAge()>18){
				 countStudAfter18++;
			 }
		}
		Student [] arrayAfter18 = new Student[countStudAfter18];
		for (int i = 0; i < students.length; i++) {
			if(students[i]!=null && students[i].getAge()>18){
				for (int j = 0; j <arrayAfter18.length ; j++) {
					if(null == arrayAfter18[j]){
						arrayAfter18[j]=students[i];
						break;
					}

				}
			}
		}
		return arrayAfter18;
	}
}
