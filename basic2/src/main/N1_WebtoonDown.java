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
		
		System.out.println("작품 id 입력");
		String toonId = in.nextLine();
		
		System.out.println("시작 회차 입력");
		int start = in.nextInt();
		
		System.out.println("종료 회차 입력");
		int end = in.nextInt();
		
		for(int toonNo = start; toonNo <= end; toonNo++) {
			String url = "https://comic.naver.com/webtoon/detail.nhn?titleId=" 
					+ toonId + "&no=" + toonNo;
	
			File dir = new File("data/" + toonNo);
			dir.mkdirs();
			
			Downloader.down(url, Integer.toString(toonNo));
			
			System.out.println(toonNo + "회 다운로드 완료");
		}

	}
}
