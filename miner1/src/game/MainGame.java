package game;

import java.util.Random;

import javafx.fxml.FXML;
import javafx.geometry.VPos;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.text.TextAlignment;

public class MainGame {
	private GraphicsContext gc;
	private int gap = 5; // size와 size의 사이 
	private int size = 30; 
	private int p = 3;
	
	private Integer[][] board;
	private int[][] reveal; //밝히다
	
	private boolean debug = false; //디버그 모드 꺼두고
	
	private int mineCnt = 20;

	private int flagCnt = 0;
	
	private boolean gameover = false;
	
	public MainGame(GraphicsContext gc) {
		this.gc = gc;
		board = new Integer[10][10];
		reveal = new int[10][10];
		initGame();
	}

//	public MainGame(Button start) {
//		gameover = true;
//	}

	public void initGame() {
		
		//판 배열 초기화
		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j < board[i].length; j++) {
				board[i][j] = 0;
				reveal[i][j] = MineStatus.LOCKED;
			}
		}
		
		//지뢰배치
		int[] minePos = new int[100];
		for(int i = 0; i < 100; i++) {
			minePos[i] = i;
		}
		
		Random rnd = new Random();
		for(int i = 0; i < mineCnt; i++) {
			int idx = rnd.nextInt(100 - i);
			int pos = minePos[idx]; //뽑힌거 idx에 저장??
			minePos[idx] = minePos[100-i-1]; //덮어써서 버린다.
			
			int y = pos / 10;
			int x = pos % 10;
			
			board[x][y] = -1; //-1은 지뢰를 말함.
		}
		
		//주변 숫자 계산
		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j < board[i].length; j++) {
				if(board[i][j] == -1) continue;
				board[i][j] = checkCount(i, j);
			}
		}
	}
	
	private int checkCount(int y, int x) {
		int cnt = 0;
		
		for(int i = -1; i <= 1; i++) {
			for(int j = -1; j <= 1; j++) {
				if(x + j < 0 || x + j >= 10
					|| y + i < 0 || y + i >= 10
					|| (i==0 && j == 0)) {
					continue; // 검사안함
				}
				if(board[y + i][x + j] == -1) {
					cnt++;
				}
			}
		}
		
		return cnt;
	}
	
	public void render() {
		gc.setTextAlign(TextAlignment.CENTER); //텍스트 가로 정렬
		gc.setTextBaseline(VPos.CENTER);
		gc.setStroke(Color.rgb(255, 255, 255));
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				//외부 사각형
				gc.setFill(Color.rgb(86, 98, 112));
				int x = gap * (j+1) + j * size;
				int y = gap * (i+1) + i * size;
				gc.fillRect(x,y,size, size);
				
				//내부 사각형
				gc.setFill(Color.rgb(165, 147, 224));
				gc.fillRect(x + p, y + p, size - 2 * p, size - 2 * p);
				
				if( debug ) {
					gc.strokeText(board[i][j].toString(), x + size/2, y + size/2);
				}else if(reveal[i][j] == MineStatus.REVEAL) {
					gc.strokeText(board[i][j].toString(), x + size/2, y + size/2);
				}else if (reveal[i][j] == MineStatus.FLAGED) {
					gc.setFill(Color.rgb(40, 80, 67));
					gc.fillRoundRect(x+4, y+4, size-8, size-8, 4, 4);
				}
				
			}
		}
	}
	
	public void clickHandle(MouseEvent e) {
		if (gameover) return;
		
		double mouseX = e.getX();
		double mouseY = e.getY();
		
		int bs = gap+size;
		
		if(mouseX % bs < gap || mouseY % bs < gap) {
			return; //경계 클릭은 반응하지 않는다.
		}
		
		int i = (int) (mouseY / bs);
		int j = (int) (mouseX / bs);
		//여기서 mouseX와 mouseY를 이용하여 i, j 값을 구하고
		
		if( i > 10 || j > 10) {
			return; //게임판을 벗어나면 처리하지 않는다.
		}
		
//		System.out.println(mouseX + ", " + mouseY);
//		System.out.println(board[i][j] + "가 클릭");
		
		MouseButton btn = e.getButton();
		
		if(btn == MouseButton.SECONDARY) {
			rightClickHandle(i, j);
		}else if(btn == MouseButton.PRIMARY) {
			leftClickHandle(i, j);
		}
		
		render();
	}
	
	public void leftClickHandle (int y, int x) {
		if (reveal[y][x] == MineStatus.REVEAL || reveal[y][x] == MineStatus.FLAGED) {
			return;
		}
		
		reveal[y][x] = MineStatus.REVEAL;
		
		if (board[y][x] == -1) {
			GameUtil.alert("님 사망");
			gameover = true;
		}
	}
	
	private void rightClickHandle(int y, int x) {
		if(reveal[y][x] == MineStatus.FLAGED) {
			reveal[y][x] = MineStatus.LOCKED;
			flagCnt--;
			
			return;
		}
		
		if(flagCnt >= mineCnt) {
			//Alert창으로 변경
			GameUtil.alert("설정할 수 있는 최대 깃발수 초과");
			return;
		}
		
		reveal[y][x] = MineStatus.FLAGED;
		flagCnt++;
		
		//게임끝났는지 체크해야함.
		if (checkGame()) {
			GameUtil.alert("게임종료");
			gameover = true;
		}
		
	}
	
	private boolean checkGame() {
		int cnt = 0;
		
		for (int i=0; i<board.length; i++) {
			for (int j=0; j<board[i].length; j++) {
				if (board[i][j] == -1 && reveal[i][j] == MineStatus.FLAGED) {
					cnt++;
				}
			}
		}
		
		return cnt == mineCnt;
	}
	
	public int checkFlag() {
		return flagCnt;
	}
	
	public boolean isGameOver() {
		gameover = false;
		return gameover;
	}
	
	public int getMineCnt() {
		return mineCnt;
	}

	public void setMineCnt(int mineCnt) {
		this.mineCnt = mineCnt;
	}
}
