package hw1.board;

public class Board {
	private Shape[] shapes = new Shape[4];


	public Board() {
	}

	public boolean addShape(Shape shape) {
		for (int i = 0; i < shapes.length; i++) {
			if (shapes[i] == null) {
				shapes[i] = shape;
				return true;
			}
		}
		return false;
	}

	public boolean deleteShape(Shape shape) {
		for (int i = 0; i < shapes.length; i++) {
			if (shapes[i].getClass() == shape.getClass()) {
				shapes[i] = null;
				return true;
			}
		}
		return false;
	}

	public String informationAboutShape() {
		String shapesInArray = "";
		for (Shape e : shapes) {
			if (e == null) {
				shapesInArray += "null" + System.lineSeparator();
				continue;
			}
			shapesInArray += e.getClass() + System.lineSeparator();
		}
		double summAreas = 0;
		for (Shape e : shapes) {
			if (null == e) {
				continue;
			}
			summAreas += e.getArea();
		}
		return shapesInArray + System.lineSeparator() + "summAreas " + summAreas;
	}


}
