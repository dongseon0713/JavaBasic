package variableExam;

import java.util.Scanner;

public class TriExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 삼항 연산자 (조건)
		 * 첫 번째 피연산자 조건식의 평가 결과에 따라 true 면 두번째 항 false 면 세번째 항의 값이 결과 된다.   
		 * 조건식의 괄호는 필수는 아니다.
		 * 
		 * 여러번 중첩하면 가독성이 떨어지므로 꼭 필요한 경우에만 사용한다
		 * 
		 * (조건식) ? true : false
		 * 
		 * if(조건식){
		 * 	true;
		 * } else {
		 * 	false;
		 * }
		 * 
		 * (조건식) ? "A" : (조건식) ? "B" : (조건식) ? "C" : "D"
		 * 
		 * if (조건식1) {
		 * 		"A";
		 * } else if (조건식2) {
		 * 		"B";
		 * } else if (조건식3) {
		 * 		"C";
		 * } else {
		 * 		"D";
		 * }
		 */
		
		//	Quiz 1 삼항 연산자를 사용하여 
		
		//	100점 미만 90점 이상이면 "A"
		//	90점 미만 80점 이상이면 "B"
		//	80점 미만 70점 이상이면 "C"
		//	나머지 전부 "D"
		
		
//		int grade = 79;
//		
//		System.out.println((grade >=90) ? "A" : (grade >=80) ? "B" : (grade >=70) ? "C" : "D");
		
		int x, y, z;
		int absX, absY, absZ;
		char signX, signY, signZ;
		
		x = 10;
		y = -5;
		z = 0;
		
		absX = x >= 0 ? x : -x;	//	x 값이 양수이면 x를 출력하고 아니면 -를 붙혀서 출력
		absY = y >= 0 ? y : -y;	//	y 값이 양수이면 y를 출력하고 아니면 -를 붙혀서 출력
		absZ = z >= 0 ? z : -z;	//	z 값이 양수이면 z를 출력하고 아니면 -를 붙혀서 출력
		
		signX = x > 0 ? '+' : x == 0 ? ' ' : '-';	//	x값이 양수면 '+' 0이면 없음 음수면 '-'
		signY = y > 0 ? '+' : y == 0 ? ' ' : '-';	//	y값이 양수면 '+' 0이면 없음 음수면 '-'
		signZ = z > 0 ? '+' : z == 0 ? ' ' : '-';	//	z값이 양수면 '+' 0이면 없음 음수면 '-'
		
		System.out.printf("x = %c%d%n", signX, absX);
		System.out.printf("y = %c%d%n", signY, absY);
		System.out.printf("z = %c%d%n", signZ, absZ);
		
	}

}
