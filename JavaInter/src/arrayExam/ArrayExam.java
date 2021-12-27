package arrayExam;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * array배열
		 * 같은 타입의 여러 변수들을 하나의 묶음으로 다루는 방식
		 * 배열은 생성시 정한 갯수를 수정할 수 없다.
		 * 기본적으로 배열은 0으로 초기화 되어 생성된다.
		 * 
		 * int[] score = new int[5]; //5개의 int형 변수 배열을 생성
		 * String[] name = new String[5];
		 */
		
//		int[] score = new int[5];
//		for (int i = 0 ; i < 5; i++) {
//		System.out.println(score[i]);
//		}
//		score[0] = 10;
//		score[1] = 20;
//		score[2] = 30;
//		score[3] = 40;
//		score[4] = 50;
//		for (int i = 0 ; i < score.length; i++) {
//			System.out.println(score[i]);
//			}
		
		/*
		 * 배열의 길이를 수정하는 방법
		 * 1. 더 큰 배열을 새로 생성한다.
		 * 2. 기존 배열의 데이터들을 새로 생성한 배열로 복사한다.
		 */
		
//		int[] math = new int[5];
//		
//		for (int j = 0 ; j < math.length ; j++) {
//			math[j] = j * 10 + 50;
//		}
//		for (int j = 0 ; j < math.length ; j++) {
//			System.out.println(math[j]);
//		}
		
//		int[] arr = new int[5];
//		
//		for (int i = 0 ; i <arr.length; i++) {
//			arr[i] = i+1;
//		}
//		
//		System.out.println("배열 수정 전 : ");
//		
//		for(int i = 0 ; i <arr.length; i++) {
//			System.out.println("arr[" + i + "] : " + arr[i]);
//		}
//		
//		System.out.println("배열 수정 후 tmp: ");
//		
//		int[] tmp = new int[arr.length*2];
//		
//		for (int i = 0 ; i < arr.length ; i++) {
//			tmp[i] = arr[i];
//		}
//		for(int i = 0 ; i <tmp.length; i++) {
//			System.out.println("tmp[" + i + "] : " + tmp[i]);
//		}
//		arr = tmp;
//		System.out.println("배열 수정 후 arr : ");
//		for(int i = 0 ; i <arr.length; i++) {
//			System.out.println("arr[" + i + "] : " + arr[i]);
//		}
//		
//		char[] abc = {'A','B','C','D'};
//		char[] num = {'0','1','2','3','4','5','6','7','8','9'};
//		
//		System.out.println(abc);
//		System.out.println(num);
//		//두 개의 배열을 붙여서 하나의 배열
//		char[] result = new char[abc.length+num.length];
//		System.arraycopy(abc, 0, result, 0, abc.length);
//		System.out.println(result);
//		System.arraycopy(num, 0, result, abc.length, num.length);
//		System.out.println(result);
//		System.arraycopy(abc, 0, num, 0, abc.length);
//		System.out.println(num);
//		System.arraycopy(abc, 0, num, 6, 3);
//		System.out.println(num);
		
		/* 학생 5명의 총점 합계 점수와 평균을 구하시오
		
		int[] scores = {100,88,98,90,96};
		int sum = 0;
		double avg = 0 ;
		for(int i = 0 ; i < scores.length ; i++) {
			sum += scores[i];
		}
		avg = (double)sum/ scores.length;
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
		*/
	
		/*
		 * 최댓값과 최솟값을 출력하시오
		 
		
		int[] scores = {78,88,98,90,96,67,65,87};
		
		int max = scores[0];
		int min = scores[0];
		
		
		
		for(int i = 0 ; i < scores.length ; i++) {
			if (scores[i] > max) {
				max = scores[i];
			}
			if(scores[i] < min) {
				min = scores[i];
			}
		}
		System.out.println("최댓값 : " +max);
		System.out.println("최솟값 : "+ min);
		
		*/
		
		
		/*
		 * 배열 뒤집기
		 
		
		int[] scores = {78,88,98,90,96,67,65,87};
		int[] temp = new int[scores.length];
		// scores = {87,65,67,96,90,98,88,78} 
		
		for (int i = 0  ; i < scores.length; i++) {
			temp[i] = scores[scores.length-1-i];
		}
		
		scores = temp;
		
		//System.out.println(Arrays.toString(scores));
		
		for (int item : scores) {
			System.out.print(item + " ");
		}
		*/
		
		/*
		 * 444657953
		 * 
		 * 0의 갯수 :
		 * 1의 갯수 : 
		 * 2의 갯수 :
		 * 
		 
		
		int[] numArr = {4,4,4,6,5,7,9,7,5,3};
		int[] counter = new int[10];	//{0,0,0,0,3,2,1,1,0,1}
		
		for(int i = 0; i < numArr.length ; i++) {
			counter[numArr[i]]++;
			// counter[numArr[i]] = counter[numArr[i]] + 1;
		}
		for(int i = 0; i < counter.length ; i++) {
			System.out.println(i + "의 갯수 : " + counter[i]);
			}
		*/
		
		/*
		 * String 배열
		 
		
		String[] name = new String[3];	// 길이가 3인 String 배열 생성
		name[0] = "Kim";
		name[1] = "Song";
		name[2] = "Park";
		
		String[] name2 = {"Kim", "Song", "Park"};
		
		String[] name3 = new String[]{"Kim", "Song", "Park"};
		
		for(int i = 0 ; i < name.length ; i++) {
			System.out.print(name[i] + " ");
		}
		*/
		
		/*
		 * char 배열 과 String 배열 변환
		 * src 라는 String "ABCDE" 를 만들어 
		 * chArr 이라는 char[] 로 변환하여 출력
		 
		char[] chArr = {'A','B','C'};
		String str = new String(chArr);
		
		System.out.println(str);
		
		char[] tmp = str.toCharArray();
		*/
		
		String src = "ABCDE";
		for(int i = 0; i < src.length(); i++) {
			char ch = src.charAt(i);
			System.out.println("src.charAt(" + i + ") :" +ch);
		}
		//char[] chArr = src.toCharArray();

		
	}
}

