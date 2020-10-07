/*
 * String 클래스: 정적인 문자열 = 변경 불가 객체 (immutable)
 *    - final class
 *    - class중 유일하게 대입연산자로 객체 생성 가능 (String s = "hi!")
 *    - class중 유일하게 +연산자 사용이 가능 (s += "Hello!")
 */
package chap11;

public class StringEx1 {
	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "abc";
		if(s1 == s2) System.out.println("s1과 s2는 같은 객체");
		else System.out.println("s1과 s2는 다른 객체");
		if(s1.equals(s2)) System.out.println("s1과 s2는 같은 내용의 객체");
		else System.out.println("s1과 s2는 다른 내용의 객체");
		/*
		 * 위와 같이 ==로 equals를 대신하는 것은
		 * 좋지 않다.
		 */
		
		String s3 = new String("abc");
		String s4 = new String("abc");
		if(s3 == s4) System.out.println("s1과 s2는 같은 객체");
		else System.out.println("s1과 s2는 다른 객체");
		if(s3.equals(s4)) System.out.println("s1과 s2는 같은 내용의 객체");
		else System.out.println("s1과 s2는 다른 내용의 객체");
	}
}
