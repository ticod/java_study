/*
 * Stream 정렬 - sorted()
 * -> Comparator 인터페이스를 매개변수로 받을 수 있다.
 */
package chap16;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class SortedEx1 {
	public static void main(String[] args) {
		List<String> list =
				Arrays.asList("홍길동", "김삿갓", "이몽룡", "임꺽정");
		
		System.out.println("정렬하기");
		list.stream().sorted().forEach(System.out::println);
		System.out.println();
		
		System.out.println("역순으로 정렬하기");
		list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	}
}
