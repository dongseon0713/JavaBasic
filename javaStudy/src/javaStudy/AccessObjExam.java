package javaStudy;

public class AccessObjExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AccessObj obj = new AccessObj();
		
		System.out.println(obj.p);
		
		System.out.println(obj.p2);
		
		System.out.println(obj.k);
		
//		System.out.println(obj.i); //	private가 있기 때문에 AccessObj 자기 자신밖에 사용할 수 없다.
		
	}

}
