package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class N5LoadFile {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("�о�� ���� �̸��� �Է��ϼ���");
		String filename = in.nextLine();
		
		File file = new File(filename);
		try {
			FileInputStream fis = new FileInputStream(file);

			//�̰��� �߰��� �ڵ� �ۼ��ؾ� ��.
			byte [] buffer = new byte [1024];
			
			while (fis.read(buffer) != -1) {
				System.out.write(buffer);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("�������� �ʽ��ϴ�.");
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("���� �߻�");
		}
	}
}