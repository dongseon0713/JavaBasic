package edu.gt.cs;

import java.util.Random;
import java.util.Scanner;

public class Test {
	// edu.gt.cs.Test
	//패키지는 여러개가 있을 수 있고 하나의 패키지 내에는 자바 클래스 파일을 여러개 가질수 있다.
	//edu라는 패키지 아래에 gt패키지 아래에 cs패키지 안에 Test라는 클래스가 위치하고 있다.
	
	//자바에서의 데이터 종류를 설명...
	//논리형 boolean 은 true와 false 값을 가진다.
	//정수형 integer 에는 int long short byte 이 있다.
	//실수형 에는 float double 이 있다.
	//문자 에는 String char가 있다.
	// char : 변수 하나에 한글자만 저장
	
	public static void main(String[] args) {
//		for (int i = 0; i <= 3 ;i++) {
//			System.out.println(i);
//		}
		
		//i가 0일때 조건 3보다 작거나 같음을 만족함으로 i값 0을 출력 후 i값 1증가
		//i가 1일 때 조건 3보다 작거나 같음을 만족함으로 i가 1을 출력 후 i값 1증가
		//i가 2일 때 조건 3보다 작거나 같음을 만족함으로 i가 2을 출력후 i값 1증가
		//i가 3일 때 조건 3보다 작거나 같음을 만족함으로 i가 3을 출력후 i값 1증가
		//i가 4일 때 조건 3보다 작거나 같음을 만족하지 못함으로 for 문을 종료한다.
		
		/*
		 * 0
		 * 1
		 * 2
		 * 3
		 */
		
//		int[] n1 = new int[5];
//		//ni(변수:주소)에 {0,0,0,0,0}(값이 없을때에는 0으로 출력) length(5)
//		
//		int [][] n2 = new int[2][2];
//		//n2(변수:주소)에 {{0,0}, {0,0}}  length(2)-> 덩어리를 하나의 길이로 봄 
//		
//		int[] n3 = {1,2,3};
//		//n3(변수:주소)에 {1,2,3} length(3)
		
//		int x = 100;
//		int y = 200;
//		int z = x+y;
//		//피연산자 x와 y에 연산자 +를 조합하여 계산을 한 후에 z에 대입
//		//메모리(ram)에 있는 변수들의 값을 cpu가 가지고와서 산술 연산을 하여 다시 메모리에 저장한다.
		
//		int age = 23;
//		String name = "kim";
//		String x = name+ "의 나이는 " + age;
//		//메모리(ram)에 있는 변수들의 값을 cpu가 가지고와서 결합 연산을 하여 다시 메모리에 저장한다.
		
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("이름을 입력하세요>>");
//		String name = sc.next();
//		System.out.println("나이를 입력하ㅔ요>>");
//		int age = sc.nextInt();
		//Scanner sc라는 객체를 생성
		//화면에 사용자로 하여금 입력하도록 프롬프트를 출력한다.
		//사용자가 콘솔에서 String(문자열)으로 입력한 값을 변수 name에 저장
		//화면에 사용자로 하여금 입력하도록 프롬프트를 출력한다.
		//입력한 String(문자) 나이 데이터를 정수로 변경하여 age변수에 저장
		
//		String h = "안녕하세요";	//참고 : 한글은 1글자가 2byte이다.
//10byte(String) + 10byte(char) = 20byte 총 메모리 크기의 합
		
//		int n = Integer.parseInt("100"); //문자열 100은 스트링 변수를 정수형 변수로 변환하여 n에 저장
//		Scanner sc = new Scanner(System.in); // 키보드로 입력받는 sc Scanner 객체 생성
//		Random r = new Random(10);//1부터 9까지 랜덤으로 생성되는 랜덤함수를 r에 저장
		
		//100이라는 문자열(스트링)을 계산이 가능한 int 정수형으로 변환하여 변수명 n에 저장
		//키보드 입력을 콘솔을 통해 받을 수 있는 Scanner 객체 sc를 생성
		//시드 값 10으로 랜덤한 값을 생성할 수 있는 객체 r을 생성
		/*
		----------------
		당신의 정보를 입력하세요
		----------------
		
		당신의 부서는 >>>
		당신의 소속은 ___입니다.
		당신의 나이는 >>> 50
		당신의 작년 나이는 49 이였습니다.
		당신의 키는 >>>
		당신의 키가 (크다/보통이다/작다) // 키가 180이상이면 크다 170이상이면 보통이다. 나머지는 작다
		
		
		
		프로젝트명 : p1
		패키지명 : package2
		자바파일명 : test1
		
		Scanner sc = new Scanner(System.in);
		System.out.println("--------------");
		System.out.println("당신의 정보를 입력하세요.");
		System.out.println("--------------");
		System.out.println();
		
		System.out.print("당신의 부서는 >>>");
		String bos = sc.next();
		System.out.println("당신의 소속은 " + bos +"입니다.");
		System.out.print("당신의 나이는 >>>");
		int age = sc.nextInt();
		System.out.println("당신의 작년나이는 "+ (age-1) + "이였습니다.");
		System.out.print("당신의 키는 >>>");
		int h = sc.nextInt();
		System.out.println((h>=180)?"당신은 키가 크다." : (h>=170)?"당신은 키가 보통이다." : "당신은 키가 작다.");
		
		*/
		
		
	}
}
