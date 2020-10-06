/*
 * 오버라이딩에서 예외처리
 */
package chap10;

class Parent {
	public void method() throws RuntimeException {
		System.out.println("Parent 클래스의 method 메서드");
	}
}

class Child extends Parent {
	@Override
	public void method() throws ArithmeticException {
		// 부모보다 넓은 범위의 예외처리는 불가능하다.
		System.out.println("Child 클래스의 method 메서드");
	}
}

public class ExceptionEx6 {
	public static void main(String[] args) {
		Parent p = new Child();
		p.method();
	}
}
