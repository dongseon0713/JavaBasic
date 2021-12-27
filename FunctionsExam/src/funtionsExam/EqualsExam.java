package funtionsExam;

public class EqualsExam {

	public static void main(String[] args) {
		// equals() : 문자열을 비교하여 그 결과를 boolean 값으로 알려준다.
		String a = "password";
		String b = "password";
		
		if(a.equals(b)) {
			System.out.println("비번이 일치합니다. 로그인 허용");
		}else {
			System.out.println("일치하지 않습니다.");
		}

	}

}
