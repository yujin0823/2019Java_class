package n5File;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class GondrFile7 {

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
			
			File outFile = new File ("data/result.txt");
			FileOutputStream fos = new FileOutputStream(outFile);
			OutputStreamWriter osw = new OutputStreamWriter(fos);
			BufferedWriter bw = new BufferedWriter(osw);
			
			for (int i=0; i<list.size(); i++) {
				bw.write(list.get(i));
				bw.newLine();
			}
			
			bw.flush();
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("¿À·ù");
		}
		
	}

}
