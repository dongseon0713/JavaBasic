package variableExam;

import java.util.Scanner;

public class LogicalExam {
	/*	논리 연산자
	둘 이상의 조건을 and 또는 or 연결하여 하나의 식으로 표현한다.
	
	|| (or) 피 연산자의 어느 한쪽만 true 최종 값은 true로 변환
	&& (and) 피 연산자의 양쪽 모두 동시에 true 이어야만 최종값을 true로 변환
	
	x > 10 && x < 20	(o)
	10 < x && x < 20	(o)
	10 < x < 20			(x)
	
	i % 2 == 0 || i % 3 == 0	(2의 배수도 OK 3의 배수도 OK)
	
*/
	public static void main(String[] args) {
		
		//	Quiz 2 문자를 하나 입력 받아서 그 문자가 숫자인지  문자(영문자)인지를 출력하시오
		//	"문자를 하나 입력 하세요."
		//	"입력하신 문자는 숫자입니다."
		//	"입력하신 문자는 영문자입니다."
		
		Scanner sc = new Scanner(System.in);
		
		char c = ' ';
		System.out.print("문자를 하나 입력하세요.> ");
		String input = sc.nextLine();
		c = input.charAt(0);	//	String을 char로 변환 해준다. 0번 배열부터 시작 
		
		if (('a'<=c && c<='z') || ('A'<=c && c<='Z')) {
		System.out.println("입력하신 문자는 영문자입니다.");
		} else if ('0' <= c && c <='9'){
		System.out.println("입력하신 문자는 숫자 입니다.");
		}
		
		
		
		
	}
}
