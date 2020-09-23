/*
 * 생성자 예제
 *   생성자: 객체화시 호출되는 메서드
 *   * 생성자 없이 객체 생성은 불가 *
 *   생성자 주요 기능: 인스턴스 변수의 초기화
 *   	=> 메모리 할당은 new 예약어가 한다.
 *   
 * 기본 생성자
 *   클래스 내부에 생성자를 구현하지 않으면, 컴파일러가 자동으로 추가해주는 생성자
 *   public 클래스명() {}
 *   
 * 생성자 구현
 *   1. 생성자의 이름 = 클래스 명
 *   2. 리턴 타입 X (void 기술하지 않는다)
 *   	=> 클래스 명(){} 이와 같이 구현
 *   
 */
package chap6;

class Number1 {
	int num;
	// 기본 생성자 제공
}

class Number2 {
	int num;
	Number2 (){}
	Number2 (int x) { // 생성자 (구현했으므로 기본 생성자 제공 안됨)
		num = x;
	}
}

public class ConstructorEx1 {
	public static void main(String[] args) {
		Number1 n1 = new Number1();			// 객체화
		Number2 n2 = new Number2(20);		// 객체화
//		(클래스 명) (참조변수 명) = new (생성자);
		/*
		 * new 예약어 기능
		 * 1. 메모리 할당 (힙 영역)
		 * 2. 기본값 초기화, 명시적 초기화 (ex. int a = 10)
		 * 		숫자: 0, 논리: false, 참조: null
		 * 3. 생성자 호출 (스택) (Number1(), Number2(20))
		 * 
		 * 		String 클래스만 대입 연산자로 객체 생성이 가능,
		 * 		모든 클래스는 new를 통해 객체 생성을 해야한다.
		 * 
		 * 모든 클래스는 생성자를 갖고,
		 * 객체 생성은 불가할 수도 있는데 이를 생성자로 막을 수 있다.
		 */
		System.out.println(n1.num);
		System.out.println(n2.num);
	}
}
