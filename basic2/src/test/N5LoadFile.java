package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class N5LoadFile {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("읽어올 파일 이름을 입력하세요");
		String filename = in.nextLine();
		
		File file = new File(filename);
		try {
			FileInputStream fis = new FileInputStream(file);

			//이곳에 추가로 코드 작성해야 함.
			byte [] buffer = new byte [1024];
			
			while (fis.read(buffer) != -1) {
				System.out.write(buffer);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("존재하지 않습니다.");
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("에러 발생");
		}
	}
}