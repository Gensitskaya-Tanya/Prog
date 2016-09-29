package hw4.threeShips;


import java.util.ArrayList;

public class Stock {
	ArrayList<Integer> stokOfBoxes = new ArrayList<>();

	public Stock() {
	}


	public ArrayList<Integer> getStokOfBoxes() {
		return stokOfBoxes;
	}

	public void addBoxToStok(Integer box) {
		stokOfBoxes.add(box);
	}

}
