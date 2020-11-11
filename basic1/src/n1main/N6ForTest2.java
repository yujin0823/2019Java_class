package n1main;

public class N6ForTest2 {

	public static void main(String[] args) {
		
		for(int i=0;i<=10;i++) {
			if(i%2 ==0) {
				continue;
			}
			
			System.out.println(i +": 짝수는 이 문장이 출력안돼요");
		}

	}

}
