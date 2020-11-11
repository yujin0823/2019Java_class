package n3array;

import java.util.Random;

public class N13RadomTest {

	public static void main(String[] args) {
		Random rnd = new Random();
		
		String[] types = {
				"¿ø¼şÀÌ´Ù", 
				"±İºØ¾î´Ù", 
				"°³Áü½ÂÀÌ´Ù", 
				"»ç¶÷ÀÌ´Ù", 
				"ºıºıÀÌ´Ù"};
		System.out.println(types[rnd.nextInt(5)]);

	}

}
