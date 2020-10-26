/*
 * 
 */
package chap14;

@FunctionalInterface
interface LambdaInterface5 {
	int iv = 30;
	void method();
}

class Outer {
	public int iv = 10;
	void method() {
		int iv = 20;
		LambdaInterface5 f = ()->{
			System.out.println("Outer.this.iv: " + Outer.this.iv);
			System.out.println("this.iv: " + this.iv);
			/*
			 * 함수 인터페이스에서 this.iv로 외부 객체의 멤버 변수에 접근이 가능하다.
			 * 기존 inner class에서는 this.iv로는 inner class의 iv에만 접근이 가능했다
			 */
			System.out.println("iv: " + iv);
		};
		f.method();
	}
}

public class LambdaEx5 {
	public static void main(String[] args) {
		new Outer().method();
	}
}
