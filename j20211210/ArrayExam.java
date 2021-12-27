package j20211210;

import java.util.ArrayList;

public class ArrayExam {
    public static void main(String[] args) {

        // Array 배열 - 배열의 길이는 고정된다. 즉, 수정할 수 없다.
        // datebase에 1명의 정보를 1개의 배열로 가져오기 위함으로 많이 사용한다.

        // int[] num = {1,2,3,4,5};

        // System.out.println(num[2]);
        // System.out.println(num.length);

        // ArrayList

        ArrayList<String> lists = new ArrayList<String>();

        lists.add("1234");
        lists.add("6544");
        lists.add("5432");

        System.out.println(lists.get(0));

    }
}
