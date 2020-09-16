package chap3;
/*
 * 한 개의 문자를 입력 받아서 소문자인 경우는 대문자로 변경하기.
 * 단 소문자가 아닌 경우 "소문자 아님" 출력하기.
 * Scanner 클래스의 next() 메서드 이용
 * String 클래스의 charAt(0) 메서드 이용
 * [결과]
 * 한 개의 문자를 입력하세요
 * a
 * A
 * 
 * 한 개의 문자를 입력하세요
 * A
 * 소문자 아님
 */
import java.util.Scanner;

public class Exam5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("한 개의 문자를 입력하세요");
		
//		String str = scan.next();
//		char ch = str.charAt(0);
		char ch = scan.next().charAt(0);
		
//		System.out.println((ch < 'a' || ch > 'z') ? "소문자 아님" : (char)(ch - ('a' - 'A')));
		String result = (ch < 'a' || ch > 'z') ? "소문자 아님" : (char)(ch - ('a' - 'A')) + "";
		System.out.println(result);
	}
}
