package model;

public abstract class Animal {
	public String name;
	
	public void introduce() {
		System.out.println("���� �̸��� " + this.name);
	}
	
	public abstract void breath();
}
