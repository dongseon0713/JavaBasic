package inter;

public class Zookeeper {
//	interface를 구현 하기 위한 주석처리	
//	public void feed(Tiger tiger) {
//		//	Tiger 자료형만 올 수 있다.
//		System.out.println("feed apple");
//	}
//	
//	public void feed(Lion lion) {
//		//	Lion 자료형만 올 수 있다.
//		System.out.println("feed banana");
//	}	
//	
//	public void feed(Donkey donkey) {
//		System.out.println("feed carrot");
//	}
	
	public void feed(Predator predator) {
		System.out.println("feed " + predator.getFood());
	}
	//	객체가 한 개 이상의 자료형 타입을 갖게 되는 특성을 다형성 ( polymorphism )이라고 한다.
	//	각각을 선언했지만 interface를 구현함으로써 간단하게 정리 할 수 있다.
	
	public static void main(String[] args) {
		//	객체 생성
		Zookeeper zooKeeper = new Zookeeper();
		Tiger tiger = new Tiger();
		Lion lion = new Lion();
		Donkey donkey = new Donkey();
		
		zooKeeper.feed(tiger);
		zooKeeper.feed(lion);
		zooKeeper.feed(donkey);
	}
}
