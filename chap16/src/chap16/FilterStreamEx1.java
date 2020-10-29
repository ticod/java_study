/*
 * FilterStream 예제
 */
package chap16;

import java.util.Arrays;
import java.util.List;

public class FilterStreamEx1 {
	public static void main(String[] args) {
		List<String> list = Arrays
				.asList("홍길동", "김삿갓", "홍길동", "임꺽정", "홍길동", "김자바", "박자바");
		
		// 1. list 객체 -> stream 객체로 변경 후, 중복 없이 요소 출력
		list.stream().distinct().forEach(System.out::println);
		System.out.println();
		
		// 2. 성이 홍씨인 이름 출력
		list.stream().filter(s -> s.startsWith("홍")).forEach(System.out::println);
		System.out.println();
		
		// 3. 성이 홍씨인 이름 중 동명이인 제외하고 출력
		list.stream().filter(s -> s.startsWith("홍")).distinct().forEach(System.out::println);
		System.out.println();
		
		// 4. 이름이 자바인 이름 출력
		list.stream().filter(s -> s.endsWith("자바")).forEach(System.out::println);
		System.out.println();
		
		// 5. 이름이 자바인 사람의 명 수 출력
		System.out.println(list.stream().filter(s -> s.endsWith("자바")).count());
		System.out.println();
	}
}
