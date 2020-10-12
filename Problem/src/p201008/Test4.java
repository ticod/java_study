/*
4. 다음의 결과가 나오도록 Student 클래스 구현하기

[결과]
이름:성춘향, 국어:95, 영어=95, 수학=80, 총점:270
이름:김삿갓, 국어:95, 영어=65, 수학=80, 총점:240
이름:이몽룡, 국어:55, 영어=65, 수학=90, 총점:210
이름:홍길동, 국어:70, 영어=60, 수학=70, 총점:200
 */
package p201008;

import java.util.Arrays;

class Student implements Comparable<Student> {
	String name;
	int kor, eng, math;
//	int sum;
	
	Student(String name, int kor, int eng, int math){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
//		sum = kor + eng + math;
	}
	
	@Override
	public String toString() {
		return String.format("이름:%s, 국어:%d, 영어:%d, 수학:%d, 총점:%d",
							name, kor, eng, math, getTotal());
	}
	
	@Override
	public int compareTo(Student o) {
		return o.getTotal() - getTotal(); // 내림차순
	}
	
	/*
	 * 위 sum 변수를 사용할 경우
	 * 다른 변수 값들이 변할 때
	 * 총점값이 변하지 않기 때문에
	 * 이처럼 처리하는 것이 좋아보임.
	 */
	public int getTotal() {
		return kor + eng + math;
	}
}

public class Test4 {
	public static void main(String[] args) {
		Student[] arr = {
				new Student("홍길동", 70, 60, 70),
				new Student("이몽룡", 55, 65, 90),
				new Student("김삿갓", 95, 65, 80),
				new Student("성춘향", 95, 95, 80)
		};

		Arrays.sort(arr);
		for (Student s : arr)
			System.out.println(s);
	}
}
