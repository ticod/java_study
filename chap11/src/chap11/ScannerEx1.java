/*
 * Scanner (since jdk 5.0)
 *   키보드와 App간 입력 스트림(System.in: 표준 입력 스트림)으로 연결
 *   키보드를 입력할 때마다 버퍼에 한 문자씩 저장, (11을 입력해도 1, 1이 입력되는 것) 
 *   enter(또는 아래 예제의 경우 0)를 기준으로 처리함.
 *   또한 공백을 기준으로 처리함
 *   
 */
package chap11;

import java.util.Scanner;

public class ScannerEx1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sum = 0, cnt = 0;
		System.out.println("두 자리 자연수를 입력하세요. 종료(0)");
		while (true) {
			int num = scan.nextInt();
			if (num == 0) break;
			if (num < 10 || num > 99) continue;
			sum += num;
			cnt++;
		}
		System.out.println("입력 데이터 건수: " + cnt + ", 입력 데이터 합계: " + sum);
	}
}
