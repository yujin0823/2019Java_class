package n3array;

public class N15Array {

	public static void main(String[] args) {
		int [][] arr2 = new int [4][3];
		
		//[[1,2,3],[4,5,6],[7,8,9], [10,11,12]]
		
		int cnt = 1;
		for (int i=0; i<arr2.length; i++) { //4
			for (int j=0; j<arr2[i].length; j++) {  //3
				arr2[i][j] = cnt;
				cnt++;
			}
		}
		
		printArray(arr2);
		
		/*메서드 없으면*/
		
//		for (int i=0; i<4; i++) {
//			for (int j=0; j<3; j++) {
//				System.out.print(arr2[i][j]+" ");
//			}
//			System.out.println("");
//		}

	}
	
	public static void printArray (int [][] paramArr2) {
		for (int i=0; i<paramArr2.length; i++) {
			for (int j=0; j<paramArr2[i].length; j++) {
				System.out.printf("%3d", paramArr2[i][j]);
//				System.out.print(paramArr2[i][j]+"\t");
			}
			System.out.println("");
		}
	}

}
