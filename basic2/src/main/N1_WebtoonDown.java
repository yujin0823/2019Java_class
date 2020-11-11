package main;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import n1_util.Downloader;

public class N1_WebtoonDown {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("��ǰ id �Է�");
		String toonId = in.nextLine();
		
		System.out.println("���� ȸ�� �Է�");
		int start = in.nextInt();
		
		System.out.println("���� ȸ�� �Է�");
		int end = in.nextInt();
		
		for(int toonNo = start; toonNo <= end; toonNo++) {
			String url = "https://comic.naver.com/webtoon/detail.nhn?titleId=" 
					+ toonId + "&no=" + toonNo;
	
			File dir = new File("data/" + toonNo);
			dir.mkdirs();
			
			Downloader.down(url, Integer.toString(toonNo));
			
			System.out.println(toonNo + "ȸ �ٿ�ε� �Ϸ�");
		}

	}
}
