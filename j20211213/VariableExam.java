package j20211213;

public class VariableExam {

    /*
     * 변수의 영향 범위
     * 
     * 전역 변수와 지역 변수
     * 
     */

    int a; // 전역변수 - 메서드 밖에서 선언되는 변수 ( 모든 코드에 영향을 미친다. ) < 전역 변수의 사용은 지양하자 >

    public void varTest(VariableExam testvar) { // 메서드 안에서 선언된 변수는 메서드 안에서만 사용된다 ( 지역 변수 )
        testvar.a++;
        // 메서드 안에서 a값을 밖으로 빼낼때 return을 사용한다.
    }

    public static void main(String[] args) {

        // int a = 1;

        VariableExam testvar = new VariableExam();
        testvar.a = 1;

        testvar.varTest(testvar);

        System.out.println(testvar.a);

    }
}
