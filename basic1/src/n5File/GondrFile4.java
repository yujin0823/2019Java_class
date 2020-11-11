package n5File;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class GondrFile4 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		System.out.println("������ ���ϸ� �Է�");
		String sourceFilename = "";
		File sFile;
		String destFilename = "";
		File dFile;
		
		while (true) {
			sourceFilename = in.nextLine();
			sFile = new File("data/"+sourceFilename);
			
			if(sFile.exists()){
				break; //�ش� ������ �����Ѵٸ� ������ �����.
			}else {
				System.out.println("������ �������� �ʽ��ϴ�. �ٽ� �Է����ּ���");
			}
		}
		
		System.out.println("����� ������ �̸��� �Է��ϼ���.");
		destFilename = in.nextLine();
		dFile = new File("data/" + destFilename);
		
		in.close();
		
		try {
			FileInputStream fis = new FileInputStream(sFile);
			FileOutputStream fos = new FileOutputStream(dFile);
			
			byte [] buffer = new byte [1024];
			
			while (fis.read(buffer) != -1) {
				fos.write(buffer);
			}
			
			fis.close();
			fos.close();
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
