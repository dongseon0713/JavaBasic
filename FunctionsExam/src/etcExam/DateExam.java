package etcExam;

import java.util.*;	//구버전 8 이전
import java.time.*;	//신버전
import java.time.format.DateTimeFormatter;

public class DateExam {

	public static void main(String[] args) {
		/* Calendar 추상클래스이기 때문에 객체를 생성할 수 없고 메서드를 통해서만 사용한다.
		 * Calendar cal = new Calendar(); 	//에러
		 * Calendar cal = Calendar.getInstance():
		 * 
		 */
		//--------------------------------구버전--------------------------
		Calendar today = Calendar.getInstance();
		
		System.out.println("올해의 연도는 : "+ today.get(Calendar.YEAR));
		System.out.println("현재의 월은 : "+(today.get(Calendar.MONTH)+1)); //MONTH는 0에서 시작한다. 
		System.out.println("올해 중 몇번째 주 : "+ today.get(Calendar.WEEK_OF_YEAR));
		System.out.println("이달 중 몇번째 주 : "+ today.get(Calendar.WEEK_OF_MONTH));
		System.out.println("이달의 몇 일 : "+ today.get(Calendar.DATE));
		System.out.println("이달의 몇 일 : "+ today.get(Calendar.DAY_OF_MONTH));
		System.out.println("올해의 몇 일 : "+ today.get(Calendar.DAY_OF_YEAR));
		System.out.println("요일 : "+ today.get(Calendar.DAY_OF_WEEK));	//일요일이 1
		
		String[] yi = {"","일","월","화","수","목","금","토"};
		System.out.println("요일 : " + yi[today.get(Calendar.DAY_OF_WEEK)] + "요일");
		
		Calendar date1 = Calendar.getInstance();
		Calendar date2 = Calendar.getInstance();
		
		date1.clear();
		date1.set(2000,1,1);
		
		
		
		//System.out.println("date1은 " + toString(date1));
		//System.out.println("date2은 " + toString(date2));
		
		long diff = (date2.getTimeInMillis() - date1.getTimeInMillis())/1000;
		System.out.println("date1부터 date2까지 " + diff + "초 지났습니다.");
		
		System.out.println("date1부터 date2까지 " + diff/60/60/24 + "일 지났습니다.");
		//------------------------------신버전---------------------------------------
		
		LocalDate now = LocalDate.now();
		
		System.out.println(now);//현재 날짜 (컴의 날짜)
		
		LocalDate pari = LocalDate.now(ZoneId.of("Europe/Paris"));
		
		System.out.println(pari);//현재 날짜 (파리 날짜)
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yy-MM-dd");
		String formateNow = now.format(formatter);
		System.out.println(formateNow);
		
		int year = now.getYear();
		System.out.println("현재의 연도는 " + year + "입니다.");
		
		String month = now.getMonth().toString();
		System.out.println("현재의 월은 " + month.toLowerCase() + "입니다.");
		
		int MonVal = now.getMonthValue();
		System.out.println("현재의 월은 " + MonVal + "월 입니다.");
		
		String dofw = now.getDayOfWeek().toString();
		System.out.println("오늘은 " + dofw + "입니다.");
		
		int dofwVal = now.getDayOfWeek().getValue();
		System.out.println("오늘은 " + dofwVal + "입니다.");	//월요일이 1 일요일이 7
		
		LocalTime nowTime = LocalTime.now();
		System.out.println(nowTime);
		
		DateTimeFormatter form = DateTimeFormatter.ofPattern("HH시 mm분 ss초");
		String formatedTime = nowTime.format(form);
		System.out.println(formatedTime);
		
		int hour = nowTime.getHour();
		int minute = nowTime.getMinute();
		int second = nowTime.getSecond();
		System.out.println("현재 시간은 " + hour + "시 입니다.");
		System.out.println("현재 분은 " + minute + "분 입니다.");
		System.out.println("현재 초는 " + second + "초 입니다.");
		
		//--------------------------------------------------------------
		//날짜와 시간을 함께 처리
		//--------------------------------------------------------------
		
		LocalDateTime curr = LocalDateTime.now();
		System.out.println(curr);
		DateTimeFormatter curr1 = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH시 mm분 ss초");
		String day = curr.format(curr1);
		System.out.println(day);
		
		int cYear = curr.getYear();
		System.out.println("현재 년도는 " +cYear+"년 입니다.");
		int cMonth = curr.getMonth().getValue(); 
		System.out.println("현재 월은 " +cMonth + "월 입니다.");
		int cDay = curr.getDayOfMonth();
		System.out.println("현재 일은  " + cDay + "입니다.");
		int cHour = curr.getHour();
		System.out.println("현재 시간은 " + cHour + "시 입니다.");
		int cMinute = curr.getMinute();
		System.out.println("현재 분은 " + cMinute + "분 입니다.");
		int cSecond = curr.getSecond();
		System.out.println("현재 초는 " + cSecond + "초 입니다.");
		int cWeek = curr.getDayOfWeek().getValue();
		String[] cWeekArr = {"","월","화","수","목","금","토","일"};
		System.out.println("요일은 " + cWeekArr[cWeek] +"요일 입니다.");
		
	}

}
