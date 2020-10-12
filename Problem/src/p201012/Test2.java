/*
2.  두개의 날짜를 입력받아서 두날짜사이의 일수를 출력하기

[결과]
첫번째 날짜를 입력하세요(yyyy-MM-dd)
2020-02-28

두번째 날짜를 입력하세요(yyyy-MM-dd)
2020-03-02

2020-03-02 -2020-02-28 일자의 차이 : 3
*/
package p201012;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
		Scanner scan = new Scanner(System.in);
		System.out.println("첫번째 날짜를 입력하세요(yyyy-MM-dd)");
		String firstDayString = scan.nextLine();
		System.out.println("두번째 날짜를 입력하세요(yyyy-MM-dd)");
		String secondDayString = scan.nextLine();
		
		Date firstDay = null;
		Date secondDay = null;
		
		try {
			firstDay = sf.parse(firstDayString);
			secondDay = sf.parse(secondDayString);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		long diffTime = secondDay.getTime() - firstDay.getTime();
		long diffDay = diffTime / (1000*60*60*24);
		System.out.println(diffDay);
	}
}
