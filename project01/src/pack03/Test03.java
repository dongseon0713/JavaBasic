package pack03;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		//프로젝트명 : project01
		//패키지명 : pack03
		//자바파일명 : Test03
		
		Scanner sc = new Scanner(System.in);	//키보드 입력을 콘솔을 통해 받을 수 있는 Scanner 객체 sc생성
		
		int i = 0;								//변수 i를 0으로 초기화
		int count = 0;							//변수 count를 0으로 초기화
		
		System.out.print("별을 10개 찍어보세요.");	//입력 구문
		String star = sc.next();				//사용자가 콘솔에서 String(문자열)로 입력한 값을 변수 star에 저장
		System.out.print("원하는 기호를 넣으세요 >> ");//입력 구문
		String symbol = sc.next();				//사용자가 콘솔에서 String(문자열)로 입력한 값을 변수 symbol에 저장
		System.out.print("원하는 횟수를 넣으세요 >> ");//입력 구문
		int number = sc.nextInt();				//사용자가 콘솔에서 Sting(문자열)로 입력한 값을 정수로 변환하여 number에 저장
		while (i < number) {					//반복문 시작 i가 number보다 작으면 while문 반복 i가 number보다 크면 while문 종료
			System.out.print(symbol);			//변수 i가 number보다 작으면 symbol변수 출력
			i++;								//출력 후 i 1증가
		}
		System.out.println(" ("+number + "번" + symbol+ "를 반복)");//while문 종료 후에 메모리에 있는 변수들의 값을 cpu가 가지고 와서 결합 연산을 하여 출력한다.
		
		while(i != 3) {							//반복문 시작 i가 3이 아니면 반복 실행 i가 3이면 반복문 종료
			System.out.print("1) 증가, 2)감소, 3)종료를 선택해주세요.>> ");	//입력구문
			i = sc.nextInt();					//사용자가 콘솔에서 String(문자열)로 입력한 값을 정수로 변환하여 i변수에 저장
			if(i == 1) {						//조건문 시작 i가 1과 같으면
				count++;						//count 변수를 1증가
				System.out.println("카운트 : " + count);	//count변수를 1증가 시킨 후에 출력 구문
			}else if(i == 2) {					//조건이 해당하지 않을 때 다음 조건문 실행 i가 2와 같으면
				count--;						//count 변수를 1감소
				System.out.println("카운트 : " + count);	//count변수를 1감소 시킨 후에 출력 구문 
			}
			
		}
		System.out.println("시스템을 종료합니다. 현재까지의 카운트는 " + count);	//while 문이 종료되면 메모리에 있는 변수들의 값을 cpu가 가지고 와서 결합 연산을 하여 출력한다.
	}

}
