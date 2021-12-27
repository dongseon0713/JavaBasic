package pack02;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
	//프로젝트명 : project01
	//패키지명 : pack02
	//자바파일명 : Test02
		
		Scanner sc = new Scanner(System.in);	//키보드 입력을 콘솔을 통해 받을 수 있는 Scanner 객체 sc생성
		
		String ox = "o";	//계속 진행 여부 변수
		int count = 0;		//총 시도 횟수 변수
		int firstNumber = 0;//앞 숫자가 큰 경우 변수
		int lastNumber = 0;	//뒷 숫자가 큰 경우 변수
		int a = 0;			//앞 숫자 입력 변수
		int b = 0;			//뒷 숫자 입력 변수
		
		while(ox.equals("o")) {	//반복 구문 시작
			System.out.println("숫자 크기 판별");	//"숫자 크기 판별"을 출력한다.
			System.out.println("------------");	//"-----------"을 출력한다.
			
			System.out.print("숫자 입력 >> ");		//입력 구문
			a = sc.nextInt();				//입력한 String(문자) 숫자 데이터를 정수로 변경하여 a변수에 저장
			System.out.print("숫자 입력 >> ");		//입력 구문
			b = sc.nextInt();				//입력한 String(문자) 숫자 데이터를 정수로 변경하여 b변수에 저장
			
			if(a > b) {							//조건문 시작
				System.out.println("판결은 앞 숫자가 크다.");	///a가 b보다 크면 "앞 숫자가 큽니다."를 출력한다.
				firstNumber += 1;				//firstNumber에 1증가
			}else {								//조건이 해당하지 않는 경우
				System.out.println("판결은 뒷 숫자가 크다");////a가 b보다 작으면 "뒷 숫자가 큽니다."를 출력한다
				lastNumber += 1;				//lastNumber에 1증가
			}
			count += 1;							//if 문이 끝나면 count 변수를 1증가시킨다.
			System.out.print("계속 하시겠습니까(계속 : o, 중단: x) : ");//입력 구문
			ox = sc.next();						//사용자가 입력한 문자열(스트링) 데이터를 변수 ox에 저장
			System.out.println();				//줄 바꿈
		}
			System.out.println("프로그램을 종료합니다.");	//while문이 끝나면 "프로그램을 종료합니다."를 출력한다. 
			System.out.println("시도 횟수 : " + count + ", 앞 숫자가 큰 횟수 : " + firstNumber + ", 뒷 숫자가 큰 횟수 : " + lastNumber);
			//시도 횟수에 count 변수를 불러와 출력하고 앞 숫자가 큰 횟수에 fistNumber변수를 불러와 출력하고 뒷 숫자가 큰 횟수에 lastNumber 변수를 불러와 출력한다.
	
}
}
