/*
 * 다음의 결과가 나오도록 프로그램을 작성하시오.
 * [결과]
 * 삼각형의 높이를 입력하세요
 * 5
 * 15 14 13 12 11
 *    10  9  8  7
 *        6  5  4
 *           3  2
 *              1
 */
package chap5;

import java.util.Scanner;

public class Exam7 {
	public static void main(String[] args) {
		System.out.println("삼각형의 높이를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int len = scan.nextInt();
		
		int num = 0;
		for(int i = 1; i <= len; i++) {
			num += i;
		}
		
		for(int i = 0; i < len; i++) {
			for(int j = 0; j < len; j++) {
				if(j >= i) {
					System.out.printf("%8d", num--);
				} else {
					System.out.printf("\t");
				}
			}
			System.out.println();
		}
	}
}
