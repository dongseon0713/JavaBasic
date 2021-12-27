package package01;

import java.util.Scanner;

public class Question2 {
	public static void main(String[] args) {
		/*
		 * 원하는 기호를 입력하세요 >> @
		 * 원하는 횟수를 입력하세요 >> 5
		 * 
		 * @@@@@
		 * 
		 * 1누르면 증가 2누르면 감소 3누르면 종료 >>1
		 * 카운트 : 1
		 * 1누르면 증가 2누르면 감소 3누르면 종료 >>1
		 * 카운트 : 2		 
		 * 1누르면 증가 2누르면 감소 3누르면 종료 >>2
		 * 카운트 : 1
		 * 1누르면 증가 2누르면 감소 3누르면 종료 >>3
		 * 프로그램 종료  최종카운트 카운트 : 1				 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("원하는 기호를 입력하세요 >> ");
		String syb = sc.next();
		System.out.print("원하는 횟수를 입력하세요 >> ");
		int n = sc.nextInt();
		int i = 0;
		int count = 0;
		
		while (i < n) {
			System.out.print(syb);
			i++;
		}
		System.out.println();
		
		while (i != 3) {
			System.out.print("1) 증가 2) 감소 3) 종료  >>");
			i = sc.nextInt();
			if(i == 1) {
				count++;
				System.out.println("카운트 : " + count);
			}else if (i == 2) {
				count--;
				System.out.println("카운트 : " + count);
			}
		}
		System.out.printf("프로그램 종료 \t 최종 카운트 : %d", count);

	}
}
