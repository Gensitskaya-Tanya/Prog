package hw4.threeShips;


public class Dock {
	private Stok stok = new Stok();
	private WaterArea waterArea = new WaterArea(3);

	public Dock() {
	}

	public void startWorkingDock() {
		Thread thread1 = new Thread(new Runnable() {
			@Override
			public void run() {
				reloadShip();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		Thread thread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				reloadShip();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		thread1.setName("thread 1");
		thread2.setName("thread 2");
		thread1.start();
		thread2.start();
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private void reloadShip() {
		while (waterArea.isStatusOfLoadShipOnWaterArea()) {
			Ship ship = waterArea.getShip();
			int count = 1;
			while (ship.isStatusOfLoad()) {
				Integer box = ship.deleteOneBoxFromShip();
				if (box == 1){
					System.out.println(Thread.currentThread() + "count box delete " + count);
					stok.addBoxToStok(box);
//					System.out.println(Thread.currentThread() + "count box add      " + count);
					count++;
				}

			}
		}
	}

	public Stok getStok() {
		return stok;
	}

	public void setStok(Stok stok) {
		this.stok = stok;
	}

	public WaterArea getWaterArea() {
		return waterArea;
	}

	public void setWaterArea(WaterArea waterArea) {
		this.waterArea = waterArea;
	}
}
