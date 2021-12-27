package javaStudy;

public class EnumExam {
	//	static 객체 생성 없이도 접근하여 사용 허용
	//	final 상수로 선언
	//	String 문자열로
	//	상수형태로 선언 할 경우 대문자로 사용한다.
	public static final String MALE="MALE";
	
	public static final String FEMALE="FEMALE";
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String gender1;
		
		gender1 = EnumExam.MALE;
		gender1 = EnumExam.FEMALE;
		
		gender1 = "Boy";
		
		Gender gender2;
		
		gender2 = Gender.MALE;
		gender2 = Gender.FEMALE;
		
//		gender2 = "girl";
//		gender2 = 1;
		//	gender2에는 MALE과 FEMALE 만 선언 할 수 있도록 제한한다.
		

	}

}

		//열거형
enum Gender{
	MALE, FEMALE;
}
