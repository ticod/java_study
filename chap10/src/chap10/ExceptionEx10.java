/*
 * 예외 상속의 상속
 */
package chap10;

class MyException2 extends Exception{}
class MyException3 extends MyException2{}

public class ExceptionEx10 {
	public static void main(String[] args) {
		try {
			throw new MyException3();
		} catch (MyException2 e) {
			System.out.println("MyException2 예외처리");
		} catch (Exception e) {
			System.out.println("Exception 예외처리");
		}
	}
}
