package controlExam;

import java.util.Random;

import java.util.Scanner;

public class gameExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Quiz 가위(1) 바위(2) 보(3)
		 * 가위(1) 바위(2) 보(3) 중 하나를 입력하세요.>
		 * 당신은 1이고 컴퓨터는 2 입니다.
		 * 컴퓨터가 이겼습니다. 
		 * 
		 * 가위(1) 바위(2) 보(3) 중 하나를 입력하세요.>
		 * 당신은 1이고 컴퓨터는 3 입니다.
		 * 당신이 이겼습니다. 
		 * 
		 * 가위(1) 바위(2) 보(3) 중 하나를 입력하세요.>
		 * 당신은 1이고 컴퓨터는 1 입니다.
		 * 비겼습니다.
		 * 
		 
		Random rand = new Random();
		
		int computer = 1 + rand.nextInt(3) ;
		int human;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가위(1) 바위(2) 보(3) 중 하나를 입력하세요.>");
		human = sc.nextInt();
		
		System.out.println("당신은 "+ human +"이고 컴퓨터는" + computer +" 입니다.");
		
		switch(human - computer) {
		case 0 : System.out.println("비겼습니다."); break;
		case 1 : case -2 : System.out.println("사람이 이겼습니다."); break;
		case 2 : case -1 : System.out.println("컴퓨터가 이겼습니다."); break;
			//	경우의 수 따지기 뺏을 때 0이면 무승부 1이거나 -2면 사람승 2이거나 1이면 컴퓨터가 이긴다.
		}
		*/
		
		/*	주민등록 번호를 입력하세요  > 000000-0000000
		 * "당신은 남성입니다."
		 * "당신은 여성입니다."
		 * 
		 
		
	
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민등록번호를 입력하세요 > " );
		String id = sc.nextLine();
		
		char gender = id.charAt(7);
		
		
		switch(gender) {
		case '1' : case '3' : System.out.println("당신은 남성입니다."); break;
		case '2' : case '4' : System.out.println("당신은 여자입니다."); break;
		}	// 뒷자리 처음 시작이 1이거나 3이면 남자 2이거나 4이면 여자
		
		*/
		
		// # 특정 월을 입력 받아서 3,4,5 봄 6,7,8 여름 9,10,11 가을 12,1,2 겨울
				// "?월의 계절은 ?입니다."
//				Scanner sc = new Scanner(System.in);
//				
//				int month = 0;
//				String spring = "";
//				
//				month = sc.nextInt();
//				
//				switch(month) {
//				case 1: case 2 : case 12 : spring = "겨울";break;
//				case 3: case 4 : case 5: spring = "봄";break;
//				case 6: case 7 : case 8: spring = "여름";break;
//				case 9: case 10 : case 11: spring = "가울";break;    
//				}
//				System.out.println(month + "월의 계절은 " + spring + " 입니다.");
		
		/*
		 * Quiz2 점수를 입력 받아 
		 * 98이상이면 A+ 94이상이면 A 90이상이면 A-
		 * 88이상이면 B+ 84이상이면 B 80이상이면 B-
		 * 78이상이면 C+ 74이상이면 C 70이상이면 C-
		 * 68이상이면 D+ 64이상이면 D 60이상이면 D-
		 * 나머지 F
		 
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
		*/
		
		/*	Quiz 1부터 5까지를..
		 * 1
		 * 2
		 * 3
		 * 4
		 * 5
		 * 12345
		 

		for (int i= 1;i <= 5; i++) {
			System.out.println(i);
		}
		for (int i = 1; i <=5 ; i++) {
			System.out.print(i);
		}
		*/
		
		/* Quiz 1부터 10까지의 합을 출력하시오 단 누계 값까지 출력하세요
		 * 
	
		int sum = 0;
		for(int i = 1;i >= 10; i++) {
			System.out.printf("1부터 %d 까지의 합 : %d" ,i, sum += i );
		}
		*/
		
		/*	구구단 출력하기
		 *  2 * 1 = 2		2 * 2 = 4 .....
		 *  3 * 1 = 3		3 * 2 = 6 ....
		 * 
		 
		
		for(int i = 2; i <= 9 ; i++) {
			for (int j = 1 ; j <=9 ; j++) {
				System.out.printf("%d * %d = %d\t",i,j,i*j);
			}
			System.out.println();
			*/
		
		/* *을 출력할 라인의 수를 입력하세요 > 5
		 * *
		 * **
		 * ***
		 * ****
		 * *****
		 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("*을 출력할 라인의 수를 입력하세요 >");
		
		int num = sc.nextInt();
		for(int i = 1 ; i <= num ; i++) {
			for(int j = 1 ; j <= i ; j++) {
			System.out.print("*");
			}
			System.out.println();
		}
		*/
		
		//역삼각형
		Scanner sc = new Scanner(System.in);
		System.out.print("*을 출력할 라인의 수를 입력하세요 >");
		int num = sc.nextInt();
		for(int i = 1 ; i <= num ; i++) {
			for(int j = num ; j >= i ; j--) {
			System.out.print("*");
			}
			System.out.println();
	}

		/* Quiz 숫자를 입력하면 그 각각의 숫자들의 합을 계산하시고
		 * 
		
		
		int i = 0;
		int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 > ");
		i = sc.nextInt();
		
		while (i != 0) {
			sum += i%10;	//	10으로 나눈 나머지를 sum에 저장 ex) 1524/10 = 나머지가 4가 된다 그러므로 sum에 4저장
			i /= 10;		//	그 다음 4가 필요 없어짐으로 1524를 10으로 나누면 정수이기 때문에 4가 사라지게 된다.
		}
		System.out.println("각 자릿수의 합 : " + sum);
		*/
		
		/* Quiz 1 - 1 2 - 3 3 - 6 수가 누적되도록 10까지
		 * 
		 
		
		int num = 0;
		int i = 1;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("누적 합께를 원하는 숫자를 입력하세요 >  ");
		num = sc.nextInt();
		while (i<=num) {
			sum += i;
			System.out.println(i + " - " + sum);
			i++;
		}
		*/

}
}
