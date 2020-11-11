package gondr;

import java.util.Scanner;

public class ProjectMainW {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String url = "http://comic.naver.com/webtoon/detail.nhn?";
		System.out.println("원하는 웹툰의 id를 입력하세요");
		String id = in.next();
		url += "titleId=" + id;
		
		System.out.println("원하는 웹툰의 회차를 입력하세요");
		String no = in.next();
		url += "&no=" + no;
		
		System.out.println("저장될 경로를 입력하세요");
		String path = in.next();
		
		//여기까지 입력하면 
		//http://comic.naver.com/webtoon/detail.nhn?titleId=697685&no=96
		//이런식의 url이 만들어짐.
		
		Downloader d = new Downloader();
		d.download(url, path);

	}

}
