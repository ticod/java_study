/*
 * try ~ catch : 예외 처리 - 예외를 안에서 처리
 * throws 구문 : 예외 처리 - JVM에게 예외 처리를 요청 - 예외를 다른 메서드에 전달
 * 
 * RuntimeException의 예외처리는 생략이 가능하다.
 */
package chap10;

public class ExceptionEx5 {
	public static void main(String[] args) throws Exception {
		// main throws RuntimeException가 생략
		try {
			first();
		} catch(Exception e) {
			System.out.println("숫자만 가능합니다.");
			e.printStackTrace();
		}
		first();
	}
	private static void first() throws Exception {
		System.out.println("first 메서드");
		second();
	}
	private static void second() throws Exception {
		System.out.println("second 메서드");
		// NumberFormatException 예외 발생
		System.out.println(Integer.parseInt("abc"));
	}
}
