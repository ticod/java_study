/*
 * map method : 스트림의 요소를 치환
 */
package chap16;

import java.util.*;

public class MapEx1 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList(
				"홍길동전", "춘향전", "구운몽", "전우치전"
		);
		
		list.stream().mapToInt(String::length)
			.forEach(s -> System.out.print(s + " "));
		System.out.println();
		
		List<Student> list2 = Arrays.asList(
				new Student("홍길동", 80, 95),
				new Student("이몽룡", 90, 75),
				new Student("김삿갓", 75, 70)
		);
		// 영어 점수 목록 출력
		list2.stream().mapToInt(Student::getEng)
			.forEach(s -> System.out.print(s + " "));
		System.out.println();
		
		// 수학 점수 목록 출력
		list2.stream().mapToInt(Student::getMath)
			.forEach(s -> System.out.print(s + " "));
		System.out.println();
		
		// 합계 점수 목록 출력
		list2.stream().mapToInt(i -> i.getMath() + i.getEng())
			.forEach(s -> System.out.print(s + " "));
		System.out.println();
		
	}
}
