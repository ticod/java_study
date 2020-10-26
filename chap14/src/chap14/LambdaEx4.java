/*
 * 
 * 리턴 타입, 매개 변수 모두 가질 경우
 * 구문이 한 줄일 경우 중괄호 + return 생략 가능
 */
package chap14;

@FunctionalInterface
interface LambdaInterface4 {
	int method(int x, int y);
}

public class LambdaEx4 {
	public static void main(String[] args) {
		LambdaInterface4 f = (x, y)->{
			return x*y;
		};
		System.out.println("두 수의 곱: " + f.method(2, 5));
		f = (x, y) -> x + y;
		System.out.println("두 수의 합: " + f.method(2, 5));
		f = (x, y) -> x - y;
		System.out.println("두 수의 차: " + f.method(2, 5));
		f = (x, y) -> x % y;
		System.out.println("두 수를 나눈 나머지: " + f.method(2, 5));
		f = (x, y) -> (x > y)? x : y;
		System.out.println("두 수 중 큰 수: " + f.method(2, 5));
		f = (x, y) -> (x < y)? x : y;
		System.out.println("두 수 중 작은 수: " + f.method(2, 5));
	}
}
