package hw4.threeShips;


public class Dock implements Runnable {

	private Stock stok;
	private WaterArea waterArea;

	public Dock() {
	}

	public Dock(Stock stok, WaterArea waterArea) {
		this.stok = stok;
		this.waterArea = waterArea;
	}


	@Override
	public void run() {
		while (waterArea.isLadenShipExist()) {
			Ship ship = waterArea.getShip();
			int count = 1;
			while (ship != null && ship.isStatusOfLoad()) {

				if (ship.deleteOneBoxFromShip()) {
					System.out.println(Thread.currentThread() + "count box delete " + count);
					stok.addBoxToStok(1);
//					System.out.println(Thread.currentThread() + "count box add      " + count);
					count++;
				}

			}
			waterArea.addShipToWaterArea(ship);
		}
	}


}
