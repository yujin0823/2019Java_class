package n5File;
//만들파일 그리고 만든파일에 저장할 내용들
import java.io.File;
import java.io.FileOutputStream;
import java.util.Scanner;

public class N17_N2File {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		System.out.println("저장할 파일 명을 입력하세요");
		String filename = in.nextLine();
		
		File file = new File ("data/"+filename);
		
		try {
			FileOutputStream fos = new FileOutputStream(file);
			//파일내용 작성  출력스트림
			while(true) {
				String data = in.nextLine();
				if (data.isEmpty()) {
					break;
				}
				fos.write(data.getBytes());
				//FileOutputStream에 값을 쓸 때는 byte배열로 써야 하므로 위와같이
				//String을 byte배열로 바꾸어 주는 getBytes() 메써드를 이용
			}
			fos.close();
			System.out.println("파일 기록 완료");
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("파일 기록중 오류");
		}
		
	}

}
