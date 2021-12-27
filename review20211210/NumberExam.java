package review20211210;

// 숫자 자료형

// 숫자 자료형은 실수와 정수로 나눈다.

// 실수는 1,3,5 와 같은 형태의 숫자이고

// 정수는 3.14, 3.141592 와 같은 형태의 숫자이다.

/*
 * 실수
 * 
 * int(***) : 실수 변수는 int를 주로 많이 사용한다.
 * 
 * long( 1234564654L ) : long을 사용할 때에는 숫자 뒤에 L을 붙혀준다.
 * 
 */
/*
 * 정수
 * 
 * float( 3.14F ) : float를 사용할 때에는 숫자 뒤에 F를 붙혀준다.
 * 
 * double(***) : 정수 변수는 double을 주로 많이 사용한다.
 * 
 */

// 원의 둘레 구하는 문제 ( double 을 활용 )
public class NumberExam {
    public static void main(String[] args) {
        double PI = 3.141592;
        int radius = 5;
        double result = radius * 2 * PI;
        System.out.println(result);
    }
}
