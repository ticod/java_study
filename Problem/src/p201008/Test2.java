/*
 * int getRand(f, t) 함수 구현하기
 * 
 * f ~ t 또는 t ~ f 범위의 난수 발생 (f, t 포함)
 * f는 t보다 클 수도, 작을 수도 있음
 */
package p201008;

import java.util.Random;

public class Test2 {
	public static void main(String[] args) {
		for (int i = 0; i < 20; i++) {
			System.out.print(getRand(1, -3) + ",");
		}
		System.out.println();
		for (int i = 0; i < 20; i++) {
			System.out.print(getRand(-1, 3) + ",");
		}
	}
	private static int getRand(int f, int t) {
		int bigAbs = Math.abs(Math.max(f, t));
		int smallAbs = Math.abs(Math.min(f, t));
		return new Random().nextInt(bigAbs + smallAbs + 1) - smallAbs;
	}
}
