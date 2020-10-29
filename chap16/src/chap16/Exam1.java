/*
 * IntStream 문제
 * 
 * 1부터 100까지 임의의 수 100개를 IntStream에 저장하고,
 * 저장된 수의 총합, 평균, 짝수의 평균, 홀수의 평균,
 * 짝수의 개수, 홀수의 개수 출력
 */
package chap16;

import java.util.Random;
import java.util.stream.IntStream;

public class Exam1 {
	public static void main(String[] args) {
		int[] arr = new int[10];
		for (int i = 0; i < 10; i++) {
			arr[i] = new Random().nextInt(10) + 1;
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("저장된 수의 총합: " + IntStream.of(arr).sum());
		System.out.println("저장된 수의 평균: " + IntStream.of(arr)
														.average()
														.getAsDouble());
		System.out.println("저장된 수 중 짝수의 평균: " + IntStream.of(arr)
																.filter(i -> i % 2 == 0)
																.average()
																.getAsDouble());
		System.out.println("저장된 수 중 홀수의 평균: " + IntStream.of(arr)
																.filter(i -> i % 2 != 0)
																.average()
																.getAsDouble());
		System.out.println("저장된 수 중 짝수의 개수: " + IntStream.of(arr)
																.filter(i -> i % 2 == 0)
																.count());
		System.out.println("저장된 수 중 홀수의 개수: " + IntStream.of(arr)
																.filter(i -> i % 2 != 0)
																.count());
		System.out.println("저장된 수 중 중복된 수를 제외한 개수: " + IntStream.of(arr)
																			.distinct()
																			.count());
	}
}
