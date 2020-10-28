/*
2. IntBinaryOperator 인터페이스와 IntPredicate 인터페이스를 이용하여
배열에 저장된 짝수,홀수별 최대 숫자와 최소 숫자를 출력하는 프로그램 완성하기

import java.util.function.IntBinaryOperator;
import java.util.function.IntPredicate;

public class Test2 {

	private static int[] arr = new int[10];
	
	public static void main(String[] args) {
		for(int i=0; i<arr.length; i++) {
			arr[i]= (int)(Math.random()*100)+1;
			System.out.print(arr[i]+",");
		}
		System.out.println();
		System.out.println("홀수 최대값:"+maxOrMin());
		System.out.println("짝수 최대값:"+maxOrMin());
		System.out.println("홀수 최소값:"+maxOrMin());
		System.out.println("짝수 최소값:"+maxOrMin());
	}

	private static int maxOrMin(IntBinaryOperator op, IntPredicate p) {
		
	}
}
 */
package p201028;

import java.util.Arrays;
import java.util.function.IntBinaryOperator;
import java.util.function.IntPredicate;

public class Test2 {

	private static int[] arr = new int[10];
	
	public static void main(String[] args) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 100) + 1;
			System.out.print(arr[i] + ",");
		}
		System.out.println();
		System.out.println("홀수 최대값:" + 
				maxOrMin((t, f) -> (t >= f) ? t : f, (t) -> t % 2 != 0));
		System.out.println("짝수 최대값:" + 
				maxOrMin((t, f) -> (t >= f) ? t : f, (t) -> t % 2 == 0));
		System.out.println("홀수 최소값:" + 
				maxOrMin((t, f) -> (t <= f) ? t : f, (t) -> t % 2 != 0));
		System.out.println("짝수 최소값:" + 
				maxOrMin((t, f) -> (t <= f) ? t : f, (t) -> t % 2 == 0));
		
		/* Use Stream */
		System.out.println();
		System.out.println("홀수 최대값:" + 
				maxOrMinStream((t, f) -> (t >= f) ? t : f, (t) -> t % 2 != 0));
		System.out.println("짝수 최대값:" + 
				maxOrMinStream((t, f) -> (t >= f) ? t : f, (t) -> t % 2 == 0));
		System.out.println("홀수 최소값:" + 
				maxOrMinStream((t, f) -> (t <= f) ? t : f, (t) -> t % 2 != 0));
		System.out.println("짝수 최소값:" + 
				maxOrMinStream((t, f) -> (t <= f) ? t : f, (t) -> t % 2 == 0));
	}

	private static int maxOrMin(IntBinaryOperator op, IntPredicate p) {
		int result = 0;
		for (int number : arr) {
			if (p.test(number)) {
				result = number;
				break;
			}
		}
		for (int number : arr) {
			if (p.test(number)) {
				result = op.applyAsInt(result, number);
			}
		}
		return result;
	}
	
	private static int maxOrMinStream(IntBinaryOperator op, IntPredicate p) {
		int min = 0, max = 1;
		return (op.applyAsInt(min, max) == max) 
				? Arrays.stream(arr).filter(p).max().getAsInt()
				: Arrays.stream(arr).filter(p).min().getAsInt();
	}
}
