package n5File;
//만들파일 그리고 만든파일에 저장할 내용들
import java.io.File;
import java.io.FileOutputStream;
import java.util.Scanner;

public class GondrFile3 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		System.out.println("만들 파일이름 입력");
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
			System.out.println("오류");
		}
		
	}

}
