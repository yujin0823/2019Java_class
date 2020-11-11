package n5File;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class GondrFile6 {

	public static void main(String[] args) {
		
		File file = new File ("data/data.txt");
		
		try {
			FileInputStream fis = new FileInputStream(file);
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader br = new BufferedReader(isr);
			
			while (true) {
				String line = br.readLine();
				if (line == null) {
					break;
				}
				System.out.println(line);
			}

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("오류발생");
		}

	}

}
