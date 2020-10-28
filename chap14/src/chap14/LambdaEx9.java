/*
 * Operator - Java API FunctionalInterface 4
 * apply() : 매개변수 O, return O
 *   Function 인터페이스의 하위 인터페이스
 *   매개 변수 존재, 리턴 값 존재 => 매개 변수와 리턴 값의 자료형이 같다
 *   보통 매개값 연산 후 그 결과를 리턴할 때 사용
 */
package chap14;

import java.util.function.DoubleBinaryOperator;
import java.util.function.IntBinaryOperator;

public class LambdaEx9 {
	
	private static Student[] list = {
			new Student("홍길동", 90, 80, "경영"),
			new Student("김삿갓", 95, 70, "컴공"),
			new Student("이몽룡", 85, 75, "통계")
	};
	
	public static void main(String[] args) {
		System.out.print("최대 수학점수: ");
		System.out.println(maxOrMinMath((a,b)->(a>=b)?a:b));
		
		System.out.print("최소 수학점수: ");
		System.out.println(maxOrMinMath((a,b)->(a<=b)?a:b));
		
		System.out.print("최대 영어점수: ");
		System.out.println(maxOrMinEng((a,b)->(a>=b)?a:b));
		
		System.out.print("최소 영어점수: ");
		System.out.println(maxOrMinEng((a,b)->(a<=b)?a:b));
		
		System.out.print("최대 평균: ");
		System.out.println(maxOrMinAvg((a,b)->(a>=b)?a:b));
		
		System.out.print("최소 평균: ");
		System.out.println(maxOrMinAvg((a,b)->(a<=b)?a:b));
	}
	
	private static int maxOrMinMath(IntBinaryOperator op) {
		int result = list[0].getMath();
		for (Student s : list) {
			result = op.applyAsInt(result,  s.getMath());
		}
		return result;
	}
	
	private static int maxOrMinEng(IntBinaryOperator op) {
		int result = list[0].getEng();
		for (Student s : list) {
			result = op.applyAsInt(result,  s.getEng());
		}
		return result;
	}
	
	private static double maxOrMinAvg(DoubleBinaryOperator op) {
		double result = (list[0].getEng() + list[0].getMath()) / 2.0;
		for (Student s : list) {
			result = op.applyAsDouble(result,  (s.getEng() + s.getEng()) / 2.0);
		}
		return result;
	}
}
