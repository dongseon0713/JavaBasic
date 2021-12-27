package controlExam;

import java.util.Scanner;

public class ifExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*	제어문 Control Statement - IF, Switch
		 * 	코드의 제일 위에서부터 아래로 한 문장씩 순차적으로 진행되는
		 * 	프로그램의 흐름을 조절하여 일부분은 건너 뛰기도 하고
		 * 	다시 위에서부터 내려올수 있게 제어한다.
		 * 
		 * 	if (score > 60) {
		 * 	System.out.println("합격입니다.");
		 * }
		 * 
		 * 
		 */
//		int score = 80;
//		
//		if (score > 60) {	// 80 > 60 -> true
//			System.out.println("합격입니다.");
//		}
//	}

	/*(90 <= x && x <= 100) 정수 x가 90점 이상 100점 이하 동시만족
	 * (x < 0 || x > 100) 정수 x가 0 미만 또는 x가 100 초과 하나만 만족
	 * (x % 3 == 0 && x % 2 != 0) x가 3의 배수이기는 하지만 2의 배수는 아닌
	 * depar == "영업부" || depar == "기획부" 영업부와 기획부만 조건
	 * 
	 */
		
//		if(true) {
//			System.out.println("welcome");	// {}처리를 하지 않으면 1줄만 출력 되기 때문에 {}처리를 해준다
//		}
//		
		/*if - else 구문
		 * else는 그 밖의 나머지 모든것...
		 * 
		 * if (조건식) {
		 * 		true...
		 * } else {
		 * 		false...
		 * }
		 * 
		 * if - else if 구문
		 * if else 는 분기가 2개로 수행되는 구조 인 반면 처리해야할 경우의 수가 3개 이상이면
		 * else if 구문을 사용한다
		 * 조건식을 만족하면 더 이상은 다른 조건식을 확인하지 않는다.
		 * 
		 * if (조건식1) {
		 * 		true....
		 * } else if (조건식2) {
		 * 		true....
		 * } else {
		 * 		else....
		 * }
		 * 
		 * 
		 */
		
		/*
		 * Quiz2 점수를 입력 받아 
		 * 98이상이면 A+ 94이상이면 A 90이상이면 A-
		 * 88이상이면 B+ 84이상이면 B 80이상이면 B-
		 * 78이상이면 C+ 74이상이면 C 70이상이면 C-
		 * 68이상이면 D+ 64이상이면 D 60이상이면 D-
		 * 나머지 F
		 */
		Scanner sc = new Scanner(System.in);
		
		int score = 0;
		
		System.out.print("점수를 입력하세요 > ");
		
		score = sc.nextInt();
		
		if(score >= 90) {
			System.out.println(score>=98?"A+":score>=94 ? "A":"A-");
		}else if (score >=80) {
			System.out.println(score>=88?"B+":score>=84 ? "B":"B-");
		}else if (score >=70) {
			System.out.println(score>=78?"C+":score>=74 ? "C":"C-");
		}else if (score >=60) {
			System.out.println(score>=68?"D+":score>=64 ? "D":"D-");
		}else {
			System.out.println("F");
		}
		
		
		
		
//if(score >= 90) {
//	if(score >= 98) {
//		grade = "A+";
//	}
//	else if(score >= 94) {
//		grade = "A";
//	}else {
//		grade = "A-";
//	}
//}
//else if(score >= 80 && score < 90) {
//	if(score >= 88) {
//		grade = "B+";
//	}
//	else if(score >= 84) {
//		grade = "B";
//	}else {
//		grade = "B-";
//	}
//}
//else if(score >= 70 && score < 80) {
//	if(score >= 78) {
//		grade = "C+";
//	}
//	else if(score >= 74) {
//		grade = "C";
//	}else {
//		grade = "C-";
//	}
//}
//else if(score >= 60 && score < 70) {
//	if(score >= 68) {
//		grade = "D+";
//	}
//	else if(score >= 64) {
//		grade = "D";
//	}else {
//		grade = "D-";
//	}
//}
//else {
//	grade = "F";
//}
//System.out.println(grade);
		
}
}