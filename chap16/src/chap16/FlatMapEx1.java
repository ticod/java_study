/*
 * flatMap 예제 : 구조를 아예 바꾸는데 사용한다
 */
package chap16;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class FlatMapEx1 {
	public static void main(String[] args) {
		List<String> list1 = Arrays.asList(
				"자바 8 버전에 ", "추가된 스트림을 ", "열심히 공부하자"
		);
		list1.stream()
			.flatMap(data -> Arrays.stream(data.split(" ")))
			.forEach(System.out::println);
		
		List<String> list2 = Arrays.asList(
				"10,20,30", "40,50,60"
		);
		list2.stream()
			.flatMap(data -> Arrays.stream(data.split(",")))
			.mapToInt(Integer::parseInt)
			.forEach(System.out::println);
		
		IntStream isr = list2.stream()
							.flatMapToInt(data -> {
								String[] strArr = data.split(",");
								int[] intArr = new int[strArr.length];
								for (int i = 0; i < strArr.length; i++) {
									intArr[i] = Integer.parseInt(strArr[i].trim());
								}
								return Arrays.stream(intArr);
							});
//		isr.forEach(System.out::println);
//		System.out.println("전체 합: " + isr.sum());
//		System.out.println("요소 건수: " + isr.count());
		System.out.println("요소 평균: " + isr.average().getAsDouble());
	}
}
