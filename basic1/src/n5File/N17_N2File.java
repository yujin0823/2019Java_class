package n5File;
//�������� �׸��� �������Ͽ� ������ �����
import java.io.File;
import java.io.FileOutputStream;
import java.util.Scanner;

public class N17_N2File {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		System.out.println("������ ���� ���� �Է��ϼ���");
		String filename = in.nextLine();
		
		File file = new File ("data/"+filename);
		
		try {
			FileOutputStream fos = new FileOutputStream(file);
			//���ϳ��� �ۼ�  ��½�Ʈ��
			while(true) {
				String data = in.nextLine();
				if (data.isEmpty()) {
					break;
				}
				fos.write(data.getBytes());
				//FileOutputStream�� ���� �� ���� byte�迭�� ��� �ϹǷ� ���Ͱ���
				//String�� byte�迭�� �ٲپ� �ִ� getBytes() �޽�带 �̿�
			}
			fos.close();
			System.out.println("���� ��� �Ϸ�");
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("���� ����� ����");
		}
		
	}

}
