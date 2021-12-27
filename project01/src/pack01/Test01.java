package pack01;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		//프로젝트명 : project01
		//패키지명 : pack01
		//자바파일명 : Test01
		
		Scanner sc = new Scanner(System.in);	//키보드 입력을 콘솔을 통해 받을 수 있는 Scanner 객체 sc생성
		
		System.out.println("-------------------------------");	//"-------------------------------"를 출력한다.
		System.out.println("건강 검진을 위해 회원의 정보를 입력해주세요");	//"건강 검진을 위해 회원의 정보를 입력해주세요"를 출력한다.
		System.out.println("-------------------------------");	//"-------------------------------"를 출력한다.
		System.out.println();									//줄 바꿈
		
		System.out.print("당신의 소속은 >>");						//입력 구문
		String bos = sc.next();									//사용자가 콘솔에서 String(문자열)로 입력한 값을 변수 bos에 저장
		System.out.println("당신의 소속은 " + bos + "이시군요!");		//메모리에 있는 변수들의 값을 cpu가 가지고 와서 결합 연산을 하여 출력한다.
		System.out.print("당신의 나이는 >>");						//입력 구문
		int age = sc.nextInt();									//사용자가 입력한 문자열(String) 데이터를 정수형으로 변환하여 변수 age에 저장
		System.out.println("당신의 작년나이는 " + (age-1) + "세였겠군요!");// 메모리에 있는 변수들의 값을 cpu가 가지고 와서 결합 연산을 하여 출력한다.
		System.out.print("현재 당신의 몸무게는 >>");					//입력 구문
		double weight = sc.nextDouble();						//사용자가 입력한 문자열(String) 데이터를 double형으로 변환하여 변수 weight에 저장
		if(weight >= 90) {										//조건문 시작 
			System.out.println("당신은 지금 과체중이시군요!");			//weight가 90보다 크거나 같으면 "당신은 지금 과체중이시군요!"를 출력한다.
		}else if (weight >= 70) {								//위 조건이 해당하지 않으면 조건시작 
			System.out.println("당신은 지금 보통이시군요!");			//weight가 70보다 크거나 같으면 "당신은 지금 보통이시군요!"를 출력한다.
		}else {													//조건이 다 해당하지 않으면
			System.out.println("당신은 지금 미달이시군요!");			//"당신은 지금 미달이시군요!"를 출력한다.
		}
		System.out.print("당신은 결혼하셨나요>>");					//입력 구문
		boolean marry = sc.nextBoolean();						//사용자가 입력한 문자열(String) 데이터를 boolean형으로 변환하여 변수 marry에 저장
		if(marry == true) {										//조건문 시작 
			System.out.println("당신은 배우가자 있겠군요!");			//사용자가 입력한 값이 true면 "당신은 배우가자 있겠군요!"를 출력한다.
		}else {													//사용자가 입력한 값이 true가 아니면
			System.out.println("당신은 배우자가 없겠군요!");			//"당신은 배우자가 없겠군요!"를 출력한다.
		}
		
		System.out.println("-------------------------------");	//"-------------------------------"를 출력한다.
		System.out.println("입력을 마무리합니다.");					//"입력을 마무리합니다."를 출력한다.
	}
}
