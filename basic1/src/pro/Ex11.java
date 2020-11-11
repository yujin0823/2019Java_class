package pro;

class Subject {
	String name;
	int score;
}

class Stu {
	Subject[] subjects;
	String name;
}

public class Ex11 {

	public static void main(String[] args) {
		Stu[] st = new Stu[3];

		st[0] = new Stu();
		st[0].subjects = new Subject[3];

		for (int i = 0; i < 3; i++) {
			st[0].subjects[i] = new Subject();
			System.out.println(st[0].subjects[i]);
		}
		
		st[1] = new Stu();
		System.out.println(st[0]);
		System.out.println(st[1]);
		st[1].subjects = new Subject[2];
		st[1].subjects[0] = new Subject();
		st[1].subjects[1] = new Subject();
		
		st[2] = new Stu();
		st[2].subjects = new Subject[2];
		st[2].subjects[0] = new Subject();

	}

}
