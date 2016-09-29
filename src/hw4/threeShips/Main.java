package hw4.threeShips;


public class Main {
	public static void main(String[] args) {
		WaterArea waterArea = new WaterArea(3);
		Stock stock = new Stock();
		Dock dock1 = new Dock(stock, waterArea);
		Dock dock2 = new Dock(stock, waterArea);

		Thread thread1 = new Thread(dock1);
		Thread thread2 = new Thread(dock2);

		thread1.start();
		thread2.start();


		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println(stock.getStokOfBoxes().size());



	}
}
