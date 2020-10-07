/*
 * count 메서드 구현
 * int count("문자열 소스", "찾는 문자열") : 문자열 소스에서 찾는 문자열의 개수 반환
 */
package chap11;

public class Exam3 {
	public static void main(String[] args) {
		System.out.println(count("12345AB12AB345AB", "12")); // 2
		System.out.println(count("12345AB12AB345AB", "AB")); // 3
		System.out.println(count("12345", "6")); // 0
	}
	private static int count(String src, String target) {
		int count = 0; int index = 0;
		
		while(true) {
			index = src.indexOf(target, index);
			if(index < 0) break;
			index++; count++;
		}
		
//		while(src.indexOf(target, index) != -1) {
//			index = src.indexOf(target, index) + 1;
//			count++;
//		}
		
		return count;
	}
}
