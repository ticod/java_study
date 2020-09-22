/*
 * 기본 자료형과 참조 자료형을 매개변수로 줄 때 결과값이 달라질 수 있다.
 * 
 * (간단하게) 기본 자료형 : 조회, 참조 자료형 : 변경도 가능하다
 * 예외 : String 클래스
 */
package chap6;

class Value {
	int val;
}

public class ParameterEx1 {
	public static void main(String[] args) {
		Value v = new Value();
		v.val = 100;
		change1(v.val);
		System.out.println("change1() 이후: " + v.val);
		change2(v);
		System.out.println("change2() 이후: " + v.val);
	}
	
	private static void change1(int val) {
		val += 100;
		System.out.println("change1() 메서드 : " + val);
	}
	
	private static void change2(Value v) {
		v.val += 100;
		System.out.println("change2() 메서드 : " + v.val);
	}
}
