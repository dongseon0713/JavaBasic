package com.eightcruz.study;

public class Truck extends Car {
	public Truck () {	//	기본 생성자가 없기 때문에 컴파일 오류
		super("트럭");	// 부모 생성자 호출
		System.out.println("Truck의 기본 생성자 입니다.");
	}

}
