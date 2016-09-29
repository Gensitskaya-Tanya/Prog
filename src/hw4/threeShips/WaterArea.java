package hw4.threeShips;

import java.util.ArrayList;


public class WaterArea {
	private int numbership;
	private ArrayList<Ship> shiplist  = new ArrayList<>();
	private boolean statusOfLoadShipOnWaterArea = true;


	public WaterArea(int numbership) {
		this.numbership = numbership;
		generateShip();
	}

	public boolean deleteShipFromWaterArea() {
		if (shiplist.size() > 0) {
			shiplist.remove(0);
			checkBoxInShipOnWaterArea();
			return true;
		}
		return false;
	}

	public void addShipToWaterArea(Ship ship) {
		this.shiplist.add(ship);
	}

	private boolean checkBoxInShipOnWaterArea() {
		for (int i = 0; i < shiplist.size(); i++) {
			if (shiplist.get(i).isStatusOfLoad() == true) {
				statusOfLoadShipOnWaterArea = true;
				return true;
			}
		}
		statusOfLoadShipOnWaterArea = false;
		return false;

	}

	private void generateShip() {
		for (int i = 0; i < numbership; i++) {
			shiplist.add(new Ship(i + ""));
		}
	}

	public int getNumbership() {
		return numbership;
	}

	public void setNumbership(int numbership) {
		this.numbership = numbership;
	}

	public Ship getShip() {
		Ship ship = shiplist.get(0);
		deleteShipFromWaterArea();
		return ship;
	}

	public void setShip(ArrayList<Ship> shiplist) {
		this.shiplist = shiplist;
	}

	public boolean isStatusOfLoadShipOnWaterArea() {
		return statusOfLoadShipOnWaterArea;
	}

	public void setStatusOfLoadShipOnWaterArea(boolean statusOfLoadShipOnWaterArea) {
		this.statusOfLoadShipOnWaterArea = statusOfLoadShipOnWaterArea;
	}
}
