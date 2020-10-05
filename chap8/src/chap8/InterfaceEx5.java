/*
 * jdk8 이후 인터페이스도 구현부를 가진 메서드를 멤버로 가질 수 있다.
 *   default 메서드	: 인스턴스 멤버
 *     => 인터페이스는 다중 구현이 가능하므로, 구현 객체에 똑같은 default method가 여러 개 존재할 수 있다.
 *        이런 경우 반드시 구현 클래스에 default method를 오버라이딩해야 한다.
 *   static 메서드	: 클래스 멤버
 */
package chap8;

interface MyInterface1 {
	void method();
	default void method1() {
		System.out.println("MyInterface1의 default 메서드: method1");
	}
	static void staticMethod() {
		System.out.println("MyInterface1의 static 메서드: staticMethod");
	}
}

interface MyInterface2 {
	void method();
	default void method1() {
		System.out.println("MyInterface2의 default 메서드: method1");
	}
	static void staticMethod() {
		System.out.println("MyInterface2의 static 메서드: staticMethod");
	}
}

class Parent {
	public void method2() {
		System.out.println("Parent 클래스의 멤버 메서드: method2");
	}
}

class Child extends Parent 
            implements MyInterface1, MyInterface2 {
	@Override
	public void method1() {
		System.out.println("Child의 default 메서드 오버라이딩 method1"); // 오버라이딩
	}
	@Override
	public void method() {
		System.out.println("Child 클래스의 method"); // 구현
	}
}

public class InterfaceEx5 {
	public static void main(String[] args) {
		Child c = new Child();
		c.method();
		c.method1();
		c.method2();
		MyInterface1.staticMethod();
		MyInterface2.staticMethod();
	}
}
