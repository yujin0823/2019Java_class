package pro;

public class Ex05 {

	public static void main(String[] args) {
		int[] score = { 40, 50, 70, 80 };
		int count = score.length;

		int[] temp = score;
		score = new int[count + 1];
		int insertIdx = 2;
		int insertData = 60;

		int j = 0;
		for (int i = 0; i < count + 1; i++) {
			if (i != insertIdx) {
				score[i] = temp[j];
				System.out.println(score[i] + ", " + j);
				j += 1;
			}
		}
		temp = null;

		score[insertIdx] = insertIdx;
		count += 1;
	}

}
