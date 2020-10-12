package chap11;

import java.util.Calendar;

public class CalendarEx2 {
	public enum Week {
		일, 월, 화, 수, 목, 금, 토,
	}
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		
		cal.set(2020, (12-1), 30);
		System.out.println("날짜: " + cal.get(Calendar.YEAR) + "년" + 
					(cal.get(Calendar.MONTH) + 1) + "월" + cal.get(Calendar.DATE) + "일");
		// cal 2020-12-30 일자의 요일 출력
		Week[] week = Week.values();
		for (Week we : week) {
			System.out.println(we.ordinal());
		}
		System.out.println(week[cal.get(Calendar.DAY_OF_WEEK)-1] + "요일");
	}
}
