/*
 * 입력받은 숫자가 좌우대칭수인지 판단하기
 * 숫자를 입력하세요
 * 121 
 * 좌우대칭수
 * 1212
 * 좌우대칭수아님
 */
package p200925;

import java.util.Scanner;

public class Exam10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num = scan.nextInt();
		
		if(isSymmetry(num)) {
			System.out.println("좌우대칭수");
		} else {
			System.out.println("좌우대칭수아님");
		}
	}
	public static boolean isSymmetry(int num) {
		return false;
	}
}
