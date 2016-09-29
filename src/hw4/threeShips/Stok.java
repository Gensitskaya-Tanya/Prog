package hw4.threeShips;


import java.util.ArrayList;

public class Stok {
	ArrayList<Integer> stokOfBoxes = new ArrayList<>();

	public Stok() {
	}


	public ArrayList<Integer> getStokOfBoxes() {
		return stokOfBoxes;
	}

	public void addBoxToStok(Integer box) {
		stokOfBoxes.add(box);
	}

}
