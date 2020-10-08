/*
 * StringBuffer 클래스 : 동적 문자열
 *   equals 메서드가 오버라이딩 되어 있지 않음
 *   내용 비교를 위해서는 문자열로 변경하여 비교해야 함
 *   => equals로 내용이 같은지 확인 불가능
 */
package chap11;

public class StringBufferEx1 {
	public static void main(String[] args) {
		// StringBuffer
		StringBuffer sb1 = new StringBuffer("abc");
		StringBuffer sb2 = new StringBuffer("abc");
		
		if(sb1 == sb2)	System.out.println("sb1 == sb2");
		else			System.out.println("sb1 != sb2"); // 출력
		
		if(sb1.equals(sb2)) System.out.println("sb1 equals sb2");
		else				System.out.println("sb1 not equals sb2"); // 출력
		
		// String (StringBuffer.toString)
		String s1 = sb1.toString();
		String s2 = sb2.toString();
		
		if(s1 == s2)	System.out.println("s1 == s2");
		else			System.out.println("s1 != s2"); // 출력
		
		if(s1.equals(s2)) 	System.out.println("s1 equals s2"); // 출력
		else				System.out.println("s1 not equals s2");
	}
}
