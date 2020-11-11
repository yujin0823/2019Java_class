package gondr;

import gmodel.FighterPlane;

public class Plane {

	public static void main(String[] args) {
		FighterPlane myFighter = new FighterPlane(5, 20, 20, 0, 0);
		
		myFighter.moveRight();
		System.out.println(myFighter.x);
	
		/* 위에랑 똑같음 */
//		FighterPlane myFighter = new FighterPlane();
//		myFighter.speed = 5;
//		myFighter.bullet_speed = 20;
//		myFighter.hp = 20;
//		myFighter.x = 0;
//		myFighter.y = 0;
//		
//		myFighter.moveRight();
//		System.out.println(myFighter.x);

	}

}
