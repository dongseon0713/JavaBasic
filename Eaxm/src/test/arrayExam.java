package test;

import java.util.Scanner;

public class arrayExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int i ;
		int t;
		
		System.out.println("정수를 더합니다.");
		
		do {
			System.out.println("정수(0으로 종료) :");
			t = sc.nextInt();
			sum += t;
		} while (t != 0);
		
		System.out.println("합계는 " + sum + "입니다.");
			
			
//		for(i = 0;i < n; i++) {
//			System.out.println("정수(0으로 종료) :");
//			int t = sc.nextInt();
//			if(t == 0) {
//				break;
//			}
//			sum += t;
		}
	}


