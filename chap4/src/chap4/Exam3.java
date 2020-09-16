/*
 * 윤년 구하기
 * 윤년은 4의 배수 중 100의 배수인 경우는 평년, 100의 배수가 아닌 경우는 윤년,
 * 400의 배수는 윤년이다.
 * 년도를 입력받아 윤년, 평년을 출력
 * 
 * [결과]
 * 년도를 입력하세요
 * 2020
 * 윤년
 * 
 * 년도를 입력하세요
 * 2100
 * 평년
 * 
 */
package chap4;

import java.util.Scanner;

public class Exam3 {
	public static void main(String[] args) {
		System.out.println("년도를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int year = scan.nextInt();

		if (((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0)) {
			System.out.println("윤년입니다.");
		} else {
			System.out.println("평년입니다.");
		}
	}
}
