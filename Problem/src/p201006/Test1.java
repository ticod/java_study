//1. Outer클래스의 내부 클래스 Inner1, inner2 의 멤버변수 iv의 값 출력

package p201006;

class Outer1 {
	class Inner1 {
		int iv = 100;
	}
	static class Inner2 {
		int iv = 200;
	}
}

public class Test1 {
	public static void main(String[] args) {
		System.out.println(new Outer1().new Inner1().iv);
		System.out.println(new Outer1.Inner2().iv);
	}
}
