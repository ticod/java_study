/*
 * 내부 클래스(이너 클래스)
 *   인스턴스 내부 클래스 : 클래스 멤버를 가질 수 없다. 단 상수는 가능
 *   static 내부 클래스 : 클래스 멤버를 가질 수 있다.
 *   지역(local) 내부 클래스 : 메서드 내부에서 선언된 클래스,
 *                            선언된 메서드 내부에서만 사용 가능
 *                            
 * (내부 인터페이스도 가능하다.)
 *   
 * 내부 클래스의 특징
 *   1. 클래스 내부에 존재하는 클래스
 *   2. 자료형으로 사용. 객체화 가능. Object 클래스의 하위 클래스
 *      => 멤버 소유 가능, 생성자 구현 가능
 *   3. 외부 클래스의 멤버임
 *      => 외부클래스의 private 멤버에 접근 가능
 *   4. 외부 클래스(Outer Class)의 객체화가 이루어져야 내부 클래스의 객체화가 가능하다.
 *   5. 내부 클래스도 하나의 바이트코드(Outer$Inner.class)로 만들어진다.
 *      - 이 때 로컬 이너 클래스의 경우 앞에 번호가 붙는다. (Outer$1LocalInner.class)
 *        같은 이름을 가진 다른 클래스가 존재할 수 있기 때문
 *      - 익명 클래스의 경우 번호만 붙는다. (Outer$1.class)
 *   
 */
package chap9;

class Outer1 {
	class InstanceInner {
		int iv = 100;
//		static int cv = 10;
		// static 멤버 불가
		final static int MAX = 200;
		// 단, static 상수는 가능
	}
	static class StaticInner {
		int iv = 300;
		static int cv = 400;
		final static int MAX = 500;
	}
	void method() {
		class LocalInner {
			int iv = 600;
//			static int cv = 700;
			// static 멤버 (클래스 멤버) 불가
			final static int MAX = 800;
			// 단, static 상수는 가능
		}
		LocalInner lc = new LocalInner(); // 로컬 클래스 객체화
		System.out.println("local 내부 클래스 iv 변수: " + lc.iv);
		System.out.println("local 내부 클래스 MAX 상수: " + LocalInner.MAX);
	}
	
	void method2() {
//		LocalInner lc2 = new LocalInner();
		// method() 내부에서 선언되었기 때문에
		// LocalInner는 method() 내부에서만 선언 가능
	}
}

public class InnerEx1 {
	public static void main(String[] args) {
		Outer1 o = new Outer1();
		o.method();
		Outer1.InstanceInner ii1 = o.new InstanceInner();
		
		// 아래와 같이 객체화
		Outer1.InstanceInner inner1 = new Outer1().new InstanceInner();
		Outer1.StaticInner   inner2 = new Outer1.StaticInner();
		
		System.out.println("InstanceInner 클래스의 iv: "  + inner1.iv);
		System.out.println("InstanceInner 클래스의 MAX: " + inner1.MAX); // warning : 객체(인스턴스)로 클래스 멤버 접근
		System.out.println("InstanceInner 클래스의 MAX: " + Outer1.InstanceInner.MAX);
		
		System.out.println("StaticInner 클래스의 iv: "  + inner2.iv);
		System.out.println("StaticInner 클래스의 cv: "  + Outer1.StaticInner.cv);
		System.out.println("StaticInner 클래스의 MAX: " + Outer1.StaticInner.MAX);
		
		if(inner1 instanceof Object)
			System.out.println("inner1 객체는 Object 객체다"); // O
		if(inner2 instanceof Object)
			System.out.println("inner2 객체는 Object 객체다"); // O
	}
}
