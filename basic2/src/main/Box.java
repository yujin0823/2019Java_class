package main;

public interface Box<T> {
	public void open();
	public void put(T animal);
	public void get();
}
