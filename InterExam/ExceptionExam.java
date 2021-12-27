package ExceptionStudy;



public class ExceptionExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		try {
		int [] array = new int[10];
		array [20] =5;
		}catch (Exception e){
		
		System.out.println("배열의 범위를 지나쳤어요. " + e.toString());
		}
		System.out.println("성공");
		
//		int i = 10;
//		int j = 0;
//			try {		
//					int k = i/j;
//					System.out.println(k);
//			} catch (Exception e){
//				
//				System.out.println("예외가 발생했습니다. " + e.toString());
//			
//			}finally {
//				System.out.println("예외 발생여부와 상관 없이 항상 실행");
//			}
//		System.out.println("main end!!");
		
	}

}
