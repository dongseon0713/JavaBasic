package controlExam;

import java.util.Scanner;

public class switchExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*switch 구문
		 * if 문의 경우 항목이 많아질수록 복잡해지고 코드 가독성이 많이 떨어지게 된다.
		 * 평균적인 처리 시간도 항목이 늘어날 수록 길어지게 된다.
		 * 이러한 if문과 달리 switch 보다 간결하고 알아보기 쉽다.
		 * 보통 처리해야하는 경우의 수가 아주 많을 경우 Switch를 쓴다
		 * switch문으로 만든 모든 구문은 if문으로 구현 할 수 있지만 if문으로 만든 모든 구문을
		 * switch문으로 구현 할 수는 없다.
		 * 
		 * 1. 조건식을 계산
		 * 2. 조건식을 만족하는 case문으로 이동한다.
		 * 3. 해당 case문의 구문들을 실행한다.
		 * 4. break 만나기 전까지는 모든 구문을 전부 실행한다.
		 * *. switch 구문의 조건식의 결과는 정수 또는 문자열이다.
		 * 
		 */
		
		// # 특정 월을 입력 받아서 3,4,5 봄 6,7,8 여름 9,10,11 가을 12,1,2 겨울
		// "?월의 계절은 ?입니다."
//		Scanner sc = new Scanner(System.in);
//		
//		int month = 0;
//		String spring = "";
//		
//		month = sc.nextInt();
//		
//		switch(month) {
//		case 1: case 2 : case 12 : spring = "겨울";break;
//		case 3: case 4 : case 5: spring = "봄";break;
//		case 6: case 7 : case 8: spring = "여름";break;
//		case 9: case 10 : case 11: spring = "가울";break;    
//		}
//		System.out.println(month + "월의 계절은 " + spring + " 입니다.");

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
		 */
		
		int computer ;
		int human = 0;
		
		computer = (int)(Math.random()*3+1);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가위(1) 바위(2) 보(3) 중 하나를 입력하세요.>");
		human = sc.nextInt();
		
		switch (computer){
			case 1 : 
				switch(human) {
				case 1: 
					System.out.println("당신은 "+ human + "이고 컴퓨터는 "+ computer +"입니다.");
					System.out.println("비겼습니다.");
					break;
				case 2: 
					System.out.println("당신은 "+ human + "이고 컴퓨터는 "+ computer +"입니다.");
					System.out.println("당신이 이겼습니다.");
					break;
				case 3 :
					System.out.println("당신은 "+ human + "이고 컴퓨터는 "+ computer +"입니다.");
					System.out.println("컴퓨터가 이겼습니다.");
					break;
				}
				break;
			case 2 : 
				switch(human) {
				case 1: 
					System.out.println("당신은 "+ human + "이고 컴퓨터는 "+ computer +"입니다.");
					System.out.println("컴퓨터가 이겼습니다.");
					break;
				case 2: 
					System.out.println("당신은 "+ human + "이고 컴퓨터는 "+ computer +"입니다.");
					System.out.println("비겼습니다.");
					break;
				case 3 :
					System.out.println("당신은 "+ human + "이고 컴퓨터는 "+ computer +"입니다.");
					System.out.println("당신 이겼습니다.");
					break;
				}
				break;
			case 3 : 
				switch(human) {
				case 1: 
					System.out.println("당신은 "+ human + "이고 컴퓨터는 "+ computer +"입니다.");
					System.out.println("컴퓨터가 이겼습니다.");
					break;
				case 2: 
					System.out.println("당신은 "+ human + "이고 컴퓨터는 "+ computer +"입니다.");
					System.out.println("당신 이겼습니다.");
					break;
				case 3 :
					System.out.println("당신은 "+ human + "이고 컴퓨터는 "+ computer +"입니다.");
					System.out.println("비겼습니다.");
					break;
				}
				break;
						
			
		}
		
	}

}
