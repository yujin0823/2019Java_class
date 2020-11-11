package main;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

import model.Toon;

public class N6_SaveList {

	public static void main(String[] args) {
		ArrayList<Toon> list = new ArrayList<>();
		
		list.add(new Toon("기능반의 소리", "12345"));
		list.add(new Toon("양영 소프트", "45678"));
		list.add(new Toon("심연의 평가전", "78910"));
		list.add(new Toon("요한이의 꿈", "444444"));
		
		File saveFile = new File ("data.txt");
		
		try {
			FileOutputStream fos = new FileOutputStream(saveFile);
			OutputStreamWriter osw = new OutputStreamWriter(fos);
			BufferedWriter bw = new BufferedWriter(osw);
			
			for (Toon toon : list) {
				bw.write(toon.toFile());
				bw.newLine();
			}
			bw.flush();
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("오류 발생");
		}
		
	}

}
