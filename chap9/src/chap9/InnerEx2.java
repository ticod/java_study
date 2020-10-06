/*
 * 
 */
package chap9;

class Outer2 {
	private int outeriv = 10;
	private static int outercv = 20;
	class InstanceInner {
		int iiv = outeriv;
		int iiv2 = outercv;
	}
	static class StaticInner {
//		int siv = outeriv; // error: 클래스 멤버가 객체화되지 않은 인스턴스 멤버에 접근
		int siv = new Outer2().outeriv;
		static int scv = outercv;
	}
	void method(int pv) {
		// jdk5 : method(final int pv)
		// pv : method(int) 메서드의 지역 변수
		int num = pv;
//		num+=20;
		// num : method(int) 메서드의 지역 변수
		class LocalInner {
			int liv = outeriv;
			int liv2 = outercv;
			void method() {
				/*
				 * 지역 내부 클래스에서 사용되는 메서드의 지역 변수는 상수화 되어야 한다. (매개 변수 포함)
				 * 이 때, 지역 변수의 변경이 없는 경우 상수로 본다.
				 *        지역 변수의 변경이 있는 경우 변수로 본다 => error 발생
				 */
				System.out.println("pv=" + pv);
				System.out.println("num=" + num);
				System.out.println("liv=" + liv);
				System.out.println("liv2=" + liv2);
				System.out.println("outeriv=" + outeriv);
				System.out.println("outercv=" + outercv);
			}
		}
//		pv++;	// 상수화 X -> 에러
//		num++;	// 상수화 X -> 에러
		LocalInner lc = new LocalInner();
		lc.liv++;
		lc.liv2++;
		outeriv++;
		outercv++;
		lc.method();
	}
}

public class InnerEx2 {
	public static void main(String[] args) {
		new Outer2().method(5);
		
		Outer2.InstanceInner inner1 = new Outer2().new InstanceInner();
		System.out.println(inner1.iiv);
		System.out.println(inner1.iiv2);
		
		Outer2.StaticInner inner2 = new Outer2.StaticInner();
		System.out.println(inner2.siv);
		System.out.println(Outer2.StaticInner.scv);
		
		new Outer2().method(5);
	}
}
