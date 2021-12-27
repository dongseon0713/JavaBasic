package package01;

import java.util.Scanner;

public class Exam2_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); // 키보드 입력을 콘솔을 통해 받을 수 있는 Scanner 객체 sc생성
		System.out.print("성 : "); //입력 구문
		String lastn = sc.next();//사용자가 콘솔에서 String(문자열)으로 입력한 값을 변수 lastn에 저장
		System.out.print("이름 : ");//입력 구문
		String Firstn = sc.next();//사용자가 콘솔에서 String(문자열)으로 입력한 값을 변수 Firstn에 저장
		
		System.out.println("안녕하세요 " +lastn + Firstn +"씨.");//출력 구문
	}

}
