/*
 * 10진수를 입력받아 16진수로 출력하기
 */
package chap5;

import java.util.Scanner;

public class Exam3 {
	public static void main(String[] args) {
		final char[] HEX = {
				'0', '1', '2', '3', '4', '5', '6', '7',
				'8', '9', 'A', 'B', 'C', 'D', 'E', 'F'
		};
		Scanner scan = new Scanner(System.in);
		char[] hex = new char[8];
		System.out.println("16진수로 변환할 10빈수를 입력하세요");
		int num = scan.nextInt();
		int divnum = num, index = 0;
		
		while(divnum != 0) {
			hex[index++] = HEX[divnum%16];
			divnum /= 16;
		}
		System.out.print(num + "의 16진수: ");
		for(int i = index - 1; i >= 0; i--) {
			System.out.print(hex[i]);
		}
	}
}
