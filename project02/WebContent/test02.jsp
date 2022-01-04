<%@page import="java.util.Scanner"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>암산 훈련</title>
</head>
<body>
<%! 
int[] arrayid(int[] a,int idx){
int count = 0;	// int형 count변수를 0으로 초기화

for(int i = 0 ; i < a.length  ; i++){	// 반복문 시작
    if(a[i] == idx){	//a[i]값이 idx와 같지 않으면
      count++;			//count값 1증가
    }
}
int c[] = new int[count--];	//int형 배열 c에 길이가 count--인 객체 생성
for(int i = a.length-1 ; count >=0 ; i--){	//반복문 시작
  if(a[i] == idx){	//a[i]가 idx와 같으면
    c[count--] = i;	//c에 count-- 번째에 i값 대입
      }
    }
return c;	//c를 반환
}
%>
<% 
out.print("요소 수 :");
%>
</body>
</html>