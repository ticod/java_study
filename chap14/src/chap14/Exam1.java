/*
 * LambdaEx3의 LambdaInterface3 인터페이스를 이용하여
 * 람다 방식으로 1~N까지의 합 출력
 */
package chap14;

public class Exam1 {
	public static void main(String[] args) {
		LambdaInterface3 f = a -> {
			int sum = 0;
			for (int i = 0; i <= a; i++) {
				sum += i;
			}
			System.out.println(sum);
		};
		f.method(4);
		f.method(10);
		f.method(100);
	}
}
