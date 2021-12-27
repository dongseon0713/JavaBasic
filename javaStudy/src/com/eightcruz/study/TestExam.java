package com.eightcruz.study;

import javaStudy.AccessObj;

public class TestExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessObj obj = new AccessObj();
		
		System.out.println(obj.p);	//	모든 접근 허용 가능
		
//		System.out.println(obj.p2);	//	package가 다르기 때문에 컴파일 오류
		
//		System.out.println(obj.k);	//	package가 다르기 때문에 컴파일 오류
		
//		System.out.println(obj.i); //	private가 있기 때문에 AccessObj 자기 자신밖에 사용할 수 없다.
		
	}

}
