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
		
		list.add(new Toon("��ɹ��� �Ҹ�", "12345"));
		list.add(new Toon("�翵 ����Ʈ", "45678"));
		list.add(new Toon("�ɿ��� ����", "78910"));
		list.add(new Toon("�������� ��", "444444"));
		
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
			System.out.println("���� �߻�");
		}
		
	}

}
