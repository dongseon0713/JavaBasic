package variableExam;

public class IntExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 정수 int long byte short
		 * 
		 * byte < short < * int * < long
		 *   1      2        4        8	  각각 크기가 2배씩 증가
		 * 
		 * 오버 플로우 (overflow)
		 * 작은 형의 값을 큰 형으로는 넣을 수 있지만
		 * 큰 형의 값을 작은 형에는 넣을 수 없다.
		 */
		
		short sMin = -32768;
		short sMax = 32767;
		
		System.out.println("sMin : " + sMin);
		System.out.println("sMax : " + sMax);
				
	}

}
