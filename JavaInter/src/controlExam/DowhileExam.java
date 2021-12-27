package controlExam;

import java.util.Random;
import java.util.Scanner;

public class DowhileExam {
	/*
	 * do~while은 while 의 변형으로 기본 구조는 같지만
	 * while은 경우에 따라 단 한번도 실행되지 않는 경우도 있지만
	 * do~while은  * 반드시 한번은 무조건 실행 되도록 한다. 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1~100 사이의 난수를 하나 생성해서 
		 * 1과 100사이의 정수를 입력하세요 >> 50
		 * 더 작은 값으로 다시 입력하세요 
		 * 1과 100사이의 정수를 입력하세요 >> 20
		 * 더 큰 값으로 다시 입력하세요 
		 * 정답입니다.
		 
		
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		int a;
		int r = 1 + rand.nextInt(99);
		int count = 0;
		
		do {
			System.out.print("1~100 사이의 정수를 입력하세요 >>>");
			a = sc.nextInt();
			if (r > a) {
				System.out.println("더 큰값을 입력하세요.");
			}else if (r < a){
				System.out.println("더 작은 값을 입력하세요");
			}
			count++;
		} while(r != a);
		
		System.out.println("정답입니다. 총 시도한 횟수는 "+ count +"번 입니다.");
		*/
		
		/*	369 게임
		 * 100 이하에서 3의 배수 일때 "짝"을 출력하시오
		 * 3 짝
		 * 13 짝
		 * 36 짝짝
		 * 32 짝
		 * 
		int i = 0;
			for (i = 0 ; i <=100 ; i++) {
				System.out.print(i);
				do {
				if (i % 10 == 3 || i % 10 == 6 || i%10 == 9 ) {
					System.out.print("짝");
				}
				if (i/10 == 3 || i/10 == 6 || i/10 == 9) {
					System.out.print("짝");
				}
			}while(i>=100);
				System.out.println();
	} 
			*/
		
		/*	100이 넘어가는 순간 끝
		 * 
		 
		
		int sum = 0;
		
		int i = 0;
		
		while(true) {
			if(sum > 100) {
				break;
			}
			++i;
			sum += i;
			System.out.println(i+"까지의 합: " +sum);
		}
		System.out.println("최종값은 "+sum);
		System.out.println(i+"까지의 합");
		
		*/
		
		
		/*
		 * 3의 배수만 출력하시오 for continue
		 
		
		for(int i = 1 ;i <= 100; i++) {
			if (i%3 != 0) {
				continue;
			}
			System.out.println(i);
		}
		*/
		
		/*	이름 붙은 반복문
		 * break 문은 근접한 단 하나의 반복문만 벗어날 수 있다.
		 * 여러개의 반복문이 중첩된 경우 break 만으로는 완전히 벗어 날수 없다.
		 * loop:를 설정한 후에 break에 loop를 걸어둔다. 
		 
		loop:
		while() {
			while() {
				
				break loop;
			}
		}
		*/
		loop:
		for(int i = 2 ; i <= 9 ; i++) {
			for(int j = 1 ; j <= 9 ; j++) {
				if(j == 5) {
					break loop;
				}
				System.out.println(i+"*"+j +"="+ i*j);
			}
			System.out.println();
		}
	}
	}


