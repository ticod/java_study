/*
 * 접근 제한자
 *   private < (default) < protected < public
 *   
 * 상속시에는 넓은 범위로 오버라이딩 가능
 *   
 * class : (default), public
 * 변수, 상수, 메서드 : 모든 접근 제한자
 * 생성자 : 모든 접근 제한자
 *   생성자가 private인 경우 : 객체는 해당 클래스 내에서만 만들 수 있다.
 *   ex) class Math => 메서드는 static, 생성자는 private
 */
package chap7;

import chap7.test.Modifier2;

class Modifier {
	private int v1 = 100; // 동일 클래스 내에서만 접근 허용
			int v2 = 200;
	protected int v3 = v1;
	public void method() {
		System.out.println("chap7.Modifier 클래스의 method()");
		System.out.println("v1=" + v1);
		System.out.println("v2=" + v2);
	}
}

class Modifier3 extends Modifier2 {
	public void method() {
//		System.out.println("v1=" + v1); // private
//		System.out.println("v2=" + v2); // (default)
		System.out.println("v3=" + v3); // protected
		System.out.println("v4=" + v4); // public
	}
}

public class ModifierEx1 {
	public static void main(String[] args) {
		Modifier m1 = new Modifier();
//		System.out.println(m1.v1);
		/* v1 접근시 에러 발생
		 * => private
		 */
		System.out.println(m1.v2);
		m1.method();
		// 해당 객체의 method에서는 접근이 가능하다.
		
		Modifier2 m2 = new Modifier2();
//		System.out.println(m2.v1); // private  	=> 같은 클래스
//		System.out.println(m2.v2); // (default) => 같은 패키지
//		System.out.println(m2.v3); // protected => 상속 관계
		System.out.println(m2.v4); // public
		// 다른 패키지의 경우 public만 접근 가능
		System.out.println(m2);
		
		Modifier3 m3 = new Modifier3();
//		System.out.println(m3.v1); // private
//		System.out.println(m3.v2); // (default)
//		System.out.println(m3.v3); // protected
		System.out.println(m3.v4); // public
		m3.method();
		
//		Math m = new Math(); // is not visible
		// 생성자가 private이기 때문에 오류 발생
	}
}
