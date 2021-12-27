package javaStudy;

public class Car {
	
	public void run() {
		System.out.println("RUN!!!");
	}
	
	public static void main(String[] args) {
		Car car = new Car();
		
		car.run();
//		bus.ppangppang();
		//	부모 클래스로 만든 인스턴스(instance) car는 부모 즉 자신의 자원은 쓸 수 있지만
		//	자식 즉 bus의 메서드는 사용할 수 없다.
	}
	
//	String name;
//	int number;
//	
//	public Car(String n) {
//		name = n;
//	}
	

	
	//	생성자 규칙
	//	생성자는 클래스명과 동일해야 하며 리턴 타입과 리턴이 없다.
	//	생성자를 한개라도 만들지 않으면 자바가 자동으로 기본 생성자를 
	//	생성 하지만 하나라도 만들기만 하면 기본생성자는 만들지 않는다.
}
