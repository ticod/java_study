package chap3;
/*
 * Shift 연산자 : 비트 이동 연산자
 * 속도가 가장 빠른 연산자
 *   >>, << : 각각 오른쪽, 왼쪽으로 비트를 밀고 부호 비트로 넘어간 부분을 채운다.
 *   >>>    : 밀고, 넘어간 부분을 0으로 채워넣는다.
 */
public class OpEx7 {
	public static void main(String[] args) {
		// 양수
		System.out.println("8 << 2 : " + (8 << 2));
		/*
		 * (정확히는 32bit(int)로 계산됨)
		 * 8   : 0000 1000
		 * <<2 : 0010 0000 - 최상위 2비트는 사라지고, 부호 비트(양수 : 0)로 채워넣는다.
		 */
		System.out.println("8 >> 2 : " + (8 >> 2));
		/*
		 * 8   : 0000 1000
		 * >>2 : 0000 0010 - 최하위 2비트는 사라지고, 부호 비트(양수 : 0)로 채워넣는다.
		 */
		System.out.println("8 >>> 2 : " + (8 >>> 2));
		/*
		 * 8    : 0000 1000
		 * >>>2 : 0000 0010 - 최하위 2비트는 사라지고, 0으로 채워넣는다.
		 */
		
		// 음수
		System.out.println("-8 << 2 : " + (-8 << 2));
		/*
		 * -8  : 1111 1000
		 * >>2 : 1110 0000 - 최상위 2비트는 사라지고, 부호 비트(음수 : 1)로 채워넣는다.
		 */
		System.out.println("-8 >> 2 : " + (-8 >> 2));
		/*
		 * -8  : 1111 1000
		 * >>2 : 1111 1110 - 최상위 2비트는 사라지고, 부호 비트(음수 : 1)로 채워넣는다.
		 */
		System.out.println("-8 >>> 2 : " + (-8 >>> 2));
		/*
		 * -8   : 1111 1000
		 * >>>2 : 0011 1110 - 최상위 2비트는 사라지고, 0으로 채워넣는다.
		 */
		
		System.out.println(Integer.toBinaryString(-8 >>> 2));
	}
}