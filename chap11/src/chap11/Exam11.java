/*
 * 년도와 월을 입력받아서 년월의 마지막 일자와 요일 출력하기
 *   Calendar 클래스로 구현하기
 */
package chap11;

import java.util.Calendar;
import java.util.Scanner;

public class Exam11 {
	public enum Week {
		NULL, 일, 월, 화, 수, 목, 금, 토,
	}
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		Week[] week = Week.values();
		Scanner scan = new Scanner(System.in);
		System.out.println("년도와 월 입력");
		int year = scan.nextInt();
		int month = scan.nextInt();
		
		calendar.set(year, month-1, 1);
		calendar.set(Calendar.DATE, calendar.getActualMaximum(Calendar.DATE));
		String s = week[0].toString();
		
		String day = String.format("%d-%d월 마지막 날짜: %d년 %d월 %d일 %s요일", 
						year, month, year, month, 
						calendar.get(Calendar.DATE), 
						week[calendar.get(Calendar.DAY_OF_WEEK)]);
		System.out.println(day);
		scan.close();
	}
}
