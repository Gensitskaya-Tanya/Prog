package hw1.board;

/**
 * 1. Создайте абстрактный класс Shape в котором есть два
 * абстрактных метода double getPerimetr() и double getArea().
 * 2. Создайте класс Point в котором есть два свойства double x
 * double y.
 * 3. Создайте классы которые описывают как минимум 3
 * геометрические фигуры (они должны быть подклассами
 * Shape), при этом они в качестве свойств должны содержать
 * классы Point.
 * 4. Создайте класс доска. Доска поделена на 4 части в каждую
 * часть доски можно положить одну из фигур. У доски должны
 * быть методы которые помещают и удаляют фигуру с доски.
 * Также должен быть метод который выводит информацию о
 * всех фигурах лежащих на  доске и их суммарную площадь.
 * 5. * Нарисуйте UML диаграмму проекта
 */
public class Main {
	public static void main(String[] args) {
		Point point1 = new Point(1, 1);
		Point point2 = new Point(1, 3);
		Point point3 = new Point(4, 3);
		Point point4 = new Point(4, 1);

		Point point5 = new Point(-5, -6);
		Point point6 = new Point(-5, -2);
		Point point7 = new Point(-1, -2);
		Point point8 = new Point(-1, -6);

		Point point9 = new Point(-5, 1);
		Point point10 = new Point(-4, 3);
		Point point11 = new Point(-1, 1);

		Shape rectangle = new Rectangle(point1, point2, point3, point4);
		Shape square = new Square(point5, point6, point7, point8);
		Shape triangle = new Triangle(point9, point10, point11);

		System.out.println("rectangle perimetr " + rectangle.getPerimetr());
		System.out.println("triangle perimetr  " + triangle.getPerimetr());
		System.out.println("square perimetr    " + square.getPerimetr());

		System.out.println("rectangle area     " + rectangle.getArea());
		System.out.println("triangle area      " + triangle.getArea());
		System.out.println("square area        " + square.getArea());

		Board board = new Board();

		System.out.println(board.addShape(rectangle));
		System.out.println(board.addShape(square));
		System.out.println(board.addShape(triangle));

		System.out.println(board.informationAboutShape());

		System.out.println(board.deleteShape(rectangle));
		System.out.println(board.informationAboutShape());
		System.out.println();

		System.out.println(board.addShape(rectangle));
		System.out.println(board.informationAboutShape());

	}
}
