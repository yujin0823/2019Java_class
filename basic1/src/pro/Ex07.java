package pro;

class Student {
	static String name = "양영고등학교";
	static int studentNumber = 200;
	String stuName;
	int stuNumber;
}

public class Ex07 {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		Student s2 = new Student();
		
		s1.stuName = "로미오";
		s1.stuNumber = 1111;
		Student.studentNumber++;
		System.out.println(s1.stuName + "," + s1.stuNumber);
		System.out.println(Student.studentNumber);
		
		s2.stuName = "줄리엣";
		s2.stuNumber = 2222;
		Student.studentNumber++;
		System.out.println(s2.stuName + "," + s2.stuNumber);
		System.out.println(Student.studentNumber);
		
		Student s3 = s1;
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}

}
