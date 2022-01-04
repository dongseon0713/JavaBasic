package exam;

import java.util.Scanner;

//프로젝트 명 : project2
//패키지 : exam
//자바 파일명 : test
public class test2 {
	
	 static int[] arrayidx(int[] a,int idx){
		    int count = 0;	// int형 count변수를 0으로 초기화

		    for(int i = 0 ; i < a.length  ; i++){	// 반복문 시작
		        if(a[i] == idx){	//a[i]값이 idx와 같지 않으면
		          count++;			//count값 1증가
		        }
		    }
		    int c[] = new int[count--];	//int형 배열 c에 길이가 count--인 객체 생성
		    for(int i = a.length-1 ; count >=0 ; i--){	//반복문 시작
		      if(a[i] == idx){	//a[i]가 idx와 같으면
		        c[count--] = i;	//c에 count-- 번째에 i값 대입
		          }
		        }
		    return c;		//c를 반환
		  }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //키보드 입력을 콘솔을 통해 받을 수 있는 Scanner 객체 sc생성
		System.out.print("요소 수 : ");		//입력 구문
	    int n = sc.nextInt();				//사용자가 콘솔에서 String(문자열)로 입력한 값을 변수 n에 저장
	    int[] a = new int[n];				//길이가 n인 int형 배열 a를 생성
	    for(int i = 0 ; i < n ; i++ ){		//반복문 시작
	      System.out.print("x[" + i + "] : ");//입력 구문
	      a[i] = sc.nextInt();				//사용자가 콘솔에서 String(문자열)로 입력한 값을 변수 a[i]에 저장

	    }
	    System.out.print("탐색할 값 : ");		//입력구문
	    int idx = sc.nextInt();				//사용자가 콘솔에서 String(문자열)로 입력한 값을 변수 idx에 저장
	    
	   int[] arry = arrayidx(a,idx);		//arrayidx에 a값과 idx값을 호출하고 반환된 값을 int형 변수 arry에 저장
	  if(arry.length == 0){					//반복문 시작
	    System.out.println("일치하는 요소가 없습니다.");	//출력 구문
	  }else{								//위 조건이 만족하지않으면	
	    System.out.println("일치하는 요소의 인덱스");	//출력 구문	
	    for(int i = 0; i < arry.length;i++){	//반복문 시작
	      System.out.println(arry[i]);		//출력 구문
	    }
	  }
	}

}
