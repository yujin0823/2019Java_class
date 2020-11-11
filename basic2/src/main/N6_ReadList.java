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
				//System.out.println("���� : "+arr[0]+", ��ȣ : "+arr[1]);
				
				Toon toon = new Toon(arr[0], arr[1]);
				list.add(toon);
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("�����߻�");
		}
		
		for (Toon toon : list) {
			System.out.println(toon);
		}

	}

}
