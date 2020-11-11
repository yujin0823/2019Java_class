package n5File;
//buffer사용할때랑 안할때 속도비교
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
			start = System.currentTimeMillis();  //현재시작시간측정
			while(fis1.read() != -1) {
				//아무것도 안함.
			}
			end = System.currentTimeMillis(); // 종료시간측정
			fis1.close();
			
			System.out.println("미사용 : " + (end - start) + "ms");
			
			System.out.println("---------------");
			
			FileInputStream fis2 = new FileInputStream(file);
			BufferedInputStream bis = new BufferedInputStream(fis2);
			start = System.currentTimeMillis();
			while(bis.read() != -1) {
				//아무것도 안함.
			}
			end = System.currentTimeMillis();
			bis.close();
			fis2.close();
			
			System.out.println("사용 : " + (end - start) + "ms"); 
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("에러발생");
		}
	}
}
