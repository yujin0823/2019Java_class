package test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class N4ListSave {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		
		list.add("����");		list.add("��ȿ");		list.add("����");			
		list.add("�糪");		list.add("����");		

		File saveFile = new File("data.txt");
		
		try {
			FileOutputStream fos = new FileOutputStream(saveFile);
			OutputStreamWriter osw = new OutputStreamWriter(fos);
			BufferedWriter bw = new BufferedWriter(osw);
			
			for(String item : list) {
				bw.write(item);
				bw.newLine();
			}
			
			bw.flush();  	// ���۾��� �ؾ� ������ ��ϵȴ�.
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("����� �����߻�");
		}

	}

}