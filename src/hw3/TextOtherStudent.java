package hw3;

/**
 * Created by Tanya on 24.09.2016.
 */
public class TextOtherStudent {
	public static void main(String[] args) {
		double fact = 1;
		double x = Double.valueOf("4");

		for (double j = x; j > 0; j--) {
			if (j == 1) {
				System.out.println("potok " + "  ¹ - " + x + " factorial- " + fact);
			}
			fact *= j;
		}
	}

}
