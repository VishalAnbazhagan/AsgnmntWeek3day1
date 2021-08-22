package org.system;

public class Desktop extends Computer {

	private void desktopSize() {
		System.out.println("The desktop is standard size");
	}

	public static void main(String[] args) {

		Computer com = new Computer();
		com.computerModel();
		Desktop des = new Desktop();
		des.desktopSize();
	}

}
