package otherHW.group;

import java.io.*;
import java.util.Arrays;

/**
 * Created by Hamster4n.
 */

/**
 * Created by Hamster4n.
 */
public class Group {
	private String nameGroup;
	private Student[] group = new Student[10];

	public Group(String nameGroup) {
		this.nameGroup = nameGroup;
	}

	public Group() {
	}

	public String getNameGroup() {
		return nameGroup;
	}

	public void setNameGroup(String nameGroup) {
		this.nameGroup = nameGroup;
	}

	public Student[] getGroup() {
		return group;
	}

	public void addStudent(Student student) {
		try {
			boolean isNullInGroup = false;
			for (Student element : group) {
				if (element == null) {
					isNullInGroup = true;
				}
			}
			if (!isNullInGroup) throw new MyException();
			for (int i = 0; i < group.length; i++) {
				if (group[i] == null) {
					group[i] = student;
					System.out.println("Student " + student.getName() + " added to " + getNameGroup() + " group.");
					return;
				}
			}
		} catch (MyException e) {
			System.out.println(e.getMessage());
		}


	}

	public void addStudentQuiet(Student student) {
		for (int i = 0; i < group.length; i++) {
			if (group[i] == null) {
				group[i] = student;
				return;
			}
		}
	}

	public void removeStudent(Student student) {
		boolean isStudentInGroup = false;
		for (int i = 0; i < group.length; i++) {
			if (group[i] != null) {
				if (group[i].equals(student)) {
					System.out.println("Student " + group[i].getName() + " is removed from " + getNameGroup() + " group.");
					isStudentInGroup = true;
					group[i] = null;
				}
			}
		}
		if (!isStudentInGroup) {
			System.out.println("There is no such student in the group!");
		}

	}

	public void removeStudent(int number) {
		if (number > -1 && number < 11) {
			if (group[number] != null) {
				System.out.println("Student " + group[number].getName() + " is removed from " + getNameGroup() + " group.");
				group[number] = null;
			} else System.out.println("There is no student in group with this number!");
		} else System.out.println("You type wrong number of student!");
	}

	public void searchStudentByName(String nameOfStudent) {
		boolean isStudentInGroup = false;
		for (Student element : group) {
			if (element != null) {
				if (nameOfStudent.equals(element.getName())) {
					isStudentInGroup = true;
					System.out.println("Computer found student: ");
					element.print();
				}
			}
		}
		if (!isStudentInGroup) {
			System.out.println("Computer cant found student:");
			System.out.println("There is no such student " + nameOfStudent + " in the group!");
		}
	}

	public void saveToFile(Group groupSt) {
		try {
			File file = new File("Group.txt");
			PrintWriter pw = new PrintWriter(file);
			pw.print(groupSt.nameGroup);
			for (int i = 0; i < groupSt.group.length; i++) {
				pw.print(groupSt.group[i]);
			}
			pw.close();
			System.out.println("Group successfully saved into file.");
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
			e.printStackTrace();
		}
	}

	public Group readFromFile() throws IOException {
		File file = new File("Group.txt");
		BufferedReader reader = new BufferedReader(new FileReader(file));
		int countLine = 0;
		String line;
		while ((line = reader.readLine()) != null) {
			countLine++;
		}
		reader.close();
		BufferedReader reader1 = new BufferedReader(new FileReader(file));
		Group groupNEW = new Group();

		for (int i = 0; i < countLine; i++) {
			if (i == 0) {
				groupNEW.setNameGroup(reader1.readLine());
			} else {
				line = reader1.readLine();

				// парсим строку в студента
				String[] arrTemp = new String[7];
				arrTemp = line.split(",");

				for (int j = 0; j < 7; j++) {
					int index = arrTemp[j].indexOf("=");
					arrTemp[j] = arrTemp[j].substring(index + 2);
				}
				//пример записи студента в *.txt
				//course= 5, department= Geodesy, sex= true,   age= 25, weigth= 70.3, growth= 178.4, name= Nikola
				Student student = new Student();
				student.setCourse(Integer.valueOf(arrTemp[0]));
				student.setDepartment(arrTemp[1]);
				student.setSex(Boolean.valueOf(arrTemp[2]));
				student.setAge(Integer.valueOf(arrTemp[3]));
				student.setWeigth(Double.valueOf(arrTemp[4]));
				student.setGrowth(Double.valueOf(arrTemp[5]));
				student.setName(arrTemp[6]);

				groupNEW.addStudentQuiet(student);
			}
		}
		reader1.close();
		return groupNEW;
	}

	@Override
	public String toString() {
//        Arrays.sort(group, Student.nameStudent);
		return "nameGroup = " + nameGroup + "\n" + Arrays.toString(group);
	}
}