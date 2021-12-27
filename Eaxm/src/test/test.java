package test;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a = 0;
//		int b = 0;
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("a를 입력 : ");
//		a = sc.nextInt();
//		System.out.print("b를 입력 : ");
//		b = sc.nextInt();
//		
//		if (a > b) {
//			System.out.println("a가 더 크다.");
//		}else if (a == b) {
//			System.out.println("a와 b는 같다.");
//		}else {
//			System.out.println("b가 더 크다.");
//		}
		
//		int a = 11;
//		int b = 55;
//		int w ;
//		
//		w = a;
//		a = b;
//		b = w;
//		
//		System.out.println(a);
//		System.out.println(b);
		
//		int[] array = {1,2,3,4,5};
//
//		
//		for (int i = 0 ; i < array.length ; i++) {
//			if (array[i] == 5) {
//				System.out.println(i + "번째 요소가 일치");
//				break;
//			}else if ( i == array.length - 1) {
//				System.out.println("찾지 못했습니다.");
//			}
//			
//		}
		int[] arr = {52,43,17,12,67,64};
		int head = 0;
		int tail = arr.length -1;
		int center;
		
		while (head <= tail) {
				center = (head+tail)/2;
			if(arr[center] == 17) {
				System.out.println(center + "번째 요소와 일치");
				return;
			}else if(arr[center] < 17){
				head = center + 1;
			}else {
				tail = center - 1;
			}
		}
		System.out.println("찾지 못했습니다.");
		
	}

}
