
/*2. 숫자를 입력받아 소수인지 판별하는 프로그램 작성하기*/

package p200921;

import java.util.Scanner;

public class Pr02 {
	public static void main(String[] args) {
		System.out.println("숫자를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		
		for(int i = 2; i*i <= input; i++) {
			if(input % i == 0) {
				System.out.println("소수가 아닙니다.");
				return;
			}
		}
		
		System.out.println("소수입니다.");
	}
}
