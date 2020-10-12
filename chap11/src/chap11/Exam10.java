/*
 * 년도와 월을 입력받아서 년월의 마지막 일자와 요일 출력하기
 */
package chap11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Exam10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("년도 입력: ");
		String year = scan.nextLine();
		System.out.print("월 입력: ");
		String month = scan.nextLine();
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM");
		Date day = null;
		try {
			day = sf.parse(year + "-" + month);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		day.setMonth(day.getMonth() + 1);
		day.setTime(day.getTime() - (1000*60*60*24));
		
		System.out.println(new SimpleDateFormat("yyyy-MM-dd E요일").format(day));
		
		solution2();
	}
	
	public static void solution2() {
		Scanner scan = new Scanner(System.in);
		System.out.print("년도 입력: ");
		int year = scan.nextInt();
		System.out.print("월 입력: ");
		int month = scan.nextInt();
		String sDay = year + "-" + (month+1);
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM");
		Date day = null;
		try {
			day = sf.parse(sDay);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		day.setTime(day.getTime() - (1000*60*60*24));
		
		System.out.println(new SimpleDateFormat("yyyy-MM-dd E요일").format(day));
	}
}
