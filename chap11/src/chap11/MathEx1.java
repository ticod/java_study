/**
 * Math 클래스 : 수치 계산 기능
 *               모든 메서드 : static, 생성자 : private
 *               상수        : PI - 원주율
 *                             E  - 자연로그
 *               
 */
package chap11;

public class MathEx1 {
	public static void main(String[] args) {
		
		// abs : 절대값
		System.out.println("Math.abs(5)     = " + Math.abs(5));
		System.out.println("Math.abs(-5)    = " + Math.abs(-5));
		System.out.println("Math.abs(3.14)  = " + Math.abs(3.14));
		System.out.println("Math.abs(-3.14) = " + Math.abs(-3.14));
		System.out.println();
		
		// 근사정수 = 가까운 정수
		// ceil  : 더 큰 수중 가까운 수 	(올림)
		// floor : 더 작은 수중 가까운 수 	(내림)
		// rint  : 가까운 수 				(반올림)
		System.out.println("Math.ceil(5.4)   = " + Math.ceil(5.4));
		System.out.println("Math.ceil(-5.4)  = " + Math.ceil(-5.4));
		System.out.println("Math.floor(5.4)  = " + Math.floor(5.4));
		System.out.println("Math.floor(-5.4) = " + Math.floor(-5.4));
		System.out.println("Math.rint(5.4)   = " + Math.rint(5.4));
		System.out.println("Math.rint(-5.4)  = " + Math.rint(-5.4));
		System.out.println();
		
		// min, max : 최소, 최대값
		System.out.println("Math.min(5, 4)     = " + Math.min(5, 4));
		System.out.println("Math.min(5.4, 5.3) = " + Math.min(5.4, 5.3));
		System.out.println("Math.max(5, 4)     = " + Math.max(5, 4));
		System.out.println("Math.max(5.4, 5.3) = " + Math.max(5.4, 5.3));
		System.out.println();
		
		// round : 반올림
		System.out.println("Math.round(5.4) = " + Math.round(5.4));
		System.out.println("Math.round(5.5) = " + Math.round(5.5));
		System.out.println();
		
		// random : 난수
		System.out.println("Math.random() = " + Math.random());
		System.out.println();
		
		// sin, cos, tan : 삼각함수
		System.out.println("Math.sin(Math.PI/2)          = " + Math.sin(Math.PI/2));
		System.out.println("Math.cos(Math.toRadians(60)) = " + Math.cos(Math.toRadians(60)));
		System.out.println("Math.sin(Math.PI/4)          = " + Math.tan(Math.PI/4));
		System.out.println("Math.toDegrees(Math.PI/2)    = " + Math.toDegrees(Math.PI/2));
		System.out.println();
		
		// log : 지수함수
		System.out.println("Math.log(Math.E)         = " + Math.log(Math.E));
		System.out.println("Math.log(32)/Math.log(2) = " + Math.log(32)/Math.log(2));
		System.out.println();
		
		// sqrt : 제곱근 / pow(a, n) : 제곱 (a의 n제곱)
		System.out.println("Math.sqrt(25)  = " + Math.sqrt(25));
		System.out.println("Math.pow(5, 3) = " + Math.pow(5, 3));
		System.out.println();
	}
}
