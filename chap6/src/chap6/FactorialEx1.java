/*
 * 재귀 함수 : Recursive Call
 * 			자기 자신의 함수 다시 호출하는 함수
 * 
 * ex) XML파싱
 * 
 * 스택에 함수가 계속 쌓이므로
 * 너무 많은 함수를 호출시 스택 오버플로우가 일어날 수 있다.
 */
package chap6;

// 아래 소스 작동됨
//class Factorial {
//	int factorial(int i) {
//		return (i == 1) ? 1 : i * factorial(i-1);
//	}
//}

public class FactorialEx1 {
	public static void main(String[] args) { // 클래스 멤버
		System.out.println("4! = " + factorial(4));
	}

	private static int factorial(int i) { // 클래스 멤버
		// static이 없다면 메인 메서드에서 factorial 메서드 호출 불가능
		return (i == 1) ? 1 : i * factorial(i-1);
	}
}
