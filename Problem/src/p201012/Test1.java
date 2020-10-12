/*
1.년도와 월을 입력 받아 해당 월의 달력을 출력하기

[결과]
년도와 월를 입력하세요
2020 10

     2020년10월

일 월 화 수 목 금 토

                 1  2   3

 4   5  6   7  8  9  10

11 12 13 14 15 16 17

18 19 20 21 22 23 24

25 26 27 28 29 30 31
*/
package p201012;

import java.util.Calendar;
import java.util.Scanner;

public class Test1 {
	public enum Week {
		NULL, 일, 월, 화, 수, 목, 금, 토,
	}
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		Week[] week = Week.values();
		Scanner scan = new Scanner(System.in);
		System.out.println("년도와 월를 입력하세요");
		int year = scan.nextInt();
		int month = scan.nextInt();
		
		calendar.set(year, month-1, 1);
		
		System.out.println("\t\t\t"+year+"년 "+month+"월");
		
		// 월 출력
		for (int i = 1; i < week.length; i++) {
			System.out.print("\t"+week[i]);
		}
		System.out.println();
		
		int LFCount = calendar.get(Calendar.DAY_OF_WEEK)-1;
		
		// 일 출력
		System.out.print("\t".repeat(LFCount));
		for(int i = calendar.get(Calendar.DATE); 
				i <= calendar.getActualMaximum(Calendar.DATE); 
				i++) {
			if (LFCount >= 7) {
				System.out.println();
				LFCount = 0;
			}
			System.out.print("\t"+i);
			LFCount++;
		}
		scan.close();
	}
}
