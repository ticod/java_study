/*
 * Student 클래스 구현하기
 * 1. 멤버 변수 : 학번(studno), 이름(name), 전공(major)
 * 2. 멤버 메서드 : 학생 정보를 출력하도록 toString 오버라이딩
 * 3. 학번과 이름이 같은 경우 같은 학생으로 인식
 * 4. 구동 클래스에 맞도록 생성자 구현
 */
package chap15;

import java.util.HashSet;
import java.util.Set;

class Student {
	String studno, name, major;
	Student(String studno, String name, String major) {
		this.studno = studno;
		this.name = name;
		this.major = major;
	}
	@Override
	public String toString() {
		return String.format("학번:%s, 이름:%s, 전공:%s", studno, name, major);
	}
	@Override
	public boolean equals(Object o) {
		if(o instanceof Student) {
			Student s = (Student)o;
			return this.name.equals(s.name) &&
					this.studno.equals(s.studno);
		}
		return false;
	}
	@Override
	public int hashCode() {
		return studno.hashCode() + name.hashCode();
	}
}

public class Exam2 {
	public static void main(String[] args) {
		Set<Student> set = new HashSet<>();
		set.add((new Student("1234", "홍길동", "경영")));
		set.add((new Student("2345", "홍길순", "경영")));
		set.add((new Student("2345", "홍길순", "컴공")));
		set.add((new Student("1234", "홍길동", "통계")));
		set.add((new Student("4567", "홍길동", "경영")));
		System.out.println("등록 학생 수: " + set.size());
		System.out.println("등록 학생");
		for(Student s : set) System.out.println(s);
	}
}
