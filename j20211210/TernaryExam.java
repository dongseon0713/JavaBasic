package j20211210;

public class TernaryExam {
	public static void main(String[] args) {

		// int b1 = ( 5 > 4 ) ? 50 : 40;

		int b1 = 0;

		if (5 > 4) {
			b1 = 50;
		}

		System.out.println(b1);

		// Variable
		// 1) local variable; - 지역변수
		// 중괄호 안에서 선언한 변수는 중괄호 안에서 밖에 역할을 못한다.

		// 2) global variable; - 전역변수
		// 한 번 선언하면 코드 전체에 영향을 미침
	}
}
