/*
 * 
 */
package chap11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx2 {
	public static void main(String[] args) {
		Date now = new Date();
		// getTime(): 1970년 이후부터 now 날짜까지의 밀리초 리턴
		System.out.println(now.getTime());
		System.out.println(System.currentTimeMillis());
		
		// 문제: 2021년 3월 1일의 요일, 밀리초 출력
		SimpleDateFormat sf = new SimpleDateFormat("yyyy년 MM월 dd일");
		Date day = null;
		try {
			day = sf.parse("2021년 3월 1일");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println(new SimpleDateFormat("yyyy년 MM월 dd일 E요일").format(day));
		System.out.println(day.getTime());
		
		// day 3일 이후의 날짜와 요일 구하기
		/*
		 * 1000  : ms(밀리초)
		 * 60    : s(초)
		 * 60    : m(분)
		 * 24    : h(시)
		 * 3     : d(일, 3일로 설정)
		 */
		day.setTime(day.getTime() + (1000*60*60*24*3));
		System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss E요일").format(day));
		SimpleDateFormat sf33 = new SimpleDateFormat("HH:mm:ss");
		Date day33 = null;
		try {
			day33 = sf33.parse("11:33:55");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println(day33);
		
	}
}
