package n1main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class N3ScannerTest {
	// ctrl + shift + 'o'
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		/*수업*/
		
		//try {
		//	double user = in.nextDouble();		
		//	System.out.println(user);
		//}catch (InputMismatchException e) {
		//	System.out.println("올바른 값을 입력하세요");
		//}
		
		
		/*문제2*/
		//System.out.println("첫 번째 정수를 입력하세요");
		//int firstF = in.nextInt();
		
		//System.out.println("두 번째 정수를 입력하세요");
		//int secondS = in.nextInt();
		
		//System.out.println("두 정수의 합은 :"+(firstF+secondS));
		
		
		/*문제 3*/
		
		//System.out.println("첫번째 실수를 입력하세요");
		//double first =  in.nextDouble();
		
		//System.out.println("두번째 실수를 입력하세요");
		//double second =  in.nextDouble();
		
		//System.out.println("두수의 합은 :"+(first+second));
		
		
		/*문제4*/
		
		//System.out.println("높이를 입력하세요");
		//int high = in.nextInt();
		
		
		
		/*과제2번*/
		
		//System.out.println("첫번째 수를 입력하세요");
		//int fristN = in.nextInt();
		
		//System.out.println("두번째 수를 입력하세요");
		//int secondN = in.nextInt();
		
		//System.out.println("두수의 곱은"+fristN*secondN);
		
		
		/*과제3번*/
		
		//System.out.println("이름을 입력하세요");
		//String name = in.next();
		
		//System.out.println("나이를 입력하세요");
		//int age =  in.nextInt();
		
		//System.out.println("이름은 :"+name);
		//System.out.println("나이는 :"+age);
		
		
		/*과제4번*/
		//System.out.println("반지름을 입력하새요");
		//double half = in.nextDouble();
		
		//System.out.println("원의 넓이는"+half*half*3.14);
		
		
		/*과제8번*/
		
		System.out.println("화씨 온도를 입력하세요");
		double F = in.nextDouble();
		
		double C = (5/9.0)*(F-32);
		
		System.out.println("섭씨 온도는"+C);

		
		
	}

}
