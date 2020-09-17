/*
 * 10진수를 입력 받아 2진수로 출력하기
 */
package chap5;

import java.util.Scanner;

public class Exam1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("10진수를 입력하세요");
		int num = scan.nextInt();
		int[] bin = new int[32]; // int는 4byte
		int divnum = num, index = 0;
		
		while(divnum > 0) {
			bin[index++] = divnum % 2;
			divnum /= 2;
		}
		
		System.out.print(num + "의 2진수: ");
		for(int i = index - 1; i >= 0; i--) {
			System.out.print(bin[i]);
		}
	}
}
