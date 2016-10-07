package hw4.three_ships;

import java.util.ArrayList;


public class WaterArea {
	private ArrayList<Ship> shipList = new ArrayList<>();


	public WaterArea(int numberShip) {
		generateShip(numberShip);
	}

	public boolean deleteShipFromWaterArea() {
		if (shipList.size() > 0) {
			shipList.remove(0);
			return true;
		}
		return false;
	}

	public void addShipToWaterArea(Ship ship) {
		this.shipList.add(ship);
	}

	public boolean isLadenShipExist() {
		for (Ship aShipList : shipList) {
			if (aShipList.isStatusOfLoad()) {
				return true;
			}
		}
		return false;

	}

	private void generateShip(int numberShip) {
		for (int i = 0; i < numberShip; i++) {
			shipList.add(new Ship(i + ""));
		}
	}


	public synchronized Ship getShip() {
		if(shipList.size()>0) {
			Ship ship = shipList.get(0);
			deleteShipFromWaterArea();
			return ship;
		}
		return null;
	}

	public void setShip(ArrayList<Ship> shiplist) {
		this.shipList = shiplist;
	}


}
