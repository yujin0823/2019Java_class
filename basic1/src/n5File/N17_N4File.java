package n5File;
//buffer����Ҷ��� ���Ҷ� �ӵ���
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

public class N17_N4File {
	public static void main(String[] args) {
		
		File file = new File("data/p.jpg");
		
		long start = 0;
		long end = 0;
		
		try {
			FileInputStream fis1 = new FileInputStream(file);
			start = System.currentTimeMillis();  //������۽ð�����
			while(fis1.read() != -1) {
				//�ƹ��͵� ����.
			}
			end = System.currentTimeMillis(); // ����ð�����
			fis1.close();
			
			System.out.println("�̻�� : " + (end - start) + "ms");
			
			System.out.println("---------------");
			
			FileInputStream fis2 = new FileInputStream(file);
			BufferedInputStream bis = new BufferedInputStream(fis2);
			start = System.currentTimeMillis();
			while(bis.read() != -1) {
				//�ƹ��͵� ����.
			}
			end = System.currentTimeMillis();
			bis.close();
			fis2.close();
			
			System.out.println("��� : " + (end - start) + "ms"); 
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("�����߻�");
		}
	}
}
