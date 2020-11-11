package n5File;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class GondrFile6Test {

	public static void main(String[] args) {
		File file = new File ("data/data.txt");
		ArrayList<String> list = new ArrayList<String>();
		
		try {
			FileInputStream fis = new FileInputStream(file);
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader br = new BufferedReader(isr);
			
			while (true) {
				String line = br.readLine();
				if (line == null) {
					break;
				}
				list.add(line);
			}
			
			for (int i=0; i<list.size(); i++) {
				System.out.println(list.get(i));
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("¿À·ù");
		}

	}

}
