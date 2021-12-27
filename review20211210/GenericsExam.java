package review20211210;

import java.util.ArrayList;

public class GenericsExam {
    public static void main(String[] args) {

        // Generics은 입력되는 자료형을 강제한다.

        ArrayList<String> alist = new ArrayList<String>();
        // ArrayList를 쓸 때에는 import를 정의해 주어야 한다.

        alist.add("Hello");
        // alist.add(2222); // Generics이 String으로 강제되었기 때문에 문자열만 올 수 있다. ( int형 변수 )
        alist.add("2222");

        // Generics를 선언하면 형 변환과 같은 불필요한 코딩과 잘못된 형변환 등의 오류를 사전에 방지할 수 있다.

    }
}
