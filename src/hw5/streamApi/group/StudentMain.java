package hw5.streamApi.group;

//Напишите методы которые позволят выделить из группы студентов тех, у кого фамилия начинается с определенной буквы.

public class StudentMain {
	public static void main(String[] args) {


		Student stOne = new Student("Samuel L.","Jackson",20,"A");
		Student stTwo = new Student("Kurt","Rassel",25,"A");
		Student stThree = new Student("Jennifer Jason","Leigh",19,"C");
		Student stFour = new Student("Walton","Goggins",23,"A");
		Student stFive = new Student("Demian","Bichir",22,"C");
		Student stSix = new Student("Tim","Roth",21,"C");
		Student stSeven = new Student("Bruce","Dern",20,"B");
		Student stEight = new Student("James Parks","Parks",25,"C");

		Group gr = new Group();
		gr.addStudent(stOne);
		gr.addStudent(stTwo);
		gr.addStudent(stThree);
		gr.addStudent(stFour);
		gr.addStudent(stFive);
		gr.addStudent(stSix);
		gr.addStudent(stSeven);
		gr.addStudent(stEight);

		gr.filterByFirstLetterInSername('b');
	}

}
