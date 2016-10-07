package hw4.three_ships;
/*
1) Существуют три корабля. На каждом из них 10 ящиков груза.
Они  одновременно  прибыли  в  порт  в  котором  только  два
дока.  Скорость  разгрузки  1  ящик  в  0.5  сек.  Напишите
программу  которая  управляя  кораблями  позволит  им
правильно разгрузить груз.

моя реализация:
есть сущности: Акватория, Корабль, Склад, Док
-Акватория хранит 3 корабля, может удалять и добавлять корабль в акваторию;
-Корабль имеет название, статус загруженности, изначально содержит 10 ящиков;
-Склад используется, чтобы куда-то переместить ящики из корабля :)
-Док - поток, который берет корабль из Акватории, при этом "заберает" его от туда,
 разгружает его и возвращает обратно в Акваторию;
 Из синхронизации, - синхронизированный метод в Акватории для поочередной выдаче кораблей Докам

 */

public class Main {
	public static void main(String[] args) {
		WaterArea waterArea = new WaterArea(3);
		Stock stock = new Stock();
		Dock dock1 = new Dock(stock, waterArea);
		Dock dock2 = new Dock(stock, waterArea);

		Thread thread1 = new Thread(dock1);
		Thread thread2 = new Thread(dock2);
		thread1.setName("thread 0");
		thread2.setName("thread 1");
		thread1.start();
		thread2.start();


		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("number boxes in Stock: " + stock.getStokOfBoxes().size());


	}
}
