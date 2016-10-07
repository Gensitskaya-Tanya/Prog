package hw4.three_ships;

import java.util.ArrayList;


public class Ship {
	private String name;
	private ArrayList<Integer> numberBox = new ArrayList<>();
	private boolean statusOfLoad = true;

	public Ship() {
	}

	public Ship(String name) {
		this.name = name;
		addBoxToShip();
	}

	private void addBoxToShip() {
		for (int i = 0; i < 10; i++) {
			numberBox.add(i);
		}
	}
	public  boolean deleteOneBoxFromShip(){
		if(numberBox.size()>0){
			numberBox.remove(0);
			return true;
		}
		statusOfLoad = false;
		return false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Integer> getNumberBox() {
		return numberBox;
	}

	public void setNumberBox(ArrayList<Integer> numberBox) {
		this.numberBox = numberBox;
	}

	public boolean isStatusOfLoad() {
		return statusOfLoad;
	}

	public void setStatusOfLoad(boolean statusOfLoad) {
		this.statusOfLoad = statusOfLoad;
	}
}
