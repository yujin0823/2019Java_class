package n5File;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

//InputStream : ����Ʈ ������ �д´� (�ѱ��� ������)

public class N17_N5File {
	
	public static void main(String[] args) {
		File file = new File("data/a.txt");
		ArrayList<String> list = new ArrayList<>();
		
		try {
			FileInputStream fis = new FileInputStream(file);
			InputStreamReader isr = new InputStreamReader(fis);
			//InputStreamReader : ���ڴ����� �д´� (�ѱ�ó������)
			BufferedReader br = new BufferedReader(isr);
			
			while(true) {
				String line = br.readLine();
				if(line == null) {
					break;
				}
				
				list.add(line);
			}
			
			br.close();
			isr.close();
			fis.close();
			
			File outFile = new File("data/result.txt");
			FileOutputStream fos = new FileOutputStream(outFile);
			OutputStreamWriter osw = new OutputStreamWriter(fos);
			BufferedWriter bw = new BufferedWriter(osw);
			
			for(int i = 0; i < list.size(); i++) {
				bw.write(list.get(i));
			}
			bw.flush(); //����
//			bw.newLine(); //�״�� ������ ������
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
