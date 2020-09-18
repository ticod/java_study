/*
 * 10진수를 입력받아 8진수로 출력하기
 */
package chap5;

import java.util.Scanner;

public class Exam2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 0;
		int[] oct = new int[11]; // int = 32bit <= 3*11
		num = scan.nextInt();
		int divnum = num, index = 0;
		while(divnum != 0) {
			oct[index++] = divnum % 8;
			divnum /= 8;
		}
		System.out.print(num + "의 8진수: ");
		for(int i = index - 1; i >= 0; i--) {
			System.out.print(oct[i]);
		}
	}
}
