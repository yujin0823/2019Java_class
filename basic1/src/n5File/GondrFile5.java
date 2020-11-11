package n5File;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

public class GondrFile5 {

	public static void main(String[] args) {
		File file = new File ("data/p.jpg");
		
		long start = 0;
		long end = 0;
		
		try {
			FileInputStream fis1 = new FileInputStream(file);
			start = System.currentTimeMillis();
			while (fis1.read() != -1) {
				
			}
			end = System.currentTimeMillis();
			System.out.println("미사용 : "+(end-start));
			
			System.out.println("---------------------");
			
			FileInputStream fis2 = new FileInputStream(file);
			BufferedInputStream bis = new BufferedInputStream(fis2);
			start = System.currentTimeMillis();
			while (bis.read() != -1) {
				
			}
			end = System.currentTimeMillis();
			System.out.println("사용 : "+(end-start));
			
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("파일읽기오류");
		}

	}

}
