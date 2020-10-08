/*
 * 예외가 여러 개 일 경우
 * 다중 catch 구문
 *   - 한 개의 try 블럭에 여러 개의 catch 블럭이 존재
 *   - 여러 개의 예외가 발생 가능한 경우 예외 별로 처리 가능
 *   - 상위 예외 클래스는 catch 구문의 하단에 배치해야 한다. (ex. Exception은 최하단에)
 *     (부모 객체)
 *   - 
 */
package chap10;

public class ExceptionEx3 {
	public static void main(String[] args) {
		try {
			String str = null;
			System.out.println(Integer.parseInt("abd"));
			System.out.println(str.charAt(1));
			System.out.println(10/0);
			System.out.println(args[0]);
		} catch (ArithmeticException e) {
			System.out.println("0으로 나누지 마세요");
			System.out.println(e);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("command 라인에 파라미터를 입력하세요");
			System.out.println(e);
		} catch (NumberFormatException e) {
			System.out.println("숫자만 입력하세요");
			System.out.println(e);
		} catch (Exception e) { // 모든 예외는 Exception으로 형변환이 가능하다.
			// Exception은 항상 맨 아래에 있어야한다.
			System.out.println("전산부로 전화 요망: 1234");
			e.printStackTrace();
		}
		System.out.println("프로그램 종료");
	}
}
