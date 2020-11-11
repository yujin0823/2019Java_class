package net.gondr.domain;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Block {
	private Color color;
	private boolean fill;
	private double x;
	private double y;
	private double size;
	private double borderSize;
	
	public Block(double x, double y, double size) {
		this.x = x;
		this.y = y;
		this.size = size;
		this.borderSize = 2;
		this.fill = false;
		color = Color.WHITE;
	}
	
	public void render(GraphicsContext gc) {
		if(fill) {
			gc.setFill(color.darker());
			gc.fillRoundRect(x, y, size, size, 4, 4); //모서리가 4px만큼 둥근 사각형
			
			gc.setFill(color);
			gc.fillRoundRect(x + this.borderSize, y + this.borderSize,
							size - 2*this.borderSize, size - 2*this.borderSize,
							4, 4);
		}
	}
	
	public void setData(boolean fill, Color color) { //현재 상태저장
		this.fill = fill;
		this.color = color;
	}
	
	public boolean getFill() { //현재 상태 볼수있도록
		return fill;
	}
	
	public Color getColor() { 
		return color;
	}
	
	public void copyData(Block block) { //한 줄 채웠을 때 그 다음 줄 복사해서 아래로 내려오게 하는 역할 
		this.fill = block.getFill();
		this.color = block.getColor();
	}
}
