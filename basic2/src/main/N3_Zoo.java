package main;

import java.util.ArrayList;

import model.Animal;
import model.Cat;
import model.Dog;

public class N3_Zoo {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.name = "ÄíÅ°";
		d.introduce();
		d.bark();
		d.breath();
		
		Cat c = new Cat();
		c.name = "ÃÊÄÚ";
		c.introduce();
		c.bark();
		c.breath();
		
		System.out.println("-------------");
		
		ArrayList<Animal> list = new ArrayList<Animal>();
		list.add(d);
		list.add(c);
		
		for (Animal a : list) {
			a.breath();
		}
		
	}
}
