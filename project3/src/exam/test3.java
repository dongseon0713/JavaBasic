package exam;

import java.util.Random;
import java.util.Scanner;

//프로젝트 명 : project3
//패키지 : exam
//자바 파일명 : test3
public class test3 {
	static Scanner sc = new Scanner(System.in); //키보드 입력을 콘솔을 통해 받을 수 있는 Scanner 객체 sc생성
	static boolean Retry() {
	    int c;			// int형 변수 c 생성
	    do{				// 조건문 시작
	      System.out.print("다시 한 번 ? <Yes...1/No...0> :");	//입력 구문
	      c = sc.nextInt();						//사용자가 콘솔에서 String(문자열)로 입력한 값을 변수 c에 저장
	    }while(c != 0 && c != 1);			//조건문 조건 c가 0도 아니거나 1이 아닐때 반복
	    return c ==1;						//c를 반환
	  }

	public static void main(String[] args) {
		
		Random rand = new Random();
		 System.out.println("암산 훈련 !!");		//"암산 훈련 !!"을 출력

		  do{									//반복문 시작
		    int x = 100 + rand.nextInt(900);	//0~899까지 나오는 랜덤 함수에 100을 더한 후 int형 변수 x에 저장
		    int y = 100 + rand.nextInt(900);	//0~899까지 나오는 랜덤 함수에 100을 더한 후 int형 변수 y에 저장
		    int z = 100 + rand.nextInt(900);	//0~899까지 나오는 랜덤 함수에 100을 더한 후 int형 변수 z에 저장
		    int p = rand.nextInt(4);			//0~3까지 나오는 랜덤 함수를 int형 변수 p에 저장

		    int ans = 0;						//int형 변수 ans를 0으로 초기화
		    switch(p){							//스위치문 시작 p가 0에서 3까지
		      case 0 : ans = x + y + z; break;	//0일때 ans가 x+y+z값과 일치하면 빠져나옴
		      case 1 : ans = x + y - z; break;	//1일때 ans가 x+y-z값과 일치하면 빠져나옴
		      case 2 : ans = x - y + z; break;	//2일때 ans가 x-y+z값과 일치하면 빠져나옴
		      case 3 : ans = x - y - z; break;	//3일때 ans가 x-y-z값과 일치하면 빠져나옴
		    }
		  while(true){							//무한 반복
		  System.out.print(x + ((p<2) ? "+" : "-") + y +((p%2==0)?"+":"-") + z + "=");	
		  //입력 구문 조건 p가 2보다 작을때 + 아니면 - p를 2로 나누었을 때 나머지가 0이면 + 아니면 -
		  int myans = sc.nextInt();	//사용자가 콘솔에서 String(문자열)로 입력한 값을 변수 myans에 저장
		  if(myans == ans){		//조건문 시작
		    break;				//myans값과 ans값이 같으면 조건문 종료
		  }
		  System.out.println("틀렸습니다.");//myans값과 ans값이 같지 않으면 "틀렸습니다."출력
		  }
		  }while(Retry());		//Retry메서드에서 결과 값을 받아 반복문 종료

	}

}
