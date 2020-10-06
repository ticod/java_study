/*
 * throw : 예외 발생
 */
package chap10;

public class ExceptionEx7 {
	public static void main(String[] args) {
		try {
			throw new Exception("예외 강제 발생");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
