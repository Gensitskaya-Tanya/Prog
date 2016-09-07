package hw1.vector3d;

/**
 * Описать  класс  «Vector3d»  (т.е.  он  должен  описывать  вектор  в  3-х  мерной,
 * декартовой  системе  координат).  В  качестве  свойств  этого  класса  возьмите
 * координаты вектора. Для этого класса реализовать методы сложения, и скалярного и
 * векторного  произведения  векторов.  Создайте  несколько  объектов  этого  класса  и
 * протестируйте их.
 */
public class Vector3d {
	private	int coordinateX;
	private	int coordinateY;
	private	int coordinateZ;

	public Vector3d(int coordinateX, int coordinateY, int coordinateZ) {
		this.coordinateX = coordinateX;
		this.coordinateY = coordinateY;
		this.coordinateZ = coordinateZ;
	}

	public Vector3d additionVector(Vector3d vector){
		int newCoordinatesX = coordinateX + vector.getCoordinateX();
		int newCoordinatesY = coordinateY + vector.getCoordinateY();
		int newCoordinatesZ = coordinateZ + vector.getCoordinateZ();
		return new Vector3d(newCoordinatesX, newCoordinatesY, newCoordinatesZ);
	}

	public int scalarProductOfVectors (Vector3d vector){
		int newCoordinatesX = coordinateX * vector.getCoordinateX();
		int newCoordinatesY = coordinateY * vector.getCoordinateY();
		int newCoordinatesZ = coordinateZ * vector.getCoordinateZ();
		return newCoordinatesX + newCoordinatesY + newCoordinatesZ;
	}
	public Vector3d vectorProductOfVectors (Vector3d vector){
		int newCoordinatesX = coordinateY*vector.getCoordinateZ() - coordinateZ*vector.getCoordinateY();
		int newCoordinatesY = coordinateZ*vector.getCoordinateX() - coordinateX*vector.getCoordinateZ();
		int newCoordinatesZ = coordinateX*vector.getCoordinateY() - coordinateY*vector.getCoordinateX();
		return  new Vector3d (newCoordinatesX, newCoordinatesY, newCoordinatesZ);
	}

	@Override
	public String toString() {
		return "Vector3d{" +
				"coordinateX=" + coordinateX +
				", coordinateY=" + coordinateY +
				", coordinateZ=" + coordinateZ +
				'}';
	}

	public int getCoordinateX() {
		return coordinateX;
	}

	public int getCoordinateY() {
		return coordinateY;
	}

	public int getCoordinateZ() {
		return coordinateZ;
	}
}
