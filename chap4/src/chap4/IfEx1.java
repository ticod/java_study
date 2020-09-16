/*
 * if 조건문 예제
 * 
 * if(조건식) {
 * 		실행문, 실행문, ... <= 조건식의 결과가 참인 경우 실행
 * } else {
 * 		실행문, 실행문, ... <= 조건식의 결과가 거짓인 경우 실행
 * }
 */
package chap4;

import java.util.Scanner;

public class IfEx1 {
	public static void main(String[] args) {
		System.out.println("점수를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		if(score >= 60) {
			System.out.println("합격을 축하합니다.");
		} else {
			System.out.println("불합격 입니다.");
		}
	}
}
