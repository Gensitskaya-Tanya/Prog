package hw1.triangle;

/**
 * Описать  класс  «Triangle».  В  качестве  свойств  возьмите  длинны  сторон
 * треугольника.  Реализуйте  метод  который  будет  возвращать  площадь  этого
 * треугольника. Создайте несколько объектов этого класса и протестируйте их.
 */
public class Triangle {
	private double sideTriangleA;
	private double sideTriangleB;
	private double sideTriangleC;

	public Triangle(double sideTriangleA, double sideTriangleB, double sideTriangleC) {
		this.sideTriangleA = sideTriangleA;
		this.sideTriangleB = sideTriangleB;
		this.sideTriangleC = sideTriangleC;
	}

	@Override
	public String toString() {
		return "Triangle{" +
				"sideTriangleA=" + sideTriangleA +
				", sideTriangleB=" + sideTriangleB +
				", sideTriangleC=" + sideTriangleC +
				'}';
	}
	public double calculateAreaOfTriangl(){
		double p = 0.5*(sideTriangleA + sideTriangleB + sideTriangleC);
		return    Math.sqrt(p*(p-sideTriangleA)*(p-sideTriangleB)*(p-sideTriangleC));
	}

	public double getSideTriangleA() {
		return sideTriangleA;
	}

	public void setSideTriangleA(double sideTriangleA) {
		this.sideTriangleA = sideTriangleA;
	}

	public double getSideTriangleB() {
		return sideTriangleB;
	}

	public void setSideTriangleB(double sideTriangleB) {
		this.sideTriangleB = sideTriangleB;
	}

	public double getSideTriangleC() {
		return sideTriangleC;
	}

	public void setSideTriangleC(double sideTriangleC) {
		this.sideTriangleC = sideTriangleC;
	}
}
