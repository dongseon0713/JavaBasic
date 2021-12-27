package OOPExam;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i ;
		
		System.out.print("요소 수 : ");
	    int x = sc.nextInt();
	    int[] y = new int[x];
	    
	    for(i = 0; i < x; i++){
	      System.out.print("x["+i+"] = ");
	      y[i] = sc.nextInt();
	    }
	    System.out.print("y = {");
	    if(x >= 2) {
	    	for(i = 0 ; i < x-1; i++) {
	    		System.out.print(y[i]+ ",");
	    	}
	    if (x >=1) {
	    	System.out.print(y[x-1]);
	    }
	    }
	     System.out.println("}");
	    	
	}

}
