package hw1.vector3d;


public class Main {
	public static void main(String[] args) {
		Vector3d vectorA = new Vector3d(3, 3, 3);
		Vector3d vectorB = new Vector3d(1, 1, 0);

		System.out.println(vectorA.additionVector(vectorB));
		System.out.println(vectorA.scalarProductOfVectors(vectorB));
		System.out.println(vectorA.vectorProductOfVectors(vectorB));


	}
}
