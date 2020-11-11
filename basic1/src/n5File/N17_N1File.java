package n5File;
//파일존재여부 유무, 파일내용읽기
import java.io.File;
import java.io.FileInputStream;

public class N17_N1File {

	public static void main(String[] args) {

		File file = new File("data/a.txt");

		if (file.exists()) { // exists() 파일 존재하는가 존재하지않는가
			System.out.println("파일이 존재함");
		}else {
			System.out.println("파일이 없어요");
		}
		
		// 파일을 묶을 때 try
		try {
			// 입력스트림
			FileInputStream fis = new FileInputStream(file);
			
			byte[] buffer = new byte[1024];
											 
			while (fis.read(buffer) != -1) { //read 매서드는 읽어온 바이트 수를 반환
				System.out.write(buffer);	 //이 바이트 수가 -1이 되었다는 것은 파일의 끝에 도달하여
			}								 //더 이상 읽어들일 바이트가 없다는 뜻 이때 while문을 종료
			
			fis.close();

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("파일 읽기 오류");
		}

	}

}
