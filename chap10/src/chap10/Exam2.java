/*
 * 한 줄만 변경하여 컴파일 오류 없애기
 */
package chap10;

class MyException1 extends RuntimeException {
	MyException1(String msg) {
		super(msg);
	}
}

// 수정 전
//class MyException1 extends Exception {
//	MyException1(String msg) {
//		super(msg);
//	}
//}

public class Exam2 {
	public static void main(String[] args) {
		method();
	}
	private static void method() {
		throw new MyException1("Exam2.method() 예외 강제 발생");
	}
}
