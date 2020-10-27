/*
 * Function - Java API FunctionalInterface 3
 * apply() : 매개변수 O, return O
 * 매개 값을 리턴 값으로 매핑(변환)할 때 사용
 */
package chap14;

import java.util.function.Function;
import java.util.function.ToIntFunction;

class Student {
	
	private String name;
	private int eng;
	private int math;
	private String major;
	
	public Student(String name, int eng, int math, String major) {
		this.name = name;
		this.eng = eng;
		this.math = math;
		this.major = major;
	}
	
	public String getName() {return name;}
	public String getMajor() {return major;}
	public int getEng() {return eng;}
	public int getMath() {return math;}
	
}

public class LambdaEx8 {
	
	private static Student[] list = {
			new Student("홍길동", 90, 80, "경영"),
			new Student("김삿갓", 95, 70, "컴공"),
			new Student("이몽룡", 85, 75, "통계")
	};
	
	public static void main(String[] args) {
		System.out.println("학생의 이름: ");
		for (Student s : list) {
			System.out.println(s.getName() + ", ");
		}
		System.out.println();
		
		System.out.println("학생의 이름: ");
		printString(t->t.getName());
		
		System.out.println("전공의 이름: ");
		printString(t->t.getMajor());
		
		System.out.println("수학 점수: ");
		printString(t->t.getMath()+"");
		
		System.out.println("영어 점수: ");
		printString(t->t.getMath()+"");
		
		System.out.println("학생 이름과 영어 점수: ");
		printString(t->t.getName() + "(" + t.getEng() + ")");
		
		System.out.println("학생 이름과 수학 점수: ");
		printString(t->t.getName() + "(" + t.getMath() + ")");
		
		System.out.println("학생들의 영어 점수 합계: ");
		printTotal(t->t.getEng());
	}
	
	private static void printString(Function<Student, String> f) {
		for (Student s : list) {
			System.out.println(f.apply(s) + ", ");
		}
		System.out.println();
	}
	
//	private static void printTotal(Function<Student, Integer> f) {
//		int sum = 0;
//		for (Student s : list) {
//			sum += f.apply(s);
//		}
//		System.out.println(sum);
//	}
	
	private static void printTotal(ToIntFunction<Student> f) {
		int sum = 0;
		for (Student s : list) {
			sum += f.applyAsInt(s);
		}
		System.out.println(sum);
	}
}
