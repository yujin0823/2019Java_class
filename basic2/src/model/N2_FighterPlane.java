package model;

public class N2_FighterPlane {
	public double speed; //����� �ӵ�
	public double bullet_speed; //ź�ӵ�
	public int hp; //hp
	public int x; //x��ǥ
	public int y; //y��ǥ
	
	public N2_FighterPlane(double speed, int x, int y) {
		this.speed = speed;
		this.x = x;
		this.y = y;
	}
	
	public void moveLeft() {
		x -= speed;
	}
	
	public void moveright() {
		x += speed;
	}
	
	public void printStatus() {
		System.out.println("x :"+ x + ", y : "+y);
	}

}
