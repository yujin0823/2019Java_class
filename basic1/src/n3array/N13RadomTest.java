package n3array;

import java.util.Random;

public class N13RadomTest {

	public static void main(String[] args) {
		Random rnd = new Random();
		
		String[] types = {
				"�����̴�", 
				"�ݺؾ��", 
				"�������̴�", 
				"����̴�", 
				"�����̴�"};
		System.out.println(types[rnd.nextInt(5)]);

	}

}
