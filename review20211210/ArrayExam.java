package review20211210;

// Array 배열 - 배열의 길이는 고정된다. 즉, 수정할 수 없다.
// datebase에 1명의 정보를 1개의 배열로 가져오기 위함으로 많이 사용한다.

// int[] num = {1,2,3,4,5};

// System.out.println(num[2]);
// System.out.println(num.length);

// ArrayList

//  변수 실습 ( 변수 array에 길이가 5인 int[] 배열을 만들고, 값으로 1, 2, 3, 4, 5를 넣어보세요. )

public class ArrayExam {
    public int[] makeArray() {
        // array가 1부터 5까지 값을 가지는, 길이가 5인 int 배열을 만들어보세요.
        int[] array = { 1, 2, 3, 4, 5 };
        // 아래는 결과 평가를 위한 코드입니다. 수정하지 마세요.
        return array;
    }

    // 아래는 실행을 위한 코드입니다. 수정하지 마세요.
    public static void main(String[] args) {
        ArrayExam exam = new ArrayExam();
        int[] array = exam.makeArray();
        if (array.length == 5 &&
                array[0] == 1 &&
                array[1] == 2 &&
                array[2] == 3 &&
                array[3] == 4 &&
                array[4] == 5) {
            System.out.println("정답입니다.");
        } else {
            System.out.println("틀렸습니다.");
        }
    }
}
