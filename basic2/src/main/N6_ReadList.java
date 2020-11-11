package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

import model.Toon;

public class N6_ReadList {

	public static void main(String[] args) {
		ArrayList<Toon> list = new ArrayList<>();
		
		File file = new File ("data.txt");
		
		try {
			FileInputStream fis = new FileInputStream(file);
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader br = new BufferedReader(isr);
			
			while (true) {
				String line = br.readLine();
				if (line == null) break;
				
				String [] arr = line.split("/");
				//System.out.println("제목 : "+arr[0]+", 번호 : "+arr[1]);
				
				Toon toon = new Toon(arr[0], arr[1]);
				list.add(toon);
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("오류발생");
		}
		
		for (Toon toon : list) {
			System.out.println(toon);
		}

	}

}
