package n5File;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class GondrFile4 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		System.out.println("복사할 파일명 입력");
		String sourceFilename = "";
		File sFile;
		String destFilename = "";
		File dFile;
		
		while (true) {
			sourceFilename = in.nextLine();
			sFile = new File("data/"+sourceFilename);
			
			if(sFile.exists()){
				break; //해당 파일이 존재한다면 루프를 벗어난다.
			}else {
				System.out.println("파일이 존재하지 않습니다. 다시 입력해주세요");
			}
		}
		
		System.out.println("복사될 파일의 이름을 입력하세요.");
		destFilename = in.nextLine();
		dFile = new File("data/" + destFilename);
		
		in.close();
		
		try {
			FileInputStream fis = new FileInputStream(sFile);
			FileOutputStream fos = new FileOutputStream(dFile);
			
			byte [] buffer = new byte [1024];
			
			while (fis.read(buffer) != -1) {
				fos.write(buffer);
			}
			
			fis.close();
			fos.close();
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
