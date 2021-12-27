package variableExam;

import java.util.Scanner;

public class OperatorExam {
	
	/*	연산자 Operator
	 * 
	 * 	연산자는 '연산을 수행하는 기호' + , - , * , / ...
	 * 
	 * 연산자
	 * 연산을 수행하는 기호
	 * 연산자는 피연산자로 연산을 수행하고 나서 항상 그 결과값을 반환한다.
	 * 
	 * 피연산자
	 * 작업 대상(연산 대상)
	 * (변수, 상수, 수식....)
	 * 
	 * 식
	 * 연산자와 피 연산자를 조합하여 계산을 표현한 것
	 * 그 식을 계산하여 결과를 얻는 것을 평가(evalution)이라고 한다.
	 * 
	 * 연산자의 종류
	 * 
	 * 산술 연산자
	 * + - * %(나머지 연산자:홀짝 배수) /
	 * 
	 * 비교 연산자
	 * < > <= >= ==(같다) !=(같지 않다)
	 * 
	 * 대입 연산자
	 * = ( 우변의 내용을 좌변으로 저장)
	 * 
	 * 논리 연산자
	 * || && | &
	 * 
	 * 기타 연산자
	 * 삼항연산자 (if없이 조건문)
	 * 
	 * 피연산자의 갯수에 따라
	 * 단항 연산자
	 * 증가 연산자 ++ : 피연산자의 값을 1증가 시킨다.
	 * 증감 연산자 -- : 피연산자의 값을 1감소 시킨다.
	 * 
	 * i++; 값이 먼저 참조되고 나서 증가 (후위형)
	 * ++i; 값이 먼저 증가되고 나서 참조 (전위형)
	 * 단항 연산자 하나만 단독으로 사용할 때는 차이가 없다.
	 * 
	 * 이항 연산자
	 * 삼항 연산자 (조건식) ? ture : false;
	 * 
	 * 연산자의 우선순위
	 * 일반 수학 계산 순서와 동일 상식적인 선에서 해결된다.
	 * 곱셈이 덧셈보다 먼저 수행
	 * 
	 * 나머지 연산자 %
	 * 나머지 연산자는 왼쪽의 피연산자를 오른쪽의 피연산자로 나누고 
	 * 난 그 나머지만 결과로 반환하는 연산자 이다.
	 * 나머지 연산자는 홀수, 짝수, 배수 검사에 아주 많이 사용된다.
	 * 
	 * 등가비교 연산자 == !=
	 * 두개의 피 연산자의 값이 같은지(==) 또는 다른지(!=) 비교하여 
	 * == 같으면 true 다르면 false
	 * != 다르면 true 같으면 false
	 * 
	 * 문자열 비교 .equals()
	 * 문자열을 비교할떄는 ==를 쓰지 말고 반드시 .equals()를 사용하자.
	 * 
	 * 
	 */

	public static void main(String[] args) {
		
		String str1 = "abc";
		String str2 = new String("abc");
		String str3 = "abc";
		
		System.out.printf("\"abc\"==\"abc\" ? %b%n", "abc"=="abc" );
		System.out.printf("str1==\"abc\" ? %b%n", str1=="abc" );
		System.out.printf("str2==\"abc\" ? %b%n", str2=="abc" );
		
		System.out.println();
		// 글자를 비교할 때에는 ==를 쓰지말고 .equals()를 쓰자
		System.out.printf("\"abc\".equals(\"abc\") ? %b%n", "abc".equals("abc"));
		System.out.printf("str1.equals(\"abc\") ? %b%n", str1.equals("abc"));
		System.out.printf("str2.equals(\"abc\") ? %b%n", str2.equals("abc"));
		
		System.out.println();		
		
		System.out.printf("str1==str3 ? %b%n", str1==str3 );
		System.out.printf("str2==str3 ? %b%n", str2==str3 );
		System.out.printf("str1.equals(str3) ? %b%n", str1.equals(str3));
		System.out.printf("str2.equals(str3) ? %b%n", str2.equals(str3) );
		
		System.out.println();
		
		System.out.println(System.identityHashCode(str1));	//	identityHashCode : 메모리 위치값
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		
		//		등가비교 연산자		
		//		System.out.println(1 == 0);
		//		System.out.println(1 != 0);
		
		//	quiz 1.정수를 하나 키보드로 입력 받아 그 수가 홀수인지 짝수인지를 출력하는 프로그램을 작성하시오
		//		Scanner sc = new Scanner(System.in);
		//		System.out.print("입력하신수 : ");
		//		int num = sc.nextInt();	
		//		
		//		if (num%2==0) {
		//			System.out.println("입력하신 수 " + num + "은 짝수 입니다.");
		//		}else {
		//			System.out.println("입력하신 수 " + num + "은 홀수 입니다.");
		//		}
		
		//	나머지 연산자
		//			int x = 10, y = 7;
		//			
		//			System.out.printf("x를 2로 나눈 나머지는 %d입니다.%n", x%2);
		//			System.out.printf("y를 2로 나눈 나머지는 %d입니다.%n", y%2);
		//			System.out.printf("x를 5로 나눈 나머지는 %d입니다.%n", x%5);
			
			
//			System.out.printf("%d을 %d로 나누면 %n",x,y);
//			System.out.printf("몫은 %d, 나머지는 %d입니다.%n",x/y,x%y);
		
		
		// 단항 연산자를 단독으로 사용할 때는 전위 후위 차이가 없다.
		//		int i = 5;
		//		i++;
		//		System.out.println(i);
		//		
		//		i = 5;
		//		++i;
		//		System.out.println(i);
		
		// 단독으로 사용 안할 때
		//		int i = 5 , j = 0;
		//		j = i++;
		//		
		//		System.out.println("j = i++ 실행후 , i = " + i + " j = " + j);
		//		
		//		i = 5;
		//		j = 0;
		//		j = ++i;
		
		//		System.out.println("j = i++ 실행후 , i = " + i + " j = " + j);
		
		// 변형
		//		int i = 5, j = 5;
		//		
		//		System.out.println(i++);
		//		System.out.println(++j);
		//		
		//		System.out.println("i = "+ i +"j = " + j);
		
		
	}
}
