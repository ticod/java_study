/*
 * Date 클래스 예제
 * SimpleDateFormat: 형식화 클래스, Date 객체를 형식화된 문자열로 변경
 *     String format(Date) : Date 객체를 지정된 format 형식에 맞도록 
 *                           문자열로 return
 *     (보통 자바에서 format 메서드는 객체를 형식화된 문자열로 리턴)
 *     Date parse(String)  : 형식에 맞는 문자열을
 *                           Date 객체로 return 
 *                           => ParseException 예외처리 필요
 *     (보통 자바에서 parse 메서드는 형식에 맞는 문자열을 객체로 리턴)
 */
package chap11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx1 {
	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
		SimpleDateFormat sf = new SimpleDateFormat(
				"yyyy-MM-dd HH:mm:ss E a");
		System.out.println(sf.format(now));
		SimpleDateFormat sf2 = new SimpleDateFormat(
				"yyyy년 MM월 dd일 HH시 mm분 ss초 E요일 a");
		System.out.println(sf2.format(now));
		/*
		 * SimpleDateFormat에 사용되는 문자
		 * yyyy	:	년도 4자리
		 * MM	:	월   2자리
		 * dd	:	일   2자리
		 * HH	:	시간 2자리
		 * mm	:	분   2자리
		 * ss	:	초   2자리
		 * E	:	요일 1자리
		 * a	:	오전/오후
		 * 
		 */
		SimpleDateFormat sf3 = new SimpleDateFormat(
					"yyyy-MM-dd HH:mm:ss");
		String dataStr = "2020-12-25 10:00:00";
		Date day = null;
		try {
			// parse 메서드 구현시 예외처리 해줘야함 (ParseException)
			day = sf3.parse(dataStr);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println(day);
		// 문제: day를 "2020-12-25 금요일" 형식으로 출력하기
		System.out.println(new SimpleDateFormat("yyyy-MM-dd E요일").format(day));
	}
}
