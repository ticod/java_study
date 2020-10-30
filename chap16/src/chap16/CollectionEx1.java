/*
 * stream -> Collection
 */
package chap16;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionEx1 {
	public static void main(String[] args) {
		Student[] stuArr = {
				new Student("홍길동", 60, 75),
				new Student("김삿갓", 80, 65),
				new Student("이몽룡", 90, 85),
				new Student("이자바", 60, 85)
		};
		
		// stream -> List
		/* Stream.of(ARRAY) : ARRAY를 stream으로 변환
		 * Arrays.stream(ARRAY)와 동일 */
		List<String> names = Stream.of(stuArr)
				.map(s -> s.getName())
				.collect(Collectors.toList());
		System.out.println(names);
		
		// stream -> Array
		/* Class::method - 메서드 참조
		 * Student[]::new - 생성자 참조 */
		Student[] stuArr2 = Stream.of(stuArr)
				.toArray(Student[]::new);
		for (Student s : stuArr2) {
			System.out.println(s);
		}
		
		// 이름 : key로 하는 map 객체로 저장 <String, Student>
		Map<String, Student> map = Stream.of(stuArr)
				.collect(Collectors.toMap(s -> s.getName(),  s -> s));
		for (String k : map.keySet()) {
			System.out.println(k + " - " + map.get(k));
		}
	}
}
