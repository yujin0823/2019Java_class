package pro;

class T1 {
	int num = 10;
	void changeNum(int num) {
		System.out.println("5번은 ? " + this);
		this.num = num;
	}
}

public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		T1 test1 = new T1();
		T1 test2 = new T1();
		System.out.println("1번은? = " + test1);
		System.out.println("2번은? = " + test2);
		System.out.println("3번은? = " + test1.num);
		test1.num = 100;
		System.out.println("3번은? = " + test1.num);
		test1.changeNum(50);
		System.out.println("6번은? = " + test1.num);

	}

}
