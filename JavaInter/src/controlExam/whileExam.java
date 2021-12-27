package controlExam;

import java.util.Scanner;

public class whileExam {
	public static void main(String[] args) {
		/*	while 반복문
		 * 	while 반복문은 for에 비해서 구조가 간단하다.
		 * 조건식이 참일 동안 반복 수행한다.
		 * 조선식 생략 불가, 보통 조건식에 true를 넣어 무한 반복 수행
		 * for(;;)	==	while(true)
		 * 무한 반복 설정 시에는 반드시 종료 조건을 만들어야 한다.
		 * 
		 * while (조건식) {
		 * 
		 * }
		 * 
		 * for(초기화;조건식;증감식){
		 * for(int i = 0; i< 5; i++){
		 * } 	이걸 while문으로 바꾸면
		 * 
		 * 초기화;(int i = 0)
		 * while(조건식(i< 5)){
		 * 		증감식(i++)
		 * }	형태로 바뀌게된다.
		 * 
		 */ 
		 /* Quiz 1. while 문을 사용하여 카운트 다운을 하는 중간 중간 쉬었다가
		 * 			다음카운트로 넘어가게 만들기
		 * 카운트 다운 시작
		 * 10
		 * 9
		 * 8
		 * 7
		 * 6
		 * 5
		 * 4
		 * 3
		 * 2
		 * 1
		 * Awesome!!
		 
		
		int i = 10;
		System.out.println("카운트 다운 시작");
		while (i >= 1) {
			System.out.println(i);
			i--;
			long j = 9_999_999_999L;	//	딜레이
			while (j >= 0 ) {
				j--;
			}
		}
		System.out.println("Awesome!!");
		*/
		
		/* Quiz 숫자를 입력하면 그 각각의 숫자들의 합을 계산하시고
		 * 
		
		
		int i = 0;
		int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 > ");
		i = sc.nextInt();
		
		while (i != 0) {
			sum += i%10;	//	10으로 나눈 나머지를 sum에 저장 ex) 1524/10 = 나머지가 4가 된다 그러므로 sum에 4저장
			i /= 10;		//	그 다음 4가 필요 없어짐으로 1524를 10으로 나누면 정수이기 때문에 4가 사라지게 된다.
		}
		System.out.println("각 자릿수의 합 : " + sum);
		*/
		
		/* Quiz 1 - 1 2 - 3 3 - 6 수가 누적되도록 10까지
		 * 
		 
		
		int num = 0;
		int i = 1;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("누적 합께를 원하는 숫자를 입력하세요 >  ");
		num = sc.nextInt();
		while (i<=num) {
			sum += i;
			System.out.println(i + " - " + sum);
			i++;
		}
		*/
	}
}
