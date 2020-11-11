package main;

import model.N7_Guitar;
import model.N7_Piano;
import model.N7_Soundable;

public class N7_MainApp {
	public static void main(String[] args) {
		
		Box<String> box = new N7_AnimalBox<>();
		
		box.put("°í¾çÀÌ");
		box.get();
		box.open();
		
		System.out.println("------------------");
		
		printSound(new N7_Guitar());
		printSound(new N7_Piano());
	}
	
	public static void printSound(N7_Soundable i) {
		System.out.println(i.sound());
	}
}
