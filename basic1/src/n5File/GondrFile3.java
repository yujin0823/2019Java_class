package n5File;
//�������� �׸��� �������Ͽ� ������ �����
import java.io.File;
import java.io.FileOutputStream;
import java.util.Scanner;

public class GondrFile3 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		System.out.println("���� �����̸� �Է�");
		String fileName = in.nextLine();
		File file = new File ("data/"+fileName);
		
		try {
			FileOutputStream fos = new FileOutputStream(file);
			
			while (true) {
				String data = in.nextLine();
				
				if (data.isEmpty()) {
					break;
				}
				
				fos.write(data.getBytes());
			}
			fos.close();
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("����");
		}
		
	}

}
