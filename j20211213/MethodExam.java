package j20211213;

public class MethodExam {

    // 1. 입력( intput )과 출력( output )이 모두 있는 메서드 ( 일반적인 형태 )

    public int sum(int a, int b) {
        return a + b;
    }

    // 2. 입력( intput )과 출력( output )이 모두 없는 메서드
    public void noino() {
        System.out.println("no input no output");
    }

    // 3. 입력( input )만 있는 메서드
    public void onlyInput(String a) {
        System.out.println(a);
    }

    // 4. 출력( output )만 있는 메서드
    public String onlyOutput() {
        return "Hi";
    }

    // * 리턴의 다른 사용법
    public void sayNick(String nick) {
        if ("fool".equals(nick)) {
            return; // 그냥 끝낼때 return을 사용하기도 한다. 웹 개발 할때 사용
        }
        System.out.println("my nick name is " + nick);
    }

    public static void main(String[] args) {

        MethodExam inandout = new MethodExam();

        System.out.println(inandout.sum(3, 4)); // 1

        inandout.noino(); // 2

        inandout.onlyInput("Hello World"); // 3

        System.out.println(inandout.onlyOutput()); // 4

        inandout.sayNick("fool");
        inandout.sayNick("austin");
    }
}
