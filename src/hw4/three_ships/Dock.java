package hw4.three_ships;


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
			while (ship != null && ship.isStatusOfLoad()) {
				if (ship.deleteOneBoxFromShip()) {
					System.out.println(Thread.currentThread().getName() + " oneBoxDelete!!! sizeBoxesInShip: " + ship.getNumberBox().size());
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					stok.addBoxToStok(1);
				}

			}
			waterArea.addShipToWaterArea(ship);
		}
	}


}
