package review20211210;

//  String 문자열( 문자 )

//  String a = "Hellow World";
//  String b = "a";
//  원래 FM 정석으로는
//  String a = new String("Hello World") 가 맞지만
//  자바에서는 그냥 String a = "Hello World" 라고 사용해도 된다.

// // 문자열 같은지 비교
// String pass1 = "hello"; // 회원가입시 설정한 암호

// String pass2 = "hello"; // 로그인 시 입력한 암호 1
// String pass3 = "java"; // 로그인 시 입력한 암호 2

// System.out.println(pass1.equals(pass2)); //pass1과 pass2가 같은지 비교 같으면 true 틀리면 false
// System.out.println(pass1.equals(pass3)); //pass1과 pass3이 같은지 비교 같으면 true 틀리면 false

// 문자열 자르기 substring

//  String a="Hello World";System.out.println(a.substring(0,4)); // 문자열 0에서 4번째 까지 자르기

//  equals 메서드를 이용하여 문자열 같은지 비교
public class StringExam {
    public static void main(String[] args) {
        String str1 = new String("Hello world");
        String str2 = new String("Hello world");
        if (str1.equals(str2)) {
            System.out.println("str1과 str2는 같은 값을 가집니다.");
        } else {
            System.out.println("str1과 str2는 다른 값을 가집니다.");
        }
    }
}
