/*
 * Predicate - Java API FunctionalInterface 5
 *   test() - 매개변수 boolean, 매개 변수 O
 *   
 */
package chap14;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.DoubleSupplier;
import java.util.function.Function;
import java.util.function.IntSupplier;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaEx10 {
	
	private static List<Student> list = Arrays.asList(
			new Student("홍길동", 55, 90, "경영"),
			new Student("이몽룡", 95, 90, "컴공"),
			new Student("김삿갓", 75, 80, "심리"),
			new Student("임꺽정", 65, 70, "전자"),
			new Student("성춘향", 65, 0, "컴공")
	);
	
	public static void main(String[] args) {
		System.out.println("영어점수 60이상인 학생의 영어 평균: " +
				avgEng(t -> t.getEng()>=60));
		System.out.println("영어점수 60이상인 학생의 영어 평균: " +
				avgInt(t -> t.getEng()>=60, t -> t.getEng())); // Function interface
		System.out.println("영어점수 60이상인 학생의 영어 평균: " +
				myTestFunctionToAvg(t -> t >= 60, t -> t.getEng())); // Function interface
		
		System.out.println("수학점수 60이상인 학생의 수학 평균: " +
				avgMath(t -> t.getMath()>=60));
		
		System.out.println("컴공과 학생들의 수학 평균: " +
				avgMath(t -> t.getMajor().equals("컴공")));
		
		System.out.println("컴공과가 아닌 학생들의 수학 평균: " +
				avgMath(t -> !t.getMajor().equals("컴공")));
		
		System.out.print("컴공과 학생들의 이름 출력: ");
		nameList(t -> t.getMajor().equals("컴공"));
		
		System.out.print("컴공과가 아닌 학생들의 이름 출력: ");
		nameList(t -> !t.getMajor().equals("컴공"));
	}
	
	private static double avgEng(Predicate<Student> p) {
		int sum = 0, cnt = 0;
		for (Student s : list) {
			if (p.test(s)) {
				sum += s.getEng();
				cnt++;
			}
		}
		return (double)sum/cnt;
	}
	
	private static double avgInt(Predicate<Student> p, Function<Student, Integer> su) {
		int sum = 0, cnt = 0;
		for (Student s : list) {
			if (p.test(s)) {
				sum += su.apply(s);
				cnt++;
			}
		}
		return (double)sum/cnt;
	}
	
	private static double myTestFunctionToAvg(Predicate<Integer> p, Function<Student, Integer> su) {
		int sum = 0, cnt = 0;
		for (Student s : list) {
			if (p.test(su.apply(s))) {
				sum += su.apply(s);
				cnt++;
			}
		}
		return (double)sum/cnt;
	}
	
	private static double avgMath(Predicate<Student> p) {
		int sum = 0, cnt = 0;
		for (Student s : list) {
			if (p.test(s)) {
				sum += s.getMath();
				cnt++;
			}
		}
		return (double)sum/cnt;
	}
	
	private static void nameList(Predicate<Student> p) {
		StringBuilder sb = new StringBuilder();
		for (Student s : list) {
			if (p.test(s)) {
				sb.append(s.getName() + ",");
			}
		}
		System.out.println(sb.deleteCharAt(sb.length() - 1).toString());
	}
}
