package package01;

import java.util.Random;

public class Exam2_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random(); // 랜덤한 값을 생성할 수 있는 객체 rand를 생성
		
		int n1 = 1 + rand.nextInt(9);	//0~9까지 랜덤한 값을 생성하는 객체 rand에 1을 더한 후 변수 n1에 저장
		int n2 = -1 - rand.nextInt(9);	//0~9까지 랜덤한 값을 생성하는 객체 rand에 1을 뺀 후 변수 n2에 저장
		int n3 = 10 + rand.nextInt(90);	//0~90까지 랜덤한 값을 생성하는 객체 rand에 10을 더한 후 변수 n3에 저장
		System.out.println("3개의 난수를 생성했습니다."); //출력구문
		
		System.out.println("한 자리의 양의 정수 : " + n1); //n1을 출력
		System.out.println("한 자리의 음의 정수 : " + n2); //n2를 출력
		System.out.println("두 자리의 양의 정수 : " + n3); //n3를 출력
	}

}
