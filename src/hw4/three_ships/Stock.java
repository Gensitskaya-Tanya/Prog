package hw4.three_ships;


import java.util.ArrayList;

public class Stock {
	private ArrayList<Integer> stokOfBoxes = new ArrayList<>();

	public Stock() {
	}


	public ArrayList<Integer> getStokOfBoxes() {
		return stokOfBoxes;
	}

	public void addBoxToStok(Integer box) {
		stokOfBoxes.add(box);
	}

}
