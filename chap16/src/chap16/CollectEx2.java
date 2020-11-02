/*
 * 
 */
package chap16;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Student3 {
	String name;
	boolean isMale;
	int grade;
	int ban;
	int score;
	
	Student3(String name, boolean isMale, int grade, int ban, int score) {
		this.name = name;
		this.isMale = isMale;
		this.grade = grade;
		this.ban = ban;
		this.score = score;
	}

	String getName() {
		return name;
	}

	boolean isMale() {
		return isMale;
	}

	int getGrade() {
		return grade;
	}

	int getBan() {
		return ban;
	}

	int getScore() {
		return score;
	}
	
	@Override
	public String toString() {
		return String.format("[%s,%s,%d학년,%d반,%3d점]", 
				name, (isMale) ? "남" : "여", grade, ban, score);
	}
	
	enum Level {
		HIGH, MID, LOW
	}
}

public class CollectEx2 {
	public static void main(String[] args) {
		Student3[] stuArr = {
				new Student3("나자바", true, 1, 1, 300),
				new Student3("김자바", false, 1, 1, 250),
				new Student3("김홍도", false, 1, 2, 200),
				new Student3("남홍도", true, 1, 2, 150),
				new Student3("강호동", true, 2, 1, 300),
				new Student3("백창현", false, 2, 1, 250),
				new Student3("김삿갓", false, 2, 2, 200),
				new Student3("남미리", true, 2, 2, 150),
				new Student3("김기현", false, 2, 3, 300),
				new Student3("최현석", true, 2, 3, 270),
		};
		System.out.println("1. 성별로 분할");
		Map<Boolean, List<Student3>> stuByGender = Stream.of(stuArr)
				.collect(Collectors.partitioningBy(Student3::isMale));
		stuByGender.forEach((k, v) -> System.out.println("key: " + k + " value" + v));
		System.out.println("남자 --");
		for (Student3 s : stuByGender.get(true)) {
			System.out.println(s);
		}
		System.out.println("여자 --");
		for (Student3 s : stuByGender.get(false)) {
			System.out.println(s);
		}
		
		System.out.println("2. 성별로 분할 + 학생 수 출력");
		Map<Boolean, Long> stuNumByGender = Stream.of(stuArr)
				.collect(Collectors.partitioningBy(Student3::isMale, Collectors.counting()));
		System.out.println("남학생 수: " + stuNumByGender.get(true));
		System.out.println("여학생 수: " + stuNumByGender.get(false));
		
		System.out.println("3. 성별로 분할 + 학생 수 출력");
		Map<Boolean, Optional<Student3>> stuScoreByGender = Stream.of(stuArr)
				.collect(Collectors.partitioningBy(Student3::isMale, Collectors.maxBy(Comparator.comparingInt(Student3::getScore))));
		/*
		 * Comparator : interface
		 * 즉, comparingInt는 static 메서드로, jdk8 이전에는 default 메서드와 static를 가질 수 없으므로
		 * jdk8 이전 버전에선 사용이 불가능!
		 */
		System.out.println("남학생 1등: " + stuScoreByGender.get(true).get());
		// Optional 객체이므로 get() 메서드로 가져온다.
		System.out.println("여학생 1등: " + stuScoreByGender.get(false).get());
	}
}
