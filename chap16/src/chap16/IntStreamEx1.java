/*
 * IntStream 예제
 *   int형 값들의 모임
 */
package chap16;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntStreamEx1 {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		System.out.println("Arrays.stream 메서드를 이용하여 IntStream 생성하기");
		IntStream is1 = Arrays.stream(arr);
//		is1.forEach(i->System.out.print(i));
		is1.forEach(System.out::print); // 메서드 참조, 위와 동일
		System.out.println();
		/*
		 * Stream.forEach(Consumer)
		 *   : forEach method는 Consumer를 매개변수로 갖는다.
		 *   Cousumer interface : 매개 변수 O, return X
		 */
		
		IntStream is2 = IntStream.of(arr);
		is2.forEach(System.out::print);
		System.out.println();
		
		IntStream is3 = IntStream.range(1, 5); // 배열 X, 1 ~ (5 - 1)까지 IntStream으로 만든다.
		is3.forEach(System.out::print);
		System.out.println();
		
		IntStream is4 = IntStream.rangeClosed(1, 5);
		is4.forEach(System.out::print);
		System.out.println();
		
		System.out.println("1~100까지의 합: " + IntStream.range(1, 101).sum());
		System.out.println("1~100까지의 짝수 합: " + IntStream.range(1, 101).filter(i -> i % 2 == 0).sum());
		System.out.println("1~100까지의 홀수 합: " + IntStream.range(1, 101).filter(i -> i % 2 != 0).sum());
		
		System.out.println("1~100까지의 숫자의 개수: " + IntStream.range(1, 101).count());
		System.out.println("1~100까지의 짝수의 개수: " + IntStream.range(1, 101).filter(i -> i % 2 == 0).count());
		System.out.println("1~100까지의 홀수의 개수: " + IntStream.range(1, 101).filter(i -> i % 2 != 0).count());
		
		System.out.println("1~100까지의 평균: " + IntStream.range(1, 101).average().getAsDouble());
	}
}
