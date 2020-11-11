package main;

public class N7_AnimalBox<T> implements Box<T>{
	private T animal;
	
	
	@Override
	public void open() {
		System.out.println("동물 박스를 열어봅니다.");
	}

	@Override
	public void put(T animal) {
		this.animal = animal;
		System.out.println(animal + "을 박스에 넣습니다");		
	}

	@Override
	public void get() {
		System.out.println("동물을 꺼냈습니다.");
	}
	
}
