/*
 * 예외 재발생 시키기 : 예외가 발생된 메서드에서 예외 처리 후
 *                      호출한 메서드에 발생된 예외를 전달할 수 있다.
 */
package chap10;

public class ExceptionEx8 {
	public static void main(String[] args) throws Exception {
		try {
			badmethod();
		} catch(Exception e) {
			System.out.println("badmethod : " + e.getMessage());
			try {
				Thread.sleep(1000);
			} catch(InterruptedException ie) {
				System.out.println(ie.getMessage());
			}
		}
	}
	private static void badmethod() throws Exception {
		try {
			throw new Exception("예외 강제 발생");
		} catch(Exception e) {
			System.out.println("badmethod : " + e.getMessage());
			throw e;
		}
	}
}
