package pro;

public class Ex04 {

	public static void main(String[] args) {
		int [] score = {40, 50, 60};
		int count = score.length;
		int data = 80;
		
		System.out.println(score);
		
		int[] temp = score;
		System.out.println(temp);
		
		score = new int[count + 1];
		System.out.println(score);
		System.out.println(temp);
		
		for (int i=0; i<count; i++) {
			score[i] = temp[i];
		}
		temp = null;
		
		for (int i=0; i<score.length; i++) {
			System.out.print(score[i] + " ");
		}
		System.out.println();
		
		score[count] = data;
		
		for (int i=0; i<score.length; i++) {
			System.out.print(score[i] + " ");
		}

	}

}
