package gondr;

import java.util.Scanner;

public class ProjectMainW {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String url = "http://comic.naver.com/webtoon/detail.nhn?";
		System.out.println("���ϴ� ������ id�� �Է��ϼ���");
		String id = in.next();
		url += "titleId=" + id;
		
		System.out.println("���ϴ� ������ ȸ���� �Է��ϼ���");
		String no = in.next();
		url += "&no=" + no;
		
		System.out.println("����� ��θ� �Է��ϼ���");
		String path = in.next();
		
		//������� �Է��ϸ� 
		//http://comic.naver.com/webtoon/detail.nhn?titleId=697685&no=96
		//�̷����� url�� �������.
		
		Downloader d = new Downloader();
		d.download(url, path);

	}

}
