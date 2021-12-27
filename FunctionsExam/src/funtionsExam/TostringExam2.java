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

public class TostringExam2 {

	public static void main(String[] args) {
		Card c1 = new Card();
		Card c2 = new Card("HEART", 10);
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());

	}

}
