/*
 * 1부터 100까지의 임의의 수 100개를 IntStream에 저장
 * 총합, 평균, 짝수의 평균, 홀수의 평균, 짝수의 개수, 홀수의 개수 출력
 * 단, Random 클래스 활용
 */
package chap16;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class Exam2 {
	public static void main(String[] args) {
		int[] arr = new Random().ints(100, 0, 101).toArray();
		System.out.println("총합: " + Arrays.stream(arr).sum());
		System.out.println("평균: " + Arrays.stream(arr).average().getAsDouble());
		System.out.println("짝수의 평균: " + IntStream.of(arr).filter(i -> i % 2 == 0).average().getAsDouble());
		System.out.println("홀수의 평균: " + IntStream.of(arr).filter(i -> i % 2 != 0).average().getAsDouble());
		System.out.println("짝수의 개수: " + IntStream.of(arr).filter(i -> i % 2 == 0).count());
		System.out.println("홀수의 개수: " + IntStream.of(arr).filter(i -> i % 2 != 0).count());
		System.out.println("중복된 수를 제외한 수의 개수: " + IntStream.of(arr).distinct().count());
		
		System.out.println("가장 큰 수: " + IntStream.of(arr).distinct().max().getAsInt());
		System.out.println("가장 작은 수: " + IntStream.of(arr).distinct().min().getAsInt());
		System.out.println("가장 큰 짝수: " + IntStream.of(arr).filter(i -> i % 2 == 0).max().getAsInt());
		System.out.println("가장 작은 짝수: " + IntStream.of(arr).filter(i -> i % 2 == 0).min().getAsInt());
	}
}
