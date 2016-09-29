package hw4.threeShips;


public class Main {
	public static void main(String[] args) {
		Dock dock = new Dock();
		dock.startWorkingDock();
		System.out.println(dock.getStok().getStokOfBoxes().size());


	}
}
