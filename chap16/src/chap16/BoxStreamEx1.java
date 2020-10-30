/*
 * boxed() method : IntStream => Stream<Integer>
 */
package chap16;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class BoxStreamEx1 {
	public static void main(String[] args) {
		int arr[] = {10, 20, 30, 40, 50, 60};
		System.out.println("IntStream => Stream<Integer>");
		
		/* int는 기본 자료형이라서, Object의 method를 사용할 수 없다.
		 * 즉, Integer형으로 바뀐 것을 확인 가능 */
		Arrays.stream(arr).boxed()
			.forEach(i -> System.out.println(i.hashCode()));
		
		/* 다시 IntStream으로 변경하여 sum() 출력 */
		Integer arr2[] = {10, 20, 30, 40, 50, 60};
		System.out.println(Arrays.stream(arr2).mapToInt(a -> a.intValue()).sum());
		
		/* long, double stream으로 변경 */
		Arrays.stream(arr).asLongStream()
		.forEach(i -> System.out.println(i));
		Arrays.stream(arr).asDoubleStream()
		.forEach(i -> System.out.println(i));
	}
}
