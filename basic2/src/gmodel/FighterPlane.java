package gmodel;

import java.awt.Image;

public class FighterPlane {
	public double speed;
	public double bullet_speed;
	public int hp;
	public Image shapeImage;
	public int x;
	public int y;
	
	public void moveLeft() {
		x -= speed;
	}
	
	public void moveRight() {
		x += speed;
	}
	
	public void moveForward() {
		y += speed;
	}
	
	public void moveBackward() {
		y -= speed;
	}
	
	public void fireBullet() {
		//ź�߻� ���� ���α׷�
	
	}
	
	/* Plane ������ */
	// �Ʒ�����X
	
	public FighterPlane(double speed, double bullet_speed, int hp, int x, int y) {
		this.speed = speed;
		this.bullet_speed = bullet_speed;
		this.hp = hp;
		this.x = x;
		this.y = y;
	}

}
