package main;

import model.N2_FighterPlane;

public class N2_Game {

	public static void main(String[] args) {
		N2_FighterPlane gondr = new N2_FighterPlane(5, 10, 10);

		gondr.printStatus();
		
		gondr.moveLeft();
		
		gondr.printStatus();

	}

}
