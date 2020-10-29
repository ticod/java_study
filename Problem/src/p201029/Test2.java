/*
2. 화면에서 정수를 입력받아 
   입력된 숫자까지의 합, 짝수의 합, 홀수의 합을 구하는 프로그램 작성하기
   IntStream.rangeClosed 메서드 이용
 */
package p201029;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Test2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 입력: ");
		int input = scan.nextInt();
		System.out.println();
		
		System.out.println(input + "까지의 합: " +
				IntStream.rangeClosed(0, input)
					.sum()
		);
		System.out.println(input + "까지의 짝수 합: " +
				IntStream.rangeClosed(0, input)
					.filter(i -> i % 2 == 0)
					.sum()
		);
		System.out.println(input + "까지의 홀수 합: " +
				IntStream.rangeClosed(0, input)
					.filter(i -> i % 2 != 0)
					.sum()
		);
	}
}
