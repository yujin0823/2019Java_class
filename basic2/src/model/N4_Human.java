package model;

public class N4_Human {
	public String name;
	public String phone;
	public int shortCut;
	
	public N4_Human(String name, String phone, int shortCut) {
		this.name = name;
		this.phone = phone;
		this.shortCut = shortCut;
	}
	
	public String toString() {
		return "name : " + name + ", phone: " + phone + " s: " + shortCut;
	}
}
