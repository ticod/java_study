/*
 * 문자열을 입력받아 숫자인 경우는 숫자입니다.
 * 숫자가 아닌 경우는 숫자가 아닙니다 출력하기.
 */
package chap4;

import java.util.Scanner;

public class Exam8 {
	public static void main(String[] args) {
		System.out.println("숫자를 입력하세요");
		
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		int length = str.length();
		int i = 0;
		
		for(i = 0; i < length; i++)
			if(str.charAt(i) <= '0' || str.charAt(i) >= '9')
				break;
		
		if(i == length)
			System.out.println("숫자입니다.");
		else
			System.out.println("숫자가 아닙니다.");
		
//		boolean b = true;
//		for(int i = 0; i < length; i++)
//			if(str.charAt(i) <= '0' || str.charAt(i) >= '9') {
//				b = false;
//				break;
//			}
//		
//		if(b)
//			System.out.println("숫자입니다.");
//		else
//			System.out.println("숫자가 아닙니다.");
	}
}
