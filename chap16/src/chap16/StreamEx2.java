/*
 * Stream 예제
 */
package chap16;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class Student {
	
	private String name;
	private int eng;
	private int math;
	
	Student(String name, int eng, int math) {
		this.name = name;
		this.eng = eng;
		this.math = math;
	}

	public int getEng() {
		return eng;
	}

	public int getMath() {
		return math;
	}

	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return String.format("name:%s, eng:%d, math:%d", name, eng, math);
	}
}

public class StreamEx2 {
	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
				new Student("홍길동", 60, 70),
				new Student("김삿갓", 65, 55),
				new Student("이몽룡", 80, 75),
				new Student("임꺽정", 85, 65)
		);
		Stream<Student> st = list.stream();
		st.forEach(s -> {
			System.out.print(s);
			int sum = s.getEng() + s.getMath();
			double avg = sum / 2.0;
			System.out.printf(", 총점:%4d, 평균=%.2f\n", sum, avg);
		});
		System.out.println();
		
		System.out.println("객체 출력");
//		st.forEach(s->System.out.println(s)); // ==> IllegalStateException 발생!
		list.stream().forEach(s->System.out.println(s));
		/*
		 * Stream은 일회용이다 *
		 * 하지만 성능이 굉장히 좋다. -> 대용량 데이터 처리에 사용하기 좋다
		 */
		System.out.println();
		
		System.out.print("수학 점수 총점: ");
		System.out.println(list.stream().mapToInt(Student::getMath).sum());
		System.out.print("영어 점수 총점: ");
		System.out.println(list.stream().mapToInt(Student::getEng).sum());
		/*
		 * mapToInt : Stream => IntStream형으로 변환!
		 * Student::getMath == s->s.getMath() 
		 */
	}
}
