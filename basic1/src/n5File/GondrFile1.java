package n5File;

import java.io.File;

public class GondrFile1 {

	public static void main(String[] args) {
		File file = new File ("data/data.txt");
		
		try {
			file.createNewFile();
			System.out.println("颇老捞 己傍利栏肺 积己");
			
		} catch (Exception e) {
			System.out.println("颇老积己角菩");
		}

	}

}
