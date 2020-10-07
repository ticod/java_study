/*
 * String class 예제 : String class의 특징
 */
package chap11;

public class Exam2 {
	public static void main(String[] args) {
		String str = "ABC123";
		System.out.println("main : " + str);
		str = change(str); // String 클래스 이용시 주의사항
		/*
		 * String 객체는 immutable이기 때문에
		 * change(str)만으로는 기존 str에 영향을 끼칠 수 없다.
		 * 따라서 반환 값을 전달해줘서 바꿔야한다.
		 */
		System.out.println("[change] main : " + str);
	}
	private static String change(String str) {
		str += "456";
		System.out.println("[change] : " + str);
		return str;
	}
}
