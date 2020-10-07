/*
 * Object 클래스 - toString() => 객체의 문자열 반환
 *   => 참조변수값을 출력하면 자동으로 호출되는 method
 *   => 기본적으로 클래스명@16진수해시코드 return
 *   => 객체의 내용을 출력하기 위해서는 overriding해서 사용한다
 */
package chap11;

class ToString {
	int value;
	ToString(int value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "value=" + value;
	}
}

public class ToStringEx1 {
	public static void main(String[] args) {
		ToString t1 = new ToString(10);
		ToString t2 = new ToString(10);
		System.out.println(t1);
		System.out.println(t2);
	}
}
