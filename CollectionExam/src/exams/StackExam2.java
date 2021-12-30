package exams;


import java.util.Stack;

public class StackExam2 {

	public static void main(String[] args) {
		// 입력한 수식의 괄호가 옳바른지 확인하는 예시
		// 괄호(를 만나면 스택을 넣고)를 만나면 스택에서 ( 를 꺼낸다.
		// 스택이 비어있거나 마지막에 남아 있는게 있으면 오류
		//   ((2+3)*1)+3
		
		Stack st = new Stack();
		String expresstion = "((2+3)*1)+3";
		
		try {
			for(int i = 0; i < expresstion.length(); i++){
				char ch = expresstion.charAt(i);
				if(ch == '(') { //char은 equals 대신 == 를 사용한다 (숫자로 적용되기 때문에)
					st.push(ch + "");
				}else if(ch == ')') {
					st.pop();
				}	
				System.out.println(st);
			}
			if(st.isEmpty()) {
				System.out.println("괄호가 일치합니다.");
			}else {
				System.out.println("괄호가 일치하지 않습니다.");
			}
		}catch(Exception e) {
			System.out.println("괄호가 일치하지 않습니다.");
		}
		
	}

}
