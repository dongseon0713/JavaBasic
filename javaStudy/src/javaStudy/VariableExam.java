package javaStudy;

public class VariableExam {
	//	global variable
	//	전역변수  	-	변수 선언 위치가 클래스 블록 안
	//			 	변수 사용 범위는 클래스 전체가 된다.
	int globalScope = 10;
	
	//	static 변수는 static 을 선언하지 않은 메서드 내에서는 사용을 해도 문제가 되지 않는다.
	//	객체를 찍지않고도 접근 할 수 있다.
	static int staticVal = 7;
	
	public void scopeTest (int value) {
		//	local variable
		//	지역 변수	-	메인 메서드 안에서 선언
		//				변수의 사용 범위는 그 메서드로 제한된다.
		int localScope = 20;
		
		System.out.println(globalScope);
		System.out.println(localScope);
		System.out.println(value);
	}
	public void scopeTest2(int value2) {
        System.out.println(globalScope);
//      System.out.println(localScope);
//      System.out.println(value);
        System.out.println(value2);
    }

	public static void main(String[] args) {
	
		//System.out.println(globalScope);
		//System.out.println(localScope);	//	컴파일 오류
		//System.out.println(value);		//	컴파일 오류
		
		System.out.println(staticVal);

	}

}
