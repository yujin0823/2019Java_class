package main;

public class N7_AnimalBox<T> implements Box<T>{
	private T animal;
	
	
	@Override
	public void open() {
		System.out.println("���� �ڽ��� ����ϴ�.");
	}

	@Override
	public void put(T animal) {
		this.animal = animal;
		System.out.println(animal + "�� �ڽ��� �ֽ��ϴ�");		
	}

	@Override
	public void get() {
		System.out.println("������ ���½��ϴ�.");
	}
	
}
