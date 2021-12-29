package classesExam;

import java.util.Random;

public class RandomExam {

	public static void main(String[] args) {
		/*
		 * 난수를 구하는 Math.random() 와의 가장 큰 차이점은
		 * 종자값(seed)을 설정할 수 있다는 것이다.
		 * 종자값의 값은 Random 객체들은 항상 같은 난수를 갖는다.
		 * 즉, 같은 공식에 같은 값을 넣으면 같은 결과를 얻는 것과 같이 같은 난수를 얻게 된다. 
		 * 
		 */
		Random rand = new Random(10);	//seed값 10 설정
		Random rand2 = new Random(10);	//seed값 10 설정
		
		for(int i = 0 ; i < 5 ; i++) {
			System.out.println(rand.nextInt());
		}
		for(int j = 0 ; j < 5 ; j++) {
			System.out.println(rand2.nextInt());
		}

	}

}
