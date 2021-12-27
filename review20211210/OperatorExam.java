package review20211210;

//  산술 연산자 ( + - * / % )

//  산술 연산자 문제 ( 산술 연산자를 이용해 변수 a, b의 합, 차, 곱을 c, d, e 변수에 각각 저장하세요. 그리고 변수 f에는 a를 b로 나눈 나머지를 저장하세요. )
public class OperatorExam {
    public void calculate() {
        int a = 7;
        int b = 3;

        // c는 a와 b의 합
        int c = a + b;
        // d는 a와 b의 차
        int d = a - b;
        // e는 a와 b의 곱
        int e = a * b;
        // f는 a를 b로 나눈 나머지
        int f = a % b;

        System.out.println("a와 b의 합 : " + c);
        System.out.println("a와 b의 차 : " + d);
        System.out.println("a와 b의 곱 : " + e);
        System.out.println("a를 b로 나눈 나머지 : " + f);
    }

    public static void main(String[] args) {
        new OperatorExam().calculate();
    }
}
