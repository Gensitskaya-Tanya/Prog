package hw1.board;

import static java.lang.Math.*;

public class Triangle extends Shape {
	private Point point1;
	private Point point2;
	private Point point3;


	public Triangle(Point point1, Point point2, Point point3) {
		this.point1 = point1;
		this.point2 = point2;
		this.point3 = point3;
	}

	@Override
	public double getPerimetr() {
		double ab = sqrt(pow(point2.getX() - point1.getX(), 2) + pow((point2.getY() - point1.getY()), 2));
		double ac = sqrt(pow(point3.getX() - point1.getX(), 2) + pow((point3.getY() - point1.getY()), 2));
		double bc = sqrt(pow(point3.getX() - point2.getX(), 2) + pow((point3.getY() - point2.getY()), 2));
		return ab + ac + bc;
	}

	@Override
	public double getArea() {
		double a = point1.getX() - point3.getX();
		double b = point2.getX() - point3.getX();
		double c = point1.getY() - point3.getY();
		double d = point2.getY() - point3.getY();
		return 0.5 * abs((a * d) - (b * c));
	}


}
