package n5File;
//�������翩�� ����, ���ϳ����б�
import java.io.File;
import java.io.FileInputStream;

public class N17_N1File {

	public static void main(String[] args) {

		File file = new File("data/a.txt");

		if (file.exists()) { // exists() ���� �����ϴ°� ���������ʴ°�
			System.out.println("������ ������");
		}else {
			System.out.println("������ �����");
		}
		
		// ������ ���� �� try
		try {
			// �Է½�Ʈ��
			FileInputStream fis = new FileInputStream(file);
			
			byte[] buffer = new byte[1024];
											 
			while (fis.read(buffer) != -1) { //read �ż���� �о�� ����Ʈ ���� ��ȯ
				System.out.write(buffer);	 //�� ����Ʈ ���� -1�� �Ǿ��ٴ� ���� ������ ���� �����Ͽ�
			}								 //�� �̻� �о���� ����Ʈ�� ���ٴ� �� �̶� while���� ����
			
			fis.close();

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("���� �б� ����");
		}

	}

}
