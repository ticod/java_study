package chap3;
/*
 * 산술 연산자(이항 연산자) : +, -, *, /, %
 *   /(나누기) : 정수 = 정수 / 정수 : 1 = 3 / 2
 *   %(나머지) : 정수 = 정수 % 정수 : 1 = 3 % 2
 */
public class OpEx4 {
	public static void main(String[] args) {
		System.out.println(10/8);	// 1
		System.out.println(10/-8);	// -1
		System.out.println(-10/8);	// -1
		System.out.println(-10/-8);	// 1
		/*
		 * 나누기 연산
		 * 부호가 같으면 양수,
		 * 부호가 다르면 음수
		 */
		System.out.println(10%8);	// 2
		System.out.println(10%-8);	// 2
		System.out.println(-10%8);	// -2
		System.out.println(-10%-8);	// -2
		/*
		 * 나머지 연산
		 * 피제수(나누어지는 수)의 부호를 따름
		 */
	}
}
