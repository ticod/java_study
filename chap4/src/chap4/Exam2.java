/*
 * 키보드에서 한 개의 문자를 입력받아 대문자, 소문자, 수사, 기타 문자인지 출력하기
 * [결과]
 * A
 * 대문자
 * 
 * 6
 * 숫자
 * 
 * ~
 * 기타문자
 */
package chap4;

import java.util.Scanner;

public class Exam2 {
	public static void main(String[] args) {
		System.out.println("한 개의 문자를 입력하세요");
		Scanner scan = new Scanner(System.in);
		char ch = scan.next().charAt(0);
		if(ch >= '0' && ch <= '9') {
			System.out.println("숫자");
		}
		else if(ch >= 'A' && ch <= 'Z') {
			System.out.println("대문자");
		}
		else if(ch >= 'a' && ch <= 'z') {
			System.out.println("소문자");
		}
		else {
			System.out.println("기타문자");
		}
	}
}
