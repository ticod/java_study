/*
 * 숫자로 이루어진 문자열을 입력받아 각 자리수의 합을 구하기
 * String str = scan.next();
 * str.length(), str.charAt() 사용
 */
package chap4;

import java.util.Scanner;

public class Exam6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int length = 0, sum = 0;
		String str; // 숫자 입력
		
		System.out.println("숫자를 입력하세요");
		str = scan.next();
		length = str.length();
		
		for(int i = 0; i < length; i++) {
			sum += (str.charAt(i) - '0');
		}
		System.out.println(str + "의 자리수 합: " + sum);
	}
}
