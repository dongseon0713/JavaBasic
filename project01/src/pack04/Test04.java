package pack04;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		//프로젝트명 : project01
		//패키지명 : pack04
		//자바파일명 : Test04
		
		Scanner sc = new Scanner(System.in);	//키보드 입력을 콘솔을 통해 받을 수 있는 Scanner 객체 sc생성
		
		String singular = "";					//문자형 변수 singular를 공백으로 초기화
		int triangle = 0;						//정수형 변수 a를 0으로 초기화
		
		System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 표시합니다.");	//"왼쪽 아래가 직각인 이등변 삼각형을 표시합니다"를 출력한다.
		System.out.print("단수는 ? : ");			//입력 구문
		singular = sc.next();					//사용자가 콘솔에서 String(문자열)로 입력한 값을 변수 singular에 저장
		triangle = Integer.parseInt(singular);	//문자열 singular 스트링 변수를 정수형 변수로 변환하여 triangle에 저장
		
		for(int i = 0 ; i <= triangle; i++) {	//반복문 시작 정수형 변수 i가 0이고 조건 triangle보다 작거나 같을 때 출력 후 i가 1증가
			for(int j = 0 ; j <= i ; j++) {		//반복문 시작 정수형 변수 j가 0이고 조건 i보다 작거나 같을 때 출력 후 j가 1증가
				System.out.print("*");			//출력 구문
			}
			System.out.println();				//for문 안에 for문이 끝나면 줄 바꿈
		}
		System.out.println();					//for문이 끝난 후에 줄 바꿈
		System.out.println("왼쪽 위가 직각인 이등변 삼각형을 표시합니다.");	//"왼쪽 위가 직각인 이등변 삼각형을 표시합니다"를 출력한다.
		System.out.print("단수는 ? : ");			//입력 구문
		singular = sc.next();					//사용자가 콘솔에서 String(문자열)로 입력한 값을 변수 singular에 저장
		triangle = Integer.parseInt(singular);	//문자열 singular 스트링 변수를 정수형 변수로 변환하여 triangle에 저장
		for(int i = 0 ; i <= triangle; i++) {	//반복문 시작 정수형 변수 i가 0부터 조건 triangle보다 작거나 같을 때 출력 후 i가 1증가
			for(int j = triangle ; j >= i ; j--) {//반복문 시작 정수형 변수 j가 triangle이고 조건 i보다 크거나 같을 때 출력 후 j가 1감소
				System.out.print("*");			//출력 구문
			}
			System.out.println();				//for문 안에 for문이 끝나면 줄바꿈
		}
	}

}
