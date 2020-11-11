package pro;

public class Ex02 {

	public static void main(String[] args) {
		int num = 3;
		String [] test = new String[4];
		int count = test.length;
		int j = 0;
		while (count > 0) {
			if (num % 3 == 0) {
				test[j] = "짝";
				j++;
			}else {  
				count--;
			}
			num++;
			System.out.println(num + ", " + count + ", " + j);
		}
		
		for (int i=0; i<test.length; i++) {
			System.out.print(test[i] + " ");
		}
	}

}
