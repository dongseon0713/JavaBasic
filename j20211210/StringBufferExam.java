package j20211210;

public class StringBufferExam {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer();
        sb.append("Hello World");
        System.out.println(sb.substring(0, 4));

        // String result = "";
        // result += "Hello";
        // result += " ";
        // result += "World!!!";
        // System.out.println(result);
        // 자료형에 +연산이 사용될 때마다 계속 새로운 객체가 추가되어 생성된다. ( 새로운 객체를 만들어 낸다. )
        // 한번 만들게 되면 수정이 불가능하다.
        // 그 값 자체를 변경할 수 없다. immutable 하라고 표현한다.

        // toUpperCase 와 같은 메서드의 경우도 문자열이 변경되는 것처럼 보일수는 있지만
        // 메서드 수행시 또 다른 객체를 생성하여 리턴하는 것이다.

        // 그렇다면 무조건 StringBuffer()를 사용하는 것이 좋은가!!!

        // 상황에 따라 다르다. StringBuffer()자체는 기본적으로 String보다 무겁다.
        // 기본적인 메모리 사용양도 클 뿐더러 속도도 느리다.

        // 결론 : 문자열 추가나 변경이 많을 경우에만 StringBuffer()를 사용하고
        // 변경/수정 작업이 거의 없는 경우에는 그냥 String을 사용한다.

        // // String Buffer - 문자열을 수정/변경할 때 사용
        // 객체가 한번만 생성된다.
        // 수정변경 가능한 문자열

        // StringBuffer sb = new StringBuffer();
        // sb.append("hello");
        // sb.append(" ");
        // sb.append("World!!!");

        // String result = sb.toString(); // 객체를 글자로 바꿔서 찍는다.
        // System.out.println(result);
    }
}
