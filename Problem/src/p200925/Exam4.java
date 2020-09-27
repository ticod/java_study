/*
 * command 라인에서 숫자 n을 입력받아 n숫자보다 작은 
 * 소수(primary number)의 갯수를 구하기
 * int =Integer.parseInt(args[0])
 * 
 * [결과]
 * 1,2,3,5,7,11,13,17,19
 * 20숫자까지의 소수의 갯수:9
 */
package p200925;

import java.util.Scanner;

public class Exam4 {
	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		int range = scan.nextInt();
		int range = Integer.parseInt(args[0]);
		int cnt = 0;

		boolean[] pri = new boolean[range + 1];
		for (int i = 1; i <= range; i++) {
			pri[i] = true;
		}

		for (int i = 2; i * i <= range; i++) {
			if (pri[i]) {
				for (int j = i * i; j <= range; j += i) {
					pri[j] = false;
				}
			}
		}

		for (int i = 1; i <= range; i++) {
			if (pri[i]) {
				System.out.print(((i == 1) ? "" : ",") + i);
				cnt++;
			}
		}
		System.out.println();
		System.out.println(range + "숫자까지 소수의 개수:" + cnt);
	}
}
