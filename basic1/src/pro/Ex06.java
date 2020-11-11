package pro;

public class Ex06 {
	public static void main(String[] args) {
		String[][] jang = {
				{"철수", "소고기"},
				{"영희", "김치"},
				{"철수", "바나나"},
				{"철수", "새우강"},
				{"영희", "오징어"},
				{"영희", "맛밤"},
		};
		String name = "영희";
		int idx = 1;
		int delIdx = -1;
		int count = 0;
		for (int i=0; i<jang.length; i++) {
			if (name.equals(jang[i][0])) {
				if (count == idx) {
					delIdx = i;
				}
				count += 1;
			}
//			System.out.println(delIdx + ", " + count);
		}
		
		String[][] temp = jang;
		jang = new String [temp.length - 1][2];
		int j = 0;
		System.out.println(temp.length);
		for (int i=0; i<temp.length; i++) {
			if (i != delIdx) {
				jang[j] = temp[i];
				j += 1;
			}
		}
		
//		for (int i=0; i<jang.length; i++) {
//			for (int k = 0; k<jang[i].length; k++) {
//				System.out.print(jang[i][k] + " ");
//			}
//			System.out.println();
//		}
	}
}
