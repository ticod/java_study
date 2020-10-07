/*
 * [결과]
 * HTML => 홍길동
 * CSS  => 김삿갓
 * JavaScript => 이몽룡
 * JAVA => 성춘향
 * JSP => 임꺽정
 * 스프링 => 향단이
 */
package chap11;

public class Exam5 {
	public static void main(String[] args) {
		String s1 = "HTML-CSS-Javascript-JAVA-JSP-스프링";
		String s2 = "홍길동 ,  김삿갓,   이몽룡, 성춘향,   임꺽정 , 향단이  ";
		String[] s1Array = s1.split("-");
		String[] s2Array = s2.split(",");
		for(int i = 0; i < ((s1Array.length > s2Array.length) ? s2Array.length : s1Array.length); i++) {
			System.out.println(s1Array[i] + " => " + s2Array[i].trim());
		}
		Math.abs(-15);
	}
}
