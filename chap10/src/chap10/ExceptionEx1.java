package chap10;

public class ExceptionEx1 {
	public static void main(String[] args) {
		try {
			System.out.println(args[0]);
			/*
			 * JVM에서 예외를 처리
			 */
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("command 라인에 값을 입력하세요");
		}
		System.out.println("프로그램 종료");
	}
}