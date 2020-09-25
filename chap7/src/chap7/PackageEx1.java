/*
 * 패키지 예제
 * 
 * package
 *   클래스들의 모임
 *   클래스의 이름은 패키지 이름을 포함한다.
 *   package 설정은 파일의 첫 줄에 한 번만 가능하다.
 *     => 자바 파일 하나의 모든 클래스는 같은 패키지에 속한 클래스다.
 *     
 * import : 클래스 이름의 패키지 명을 생략할 수 있도록 미리 사용될 클래스의 이름을 선언
 *          (=> C언어의 include와는 다르다)
 * 
 * 클래스의 패키지명을 생략할 수 있는 경우
 *   1. 같은 패키지에 속한 클래스 (= 파일 하나의 모든 클래스도 같은 패키지에 속하므로 생략 가능)
 *   2. java.lang 패키지에 속한 클래스들은 패키지 명을 생략 가능함
 *      Ex) String, System
 *   3. import 구문으로 설정된 클래스는 패키지명을 생략 가능함.
 *   
 */
package chap7;

import java.util.Date;
//import chap7.test.Pack2;

class Pack1 {
	void method() {
		System.out.println("chap7.pack1 클래스의 method() 메서드");
	}
}

public class PackageEx1 {
	public static void main(String[] args) {
		java.util.Date today = new java.util.Date();
		System.out.println(today);
		Date today2 = new Date();
		Pack1 p = new Pack1();
		p.method();
		
//		Pack2 p2 = new Pack2();
//		Pack2는 같은 패키지에 속한 클래스가 아니므로 오류가 난다.
//		import chap2.test.Pack2와 같이 import를 해주거나
//		아래와 같이 사용한다.
		chap7.test.Pack2 p2 = new chap7.test.Pack2();
		p2.method();
		
	}
}
