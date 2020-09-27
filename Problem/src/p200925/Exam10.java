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
		String str = scan.next();
		int num = Integer.parseInt(str);
		
		// String으로 체크
		if(isSymmetry(str)) {
			System.out.println("좌우대칭수");
		} else {
			System.out.println("좌우대칭수아님");
		}
		
		// int로 체크
		if(isSymmetry(num)) {
			System.out.println("좌우대칭수");
		} else {
			System.out.println("좌우대칭수아님");
		}
	}
	
	// String으로 체크
	public static boolean isSymmetry(String str) {
		int i = 0;
		for(i = 0; i < str.length()/2; i++) {
			if(str.charAt(i) != str.charAt(str.length()-i-1))
				break;
		}
		
		if(i == str.length()/2) 	return true;
		else						return false;
	}
	
	// int로 체크
	public static boolean isSymmetry(int num) {
		int[] arr = new int[10];
		
		int len = 0;
		while(num > 0) {
			arr[len++] = num % 10;
			num /= 10;
		}
		
		int i = 0;
		for(i = 0; i < len/2; i++) {
			if(arr[i] != arr[len - i - 1])
				break;
		}
		
		if(i == len/2) 	return true;
		else			return false;
	}
}
