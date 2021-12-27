package j20211213;

public class CalExam {
    // static 를 사용하면 객체 생성 없이도 접근가능
    static int result = 0;

    static int add(int num) {
        result += num; // result = result + num
        return result;
    }

    static int sub(int num) {
        result -= num; // result = result - num
        return result;
    }
}
