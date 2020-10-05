/*
 * final 메서드 : 재정의 불가 메서드 => 오버라이딩 불가 메서드
 */
package chap7;

public class FinalMethod {
//	public final void method() {
//		System.out.println("FinalMethod 클래스의 method");
//	} => 오버라이딩 불가
	public void method() {
		System.out.println("FinalMethod 클래스의 method");
	}
}

class subMethod extends FinalMethod {
	public void method() {
		System.out.println("SubMethod 클래스의 method");
	}
}