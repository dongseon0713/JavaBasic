package package01;

import java.util.Scanner;

public class Exam3_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);	//키보드 입력을 콘솔을 통해 받을 수 있는 Scanner 객체 sc생성
		
		System.out.print("변수 a : ");//입력 구문
		int a = sc.nextInt();//문자열(스트링) 데이터를 정수로 변환하여 a에 저장
		System.out.print("변수 b : ");//입력 구문
		int b = sc.nextInt();//문자열(스트링) 데이터를 정수로 변환하여 b에 저장
		
		if(a>b) {//조건식 a가 b보다 클때
			System.out.println("a가 크다.");//출력 구문
		}else if(a<b) {//다른 조건식 a가 b보다 작을때
			System.out.println("b가 크다.");//출력 구문
		}else {//둘 다 해당하지 않을때
			System.out.println("a와 b가 같다.");//출력 구문
		}
	}

}
