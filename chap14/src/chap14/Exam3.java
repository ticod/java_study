/*
 * Predicate 인터페이스를 활용,
 * 1 ~ 100까지 임의의 수 10개를 배열에 저장
 * 그 중 짝수, 홀수를 구분하여 출력,
 * 짝수의 합, 홀수의 합을 출력하는 프로그램 작성
 */
package chap14;

import java.util.Random;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class Exam3 {
	
	private static int[] arr = new int[10];
	
	public static void main(String[] args) {
		Predicate<Integer> p = (t) -> {
			for (int i : arr) {
				if (i == t) {
					return false;
				}
			}
			return true;
		};
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new Random().nextInt(100) + 1;
			if (p.test(arr[i])) {
				i--;
			}
		}
		
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		System.out.print("짝수의 합: ");
		numList(arr, t->t%2==0);
		System.out.print("홀수의 합: ");
		numList(arr, t->t%2!=0);
	}
	
	private static void numList(int[] array, IntPredicate p) {
		StringBuilder sb = new StringBuilder();
		int sum = 0;
		for (int i : array) {
			if (p.test(i)) {
				sb.append(i + "+");
				sum += i;
			}
		}
		System.out.println(sb.deleteCharAt(sb.length()-1).toString() + "=" + sum);
	}
}
