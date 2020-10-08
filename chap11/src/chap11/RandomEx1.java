/*
 * Random 클래스 : 난수 발생 클래스
 *   1. 자료형 별로 난수 발생
 *          nextInt() : 정수형 난수
 *          nextInt(n) : 0 <= x < n 정수형 난수
 *          nextDouble() : 0 <= x < 1.0 실수형 난수
 *          nextBoolean() : true / false
 *   2. seed값 설정 가능
 */
package chap11;

import java.util.Random;

public class RandomEx1 {
	public static void main(String[] args) {
		Random rand = new Random();
		rand.setSeed(1);
		Random rand2 = new Random();
		rand2.setSeed(System.currentTimeMillis());
		/*
		 * seed값이 같으면 나오는 난수 역시 같다. (난수의 고정이 가능하다)
		 * 또한 시간을 seed로 줘서 항상 다른 난수를 얻을 수 있다.
		 * 
		 * System.currentTimeMillis() 
		 *		: 1970년 시작부터 현재까지의 시간을 ms로 리턴
		 */
		
		System.out.print("rand  ==> ");
		for(int i = 0; i < 5; i++) {
			System.out.print(i + " : " + rand.nextInt(100) + " / ");
		}
		System.out.println();
		
		System.out.print("rand2 ==> ");
		for(int i = 0; i < 5; i++) {
			System.out.print(i + " : " + rand2.nextInt(100) + " / ");
		}
		System.out.println();
	}
}
