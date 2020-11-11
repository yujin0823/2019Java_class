package n5File;

import java.io.File;
import java.io.FileInputStream;

public class GondrFile2 {

	public static void main(String[] args) {
		File file = new File ("data/a.txt");
		
		try {
			FileInputStream fis = new FileInputStream(file);
			
			byte [] buffer = new byte [1024];
			
			while (fis.read(buffer) != -1) {
				System.out.write(buffer);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("¿À·ù");
		}

	}

}
