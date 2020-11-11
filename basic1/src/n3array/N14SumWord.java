package n3array;

import java.util.Random;
import java.util.Scanner;

public class N14SumWord {

	public static void main(String[] args) {
		String[] when = {"오늘", "내일", "모레"};
		String[] where = {"옥상", "학교", "콘서트", "우리집", "방송실", "기능반"};
		String[] who = {"솔라","문별","휘인","화사","마마무", "주영쌤"};
		String[] what = {"춤을 춘다", "이야기한다", "밥을 먹는다", "논다", "공부한다"};
		String[] how = {"격렬하게", "재미있게", "미친듯이"};
		
		Scanner in = new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		String name = in.next();
		Random rnd = new Random();
		
		System.out.println(name + 
		when[rnd.nextInt(3)] + " " +
		where[rnd.nextInt(6)] + "에서 " +
		who[rnd.nextInt(6)] + "와 " + 
		how[rnd.nextInt(3)] + " " +
		what[rnd.nextInt(5)]
		);

	}

}
