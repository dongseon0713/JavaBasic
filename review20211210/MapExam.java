package review20211210;

import java.util.HashMap;

// 파이썬의 딕셔너리 판다스의 Series , JS의 json과 같은
// 키와 벨류 쌍으로 이루어진 자료형
// 오직 키값으로 벨류값을 얻는다. 순서(Index)의 개념이 없다.

public class MapExam {
    public static void main(String[] args) {

        HashMap<String, String> a = new HashMap<String, String>();

        a.put("people", "person");
        a.put("baseball", "ball");

        System.err.println(a.get("people"));
    }
}
