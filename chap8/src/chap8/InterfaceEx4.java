/*
 * 인터페이스의 객체 생성하기
 */
package chap8;

interface Action {
	void action();
}

abstract class Abs {
	abstract void method();
}

public class InterfaceEx4 {
	public static void main(String[] args) {
		// 이름없는 내부 클래스 (anonymous inner class)
		// => 일회성 객체로 생성되고 사용됨.
		Action a = new Action() {
			@Override
			public void action() {
				System.out.println("Action 인터페이스 객체");
			}
		};
		a.action();
		
		a = new Action() {
			@Override
			public void action() {
				System.out.println("Action 인터페이스 객체 2");
			}
		};
		a.action();
		
		Abs b = new Abs() {
			@Override
			void method() {
				System.out.println("Abs 추상클래스 객체");
			}
		};
		b.method();
		
		// 람다식 -> 메서드가 하나인 인터페이스만 가능
		a = () -> {
			System.out.println("Action 인터페이스 객체 lambda");
		};
//		a = () -> System.out.println("Action 인터페이스 객체 lambda");
		a.action();
	}
}
