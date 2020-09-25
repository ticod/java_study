/*
 * 추상 클래스간의 상속
 * 
 * 부모 추상 클래스의 추상 메서드를 자손 추상 클래스 내부에서 오버라이딩하지 않아도 된다.
 */
package chap7;

abstract class Abs1 {
	int a = 10;
	abstract int getA();
}

abstract class Abs2 extends Abs1 {
	int b = 20;
	abstract int getB();
//	abstract int getA(); // 상속받았기 때문에 포함되어있다고 생각할 수 있다.
	// 따라서 Abs2를 상속받는 경우 getA도 구현해야한다.
}

class Normal extends Abs2 {
	
	@Override
	int getA() {
		return a;
	}
	
	@Override
	int getB() {
		return b;
	}
}

public class AbstractEx1 {
	public static void main(String[] args) {
		Normal n = new Normal();
		System.out.println(n.a);
		System.out.println(n.getA());
		System.out.println(n.b);
		System.out.println(n.getB());
		
		Abs2 a2 = n;
		System.out.println(a2.a);
		System.out.println(a2.getA());
		System.out.println(a2.b);
		System.out.println(a2.getB());
		
		Abs1 a1 = a2;
		System.out.println(a1.a);
		System.out.println(a1.getA());
//		System.out.println(a1.b);
//		System.out.println(a1.getB());
		
		Object o = a1;
//		System.out.println(o.a);
//		System.out.println(o.getA());
//		System.out.println(o.b);
//		System.out.println(o.getB());
	}
}
