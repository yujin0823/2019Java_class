package n5File;
//원본파일이랑 복사파일 입력후 복사파일에 원본파일내용 복사
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class N17_N3File {

	public static void main(String[] args) {
		Scanner in =new Scanner (System.in);
		
		System.out.println("원본파일명 입력");
		String o = in.nextLine();
		File oFile = new File ("data/"+o);
		System.out.println("만들파일명 입력");
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
			System.out.println("오류");
		}
		
	}

}
