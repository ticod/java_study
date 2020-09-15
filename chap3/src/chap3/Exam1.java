package chap3;
/*
 * 12345초가 몇시간 몇분 몇초인지 출력하기
 * [결과] X시간 X분 X초
 */
import java.util.Scanner;

public class Exam1 {
	public static void main(String[] args) {
		final int HOUR_PER_SECOND = 3600;
		final int MINUTE_PER_SECOND = 60;
//		int second = 12345;
		
		// 키보드에서 입력받아 시간 구하기
		int second = 0;
		System.out.println("계산할 초를 입력하세요.");
		Scanner scan = new Scanner(System.in);		// System.in : 표준 입력, 키보드 입력(콘솔창 입력)
		second = scan.nextInt();
		
		int h = second/HOUR_PER_SECOND;
		int m = second%HOUR_PER_SECOND/MINUTE_PER_SECOND;
		int s = second%MINUTE_PER_SECOND;
		System.out.println(h + "시간 " + m + "분 " + s + "초");
	}
}
