package package01;

import java.util.Scanner;

public class Exam3_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);//키보드 입력을 콘솔을 통해 받을 수 있는 Scanner 객체 sc생성
		
		System.out.print("변수 A : ");	//입력 구문
		int A = sc.nextInt();			//입력한 문자열(스트링) 데이터를 정수로 변환하여 A에 저장 
		System.out.print("변수 B : ");	//입력 구문
		int B = sc.nextInt();			//입력한 문자열(스트링) 데이터를 정수로 변환하여 B에 저장
		
		if (A%B ==0) { //조건문 B를 A로 나누었을 때 0이 되면
			System.out.println("B는 A의 약수입니다."); //출력 구문
		}else {// 조건이 맞지 않으면
			System.out.println("B는 A의 약수가 아닙니다.");//출력구문
		}
	}

}
