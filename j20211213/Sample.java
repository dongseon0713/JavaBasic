package j20211213;

public class Sample {
    public static void main(String[] args) {

        System.out.println(CalExam.add(3));
        // CalExam클래스에 add를 호출하고 3을 대입
        System.out.println(CalExam.add(4));
        // CalExam클래스에 add를 호출하고 4를 대입(현재 3이 입력 되있기 때문에 3+4로 7이 출력)
        System.err.print("\n");

        System.out.println(CalExam2.add(2));
        // CalExam2클래스에 add를 호출하고 2를 대입
        System.out.println(CalExam2.add(3));
        // CalExam2클래스에 add를 호출하고 3을 대입

    }
}