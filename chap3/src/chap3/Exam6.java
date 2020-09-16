/*
 * 사과를 담기 위한 사과 상자 개수 구하기
 * 1개의 상자에 10개의 사과를 담을 수 있다고 할 때 필요한 상자의 개수를 출력하기.
 * 
 * [결과]
 * 사과의 개수를 입력하세요
 * 22
 * 필요한 상자의 개수 : 3개
 * 
 * 사과의 개수를 입력하세요
 * 30
 * 필요한 상자의 개수 : 3개
 */
package chap3;

import java.util.Scanner;

public class Exam6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("사과의 개수를 입력하세요");
		int apple = scan.nextInt();
		int box = (apple % 10 == 0) ? apple / 10 : apple / 10 + 1;
//		int box = apple / 10 + ((apple % 10 == 0) ? 0 : 1);
		System.out.println("필요한 상자의 개수 : " + box + "개");
	}
}
