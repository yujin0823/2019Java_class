package n5File;
//���������̶� �������� �Է��� �������Ͽ� �������ϳ��� ����
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class N17_N3File {

	public static void main(String[] args) {
		Scanner in =new Scanner (System.in);
		
		System.out.println("�������ϸ� �Է�");
		String o = in.nextLine();
		File oFile = new File ("data/"+o);
		System.out.println("�������ϸ� �Է�");
		String copy = in.nextLine();
		File cFile = new File ("data/"+copy);
		
		try {
			FileInputStream fis = new FileInputStream(oFile);
			FileOutputStream fos = new FileOutputStream(cFile);
			
			byte [] buffer = new byte [1024];
			
			while (fis.read(buffer) != -1) {
				fos.write(buffer);
			}
			
			fis.close();
			fos.close();
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("����");
		}
		
	}

}
