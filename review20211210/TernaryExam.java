package review20211210;

//  삼항 연산자 (조건)  ?(참)   :(거짓)

//  조건이 참이면 ? 뒤에 있는 값이 출력되고 

//  조건이 거짓이면 : 뒤에 있는 값이 출력된다.

//  삼항연산자 실습 문제 ( hour에는 현재 시간이 들어있습니다. 
//  삼항 연산자를 이용해 hour가 12보다 작으면 "오전", 그렇지 않으면 "오후"라는 값을 ampm이 가지도록 8행을 수정하세요 
//  (Calendar를 사용하면 현재 시스템상 시간을 구할 수 있습니다. 시간은 24 시간 단위(오후 1시일 경우 13시)로 나옵니다.). )

import java.util.Calendar;

public class TernaryExam {
    public static void main(String[] args) {
        // hour에는 현재 시간이 24시간 단위로 들어있습니다.
        int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
        String ampm;
        // 삼항 연산자를 이용해 ampm에 오전 또는 오후의 값을 가지도록 만들어보세요.
        ampm = (hour > 12) ? "PM" : "AM";
        System.out.println("지금 시간은 " + hour + "시이고, " + ampm + "입니다.");
    }
}
