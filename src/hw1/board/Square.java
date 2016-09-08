package hw1.board;


public class Square extends Shape {
	private Point point1;
	private Point point2;
	private Point point3;
	private Point point4;
	private double sideA;

	public Square(Point point1, Point point2, Point point3, Point point4) {
		this.point1 = point1;
		this.point2 = point2;
		this.point3 = point3;
		this.point4 = point4;
	}

	@Override
	public double getPerimetr() {
		calculateSide ();
		return 4*sideA;
	}

	@Override
	public double getArea() {
		calculateSide ();
		return sideA*sideA;
	}

	private void calculateSide () {
		sideA = point4.getX() - point1.getX();
	}
}
