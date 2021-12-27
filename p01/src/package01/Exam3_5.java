package package01;

import java.util.Scanner;

public class Exam3_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);//키보드 입력을 콘솔을 통해 받을 수 있는 Scanner 객체 sc생성
		
		System.out.print("정숫값 : "); //입력 구문
		int n = sc.nextInt();		//입력한 문자열(스트링) 데이터를 정수로 변환하여 n에 저장
		
		if(n>0) {//조건문 시작 n이 0보다 크면
			System.out.println("값이 양수입니다.");//출력 구문
		}else if (n<0) { // 다른 조건 n이 0 보다 작으면
			System.out.println("값이 음수입니다.");//출력 구문
		}else {//둘 다 해당하지 않으면
			System.out.println("값이 0입니다.");//출력구문
		}
	}

}
