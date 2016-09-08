package hw1.board;


public class Rectangle extends Shape {
	private Point point1;
	private Point point2;
	private Point point3;
	private Point point4;
	private double sideA;
	private double sideB;

	public Rectangle(Point point1, Point point2, Point point3, Point point4) {
		this.point1 = point1;
		this.point2 = point2;
		this.point3 = point3;
		this.point4 = point4;
	}

	@Override
	public double getPerimetr() {
		calculateSide ();
		return 2*(sideA + sideB);
	}

	@Override
	public double getArea() {
		calculateSide ();
		return sideA*sideB;
	}

	private void calculateSide () {
		sideA = point4.getX() - point1.getX();
		sideB = point2.getY() - point1.getY();
	}
}
