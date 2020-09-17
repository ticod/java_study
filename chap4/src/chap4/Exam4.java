/*
 * 1부터 100까지의 짝수의 합 구하기
 */
package chap4;

public class Exam4 {
	public static void main(String[] args) {
		// solve 1
		int sum = 0;
		for(int i = 2; i <= 100; i+=2)
			sum += i;
		System.out.println("1부터 100까지 짝수의 합: " + sum);
		
		// solve 2
//		int sum = 0;
//		for(int i = 0; i <= 100; i++)
//			if(i % 2 == 0)
//				sum += i;
//		System.out.println("1부터 100까지 짝수의 합: " + sum);
	}
}
