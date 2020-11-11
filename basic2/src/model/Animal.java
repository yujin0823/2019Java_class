package model;

public abstract class Animal {
	public String name;
	
	public void introduce() {
		System.out.println("저의 이름은 " + this.name);
	}
	
	public abstract void breath();
}
