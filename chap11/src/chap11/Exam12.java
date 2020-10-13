/*
 * 정규식 문제 1
 * 
 * String str = "Java   and  JSP    and Spring   and HTML   and JavaScript    and Jquery";
 * 주어진 문자열에서 과목만 출력하기
 */
package chap11;

import java.util.Scanner;

public class Exam12 {
	public static void main(String[] args) {
		String str = "Java   and  JSP    and Spring   and HTML   and JavaScript    and Jquery";
		String[] subjects = str.split("\\s*and\\s*");
		for (String subject : subjects) {
			System.out.println(subject);
		}
		
		System.out.println("\nScanner 이용");
		Scanner scan = new Scanner(str);
		scan.useDelimiter("\\s*and\\s*");
		while (scan.hasNext()) {
			System.out.println(scan.next());
		}
		scan.close();
	}
}
