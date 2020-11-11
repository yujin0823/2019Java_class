package domain;

import java.time.LocalDate;

public class Todo {
	private int id;
	private String name;
	private LocalDate date;

	public Todo() {
		// nothing
	}

	public Todo(String name, LocalDate date) {
		this.name = name;
		this.date = date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	//이 객체가 ListView에 들어가게 되면 ListView는 자동으로 해당 객체의 ToString을 호출하기 때문에 
	//리스트뷰에 나타날 모양을 toString에 구현해주어야한다.
	@Override
	public String toString() {
		return name + "(" + date + ")";
	}

}
