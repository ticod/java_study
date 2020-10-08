/*
 * switch 구문에서 조건값으로 사용할 수 있는 자료형
 *   - 기본 자료형
 *       byte, short, int, char
 *       String (since jdk7)
 *   - Wrapper class (since jdk5)
 *       Byte, Short, Integer, Character
 */

/*
 * java.lang 패키지의 클래스
 * 
 *   Object			: 최상위 부모 클래스
 *   
 *   String			: 문자열, 대입, 더하기 연산 가능한 객체 (정적 문자열 클래스, immutable하다)
 *   
 *   StringBuffer	: 문자열의 보조 클래스 (동적 문자열 클래스, mutable하다)
 *                    equals 메서드 오버라이딩 안됨
 *                    내용 비교를 위해서는 String 클래스로 변환 필요(toString)
 *                    
 *   Math			: 수학 계산을 위한 메서드들을 클래스(static) 멤버로 저장
 *                    생성자가 private = 객체 생성 불가능
 *                    
 *   Wrapper		: Boolean, Byte, Short, Integer, Long, Float, Double, Character
 *                    위 클래스를 통칭하는 클래스
 *                    boxing, unboxing => 자동 형변환
 */
package chap11;

public class WrapperEx3 {
	public static void main(String[] args) {
		int i = 65;
		switch (i) {
		default:
			System.out.println("int switch 테스트");
		}
		byte b = 65;
		switch (b) {
		default:
			System.out.println("byte switch 테스트");
		}
		short s = 65;
		switch (s) {
		default:
			System.out.println("short switch 테스트");
		}
		char c = 'a';
		switch (c) {
		default:
			System.out.println("char switch 테스트");
		}
		String S = "65";
		switch (S) {
		default:
			System.out.println("String switch 테스트");
		}
		
		/*************************************/
		System.out.println("Wrapper class");
		Integer I = 65;
		switch (I) {
		default:
			System.out.println("Integer switch 테스트");
		}
		Byte B = 65;
		switch (B) {
		default:
			System.out.println("Byte switch 테스트");
		}
		Short Sh = 65;
		switch (Sh) {
		default:
			System.out.println("Short switch 테스트");
		}
		Character C = 'a';
		switch (C) {
		default:
			System.out.println("Character switch 테스트");
		}
	}
}
