package test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class N1RecordFile {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		System.out.println("����� ���ϸ��� �Է��ϼ���");
		String FileName = in.nextLine();
		
		File file = new File (FileName);
		
		try {
			FileOutputStream fos = new FileOutputStream(file);
			OutputStreamWriter osw = new OutputStreamWriter(fos);
			BufferedWriter bw = new BufferedWriter(osw);
			
			System.out.println("������ �Է��ϼ���. �����Է½� ����");
			
			while (true) {
				String value = in.nextLine();
				
				if (value.isEmpty()) {
					break;
				}
				
				bw.write(value);
				bw.newLine();
			}
			bw.flush();
			
		} catch (Exception e) {
			
		}
	
		in.close();

	}

}
