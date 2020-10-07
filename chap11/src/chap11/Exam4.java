/*
 * 한 곳만 수정하기
 * [결과]
 * basket
 * basketball
 */
package chap11;

public class Exam4 {
	public static void main(String[] args) {
		String str = "base";
		System.out.println(str.replace('e', 'k') + "et"); // baseball
		str += "ball";
		System.out.println(str);
		
		String str2 = "base";
		System.out.println(str2 = str2.replace('e', 'k') + "et"); // basketball
		str2 += "ball";
		System.out.println(str2);
	}
}
