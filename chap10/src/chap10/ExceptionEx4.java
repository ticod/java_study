/*
 * finally
 */
package chap10;

public class ExceptionEx4 {
	public static void main(String[] args) {
		try {
			System.out.println(1);
			System.out.println(2/0);
			System.out.println(3);
		} catch (Exception e) {
			System.out.println(4);
			return; // return을 하지만 finally 구문은 실행된다.
		} finally {
			System.out.println(5);
		}
		System.out.println(6);
		// catch 구문에서 return을 하기 때문에 실행되지 않는다.
	}
}
