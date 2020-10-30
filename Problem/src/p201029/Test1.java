/*
1. 1부터 100까지의 정수형 임의의 난수 100개를 저장하고,
   그중 소수인 숫자의 목록과, 갯수를 출력하기
   Random 클래스를 이용
 */
package p201029;

import java.util.Arrays;
import java.util.Random;
import java.util.function.IntPredicate;

public class Test1 {
	public static void main(String[] args) {
		int[] arr = new Random()
				.ints(100, 1, 101)
				.toArray();
		
		IntPredicate primeFilter = (n) -> {
			if (n == 1) return false;
			for (int i = 2; i * i <= n; i++) {
				if (n % i == 0) {
					return false;
				}
			}
			return true;
		};
		
		System.out.print("소수 목록: [ ");
		Arrays.stream(arr)
			.filter(primeFilter)
			.forEach(i -> System.out.print(i + " "));
		System.out.println("]");
		
		System.out.println("소수의 갯수: " + 
				Arrays.stream(arr)
					.filter(primeFilter)
					.count());
		
		// forEach() : 최종 단계 반복자 - 반환 값이 void
		// peek() : 중간 단계 반복자 - 반환 값이 IntStream
		System.out.print("소수 목록 : ");
		long count = Arrays.stream(arr)
				.filter(primeFilter)
				.peek(s -> System.out.print(s + " ")).count();
		System.out.println("\n소수의 갯수: " + count);
	}
}
