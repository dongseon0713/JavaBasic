package controlExam;

public class forEachExam {

	/*
	 *	향상된 for 구문 for each구문
	 *	for(타입 변수명 : 배열 또는 컬렉션) {
	 *
	 *	}
	 */
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int sum = 0;
		int count = 0;
//		
//		for (int i = 0 ; i < arr.length ; i++) {
//			System.out.println(arr[i]);
		
//			for each문
		for (int i : arr) {
			System.out.println(i);
			sum +=i;
			count++;
			
		}
		System.out.printf("총합은 %d입니다. %n",sum);
		System.out.printf("갯수는 %d입니다. %n",count);
	}
}
