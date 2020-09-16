/*
 * 10부터 99사이의 두 자리 자연수를 입력 받아 입력된 수보다 크거나 같은 10의 배수를 구하기
 * 10의 배수에서 입력된 수를 뺀 값을 출력하기
 * [결과]
 * 10부터 99사이의 두 자리 자연수를 입력하세요
 * 24
 * 30 - 24 = 6
 * 
 * 10부터 99사이의 두 자리 자연수를 입력하세요
 * 20
 * 20 - 20 = 0
 */
package chap3;

import java.util.Scanner;

public class Exam7 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("10부터 99사이의 두 자리 자연수를 입력하세요");
		int num = scan.nextInt();
		int result = 10 * (num / 10 + ((num % 10 == 0) ? 0 : 1));
		System.out.println(result + " - " + num + " = " + (result - num));
	}
}
