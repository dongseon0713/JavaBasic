package funtionsExam;

class Card{
	String kind;
	int number;
	
	Card(){
		this("SPADE", 1);
	}
	// 생성자 오버로딩
	Card(String kind, int number){
		this.kind = kind;
		this.number = number;
	}
	public String toString() {
		return "Kind : " + kind + ", Number : " + number;
	}
}

public class TostringExam {

	public static void main(String[] args) {
		// string() 객체에 대한 정보(객체 변수에 저장된 값들)를 문자열로 변환하는 메서드
		Card c1 = new Card();
		Card c2 = new Card();
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		

		
		// Card 객체 2개 생성 후 각 객체에 toString을 호출하였다. 
		// 그 결과로 해시코드가 출력됐다. 
		// 클래스의 이름은 같아도 객체는 다르가는 것을 확인할 수 있다.
		// funtionsExam.Card@4926097b (c1)
		// funtionsExam.Card@39ed3c8d (c2)
		
		String str = new String("KOREA");
		java.util.Date today = new java.util.Date();
		
		System.out.println(str);
		System.out.println(str.toString());
		
		System.out.println(today);
		System.out.println(today.toString());
		
		//String 클래스와 Date 클래스의 toString()을 호출 했더니
		//클래스 이름과 해시코드 대신에 다른 결과가 출력되었다.
		//String 클래스의 toStrinf()은 String 객체 가진 문자열을 반환하도록
		//오버라이딩(Overriding) 되어있다. 
		//Date 클래스 경우 date 객체가 가지고 있는 날짜와 시간을 문자열로 변환하여 반환하도록
		//오버라이딩(OVerriding) 되어있다.
		
		//이처럼 toString()은 일반적으로 객체나 클래스에 대한 정보 또는 객체 변수들의 값을
		//문자열로 변환하여 반환하도록 오버라이딩 되는 것이 보통이다.

	}

}
