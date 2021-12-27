package com.eightcruz.study;

public abstract class Bird {
	// 	- 추상메서드를 멤버로 가지는 클래스를 추상클래스라고 합니다.
	//	- 일반적인 메서드도 가질 수 있지만, 추상메서드가 하나라도 포함된 클래스를 의미합니다
	//	- 완전하지 않은 설계도로는 물건을 생산하지 못하듯이, 추상클래스로는 "인스턴스(객체)"를 생성할 수 없습니다 (중요)
	//	- 따라서,  추상클래스를 이용하려면 "상속을 받아서 사용"해야 하며, 상속받는 자식클래스에서는 반드시 
	//    추상클래스의 추상메서드를 완전하게 구현해야 합니다.(오버라이딩)
	public abstract void sing();
	
	public void fly() {
		System.out.println("fly!!");
	}

}
