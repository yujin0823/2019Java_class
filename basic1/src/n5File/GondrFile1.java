package n5File;

import java.io.File;

public class GondrFile1 {

	public static void main(String[] args) {
		File file = new File ("data/data.txt");
		
		try {
			file.createNewFile();
			System.out.println("������ ���������� ����");
			
		} catch (Exception e) {
			System.out.println("���ϻ�������");
		}

	}

}
