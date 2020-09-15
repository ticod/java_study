package chap3;
/*
 * 비트 연산자 : &, |, ^, ~
 *   & : AND
 *   | : OR
 *   ^ : XOR
 *   ~ : NOT
 */
public class OpEx6 {
	public static void main(String[] args) {
		System.out.println("6 & 3 = " + (6 & 3));		// 2
		/*
		 * (정확히는 32bit(int)로 계산됨)
		 * 6 : 0000 0110
		 * 3 : 0000 0011
		 * =============
		 * & : 0000 0010
		 */
		System.out.println("6 | 3 = " + (6 | 3));		// 7
		/*
		 * 6 : 0000 0110
		 * 3 : 0000 0011
		 * =============
		 * | : 0000 0111
		 */
		System.out.println("6 ^ 3 = " + (6 ^ 3));		// 5
		/*
		 * 6 : 0000 0110
		 * 3 : 0000 0011
		 * =============
		 * ^ : 0000 0101
		 */
		System.out.println("~10 = " + (~10));			// -11
		/*
		 * 10 : 0000 1010
		 * ==============
		 * ~  : 1111 0101
		 * 음수 = 2의 보수 표현 = 1의 보수 + 1
		 * 
		 */
		
		System.out.println("true & false = " + (true & false));	// false
		System.out.println("true | false = " + (true | false));	// true
		System.out.println("true ^ false = " + (true ^ false));	// true
		System.out.println("!true = " + (!true));					// false
	}
}
