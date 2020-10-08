/*
 * replace, parseInt, format 활용
 * 
 * 문자열 1,234를 정수로 변경하여 * 10 한 값을 세 자리마다 , 찍어 출력하기
 * 12,340
 */
package chap11;

public class Exam6 {
	public static void main(String[] args) {
		String str = "1,234";
		int i = Integer.parseInt(str.replaceAll(",", "")) * 10;
		System.out.println(String.format("%,d", i));
	}
}
