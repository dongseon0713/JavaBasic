package package01;

import java.util.Scanner;

public class Question01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//크기 판별
		/*
		 * 숫자를 입력하세요>>> 33
		 * 숫자를 입력하세요>>> 23
		 * 
		 * 앞 숫자가 큽니다.
		 * 
		 * 계속 할까요?(계속: o, 중단 : x)
		 * 
		 * 프로그램을 종료합니다.
		 * 
		 * 시도 횟수 : 		앞숫자가 큰경우 :		뒷숫자가 큰 경우:
		 */
		String ox = "o";//계속 진행 여부 변수
		int count = 0;	//전체 질문 횟수 변수
		int fno = 0;	//앞 숫자 큰 경우 변수
		int lno = 0;	//뒷 숫자 큰 경우 변수
		Scanner sc = new Scanner(System.in); //입력 객체 생성
		
		while(ox.equals("o")) {		//반복 구문 시작
			System.out.print("숫자를 입력하세요>>>");//입력 구문
			int a = sc.nextInt();//입력한 String(문자) 숫자 데이터를 정수로 변경하여 a변수에 저장
			System.out.print("숫자를 입력하세요>>>");//입력 구문
			int b = sc.nextInt();//입력한 String(문자) 숫자 데이터를 정수로 변경하여 b변수에 저장
			if(a>b) {
				System.out.println("앞 숫자가 큽니다.");//a가 b보다 크면 "앞 숫자가 큽니다."를 출력한다.
				fno +=1;	//fno 변수를 1증가 시킨다.
			}else {
				System.out.println("뒷 숫자가 큽니다.");//a가 b보다 작으면 "뒷 숫자가 큽니다."를 출력한다.
				lno +=1;	//lno 변수를 1증가 시킨다.
			}
			count += 1;	//if 문이 끝나면 count 변수를 1증가시킨다.
			System.out.print("계속 할까요 ? (계속 : o, 중단:x ) :");//입력 구문
			ox = sc.next();
			}	
		System.out.println("프로그램을 종료합니다.");	//while문을 빠져나오면 프로그램을 종료하는 문구를 출력한다.
		System.out.printf("시도 횟수 : %d\t앞숫자가 큰경우 :%d\t뒷숫자가 큰 경우:%d\t",count, fno, lno);
		
	}

}
