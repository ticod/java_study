/*
 * sorted() 예제 - 클래스 스트림 정렬
 */
package chap16;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Student2 implements Comparable<Student2> {
	private String studno;
	private String name;
	private int grade;
	
	Student2(String studno, String name, int grade) {
		this.studno = studno;
		this.name = name;
		this.grade = grade;
	}
	
	public String getStudno() {
		return studno;
	}

	public String getName() {
		return name;
	}

	public int getGrade() {
		return grade;
	}

	@Override
	public String toString() {
		return String.format("studno=%s, name=%s, grade=%d", studno, name, grade);
	}
	
	@Override
	public int compareTo(Student2 s) {
		return this.studno.compareTo(s.studno);
	}
}

public class SortedEx2 {
	public static void main(String[] args) {
		List<Student2> list = Arrays.asList(
				new Student2("1000", "홍길동", 1),
				new Student2("1234", "김삿갓", 2),
				new Student2("3456", "이몽룡", 3),
				new Student2("1001", "임꺽정", 4)
		);
		
		System.out.println("학번 순 정렬");
		list.stream().sorted()
		.forEach(System.out::println);
		
		System.out.println("학번 역순 정렬");
		list.stream().sorted(Comparator.reverseOrder())
		.forEach(System.out::println);
		
		System.out.println("이름 순 정렬");
		list.stream().sorted((s1, s2) -> s1.getName().compareTo(s2.getName()))
		.forEach(System.out::println);
		
		System.out.println("학년 순 정렬");
		list.stream().sorted((s1, s2) -> s1.getGrade() - s2.getGrade())
		.forEach(System.out::println);
		
		System.out.println("학년 역순 정렬");
		list.stream().sorted((s1, s2) -> s2.getGrade() - s1.getGrade())
		.forEach(System.out::println);
	}
}
