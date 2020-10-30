/*
 * flatMap 예제 2 : 리스트 병합
 */
package chap16;

import java.util.*;

public class FlatMapEx2 {
	public static void main(String[] args) {
		List<Student> list1 = Arrays.asList(
				new Student("홍길동", 70, 80),
				new Student("장길동", 75, 70)
		);
		List<Student> list2 = Arrays.asList(
				new Student("김삿갓", 90, 88),
				new Student("김길동", 95, 75)
		);
		List<List<Student>> list = new ArrayList<>();
		list.add(list1);
		list.add(list2);
		
		list.stream().flatMap(s -> s.stream())
			.forEach(System.out::println);
	}
}
