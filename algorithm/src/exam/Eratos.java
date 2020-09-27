/*
 * 에라토스테네스의 체
 */
package exam;

import java.util.Scanner;

public class Eratos {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("구하고 싶은 소수의 범위를 입력 (1 ~ x): ");
		int len = scan.nextInt();
		
		long startTime = System.currentTimeMillis();
		solution(len);
		long endTime = System.currentTimeMillis();
		long time = endTime - startTime;
		System.out.println("\n수행 시간: " + time + "(밀리초)");
	}
	
	
	public static void solution(int len) {
		Boolean[] result = new Boolean[len + 1]; // 0은 제외
		for(int k = 1; k <= len; k++) {
			result[k] = true;
		}
		
		// 아마도 제일 최적화?
		for(int i = 2; i*i <= len; i++) {
			if(result[i]) {
				for(int j = i*i; j <= len; j+=i) result[j] = false;
				// i * i 미만의 수 (i * n (n은 i보다 작음)) 은 이미 다른 소수에 의해 지워졌으므로
				// i * i 부터 지움.
			}
		}
		
		// 112 ms
//		int i = 2;
//		while(i <= len) {
//			if(!result[i]) {
//				for(int j = i + i; j <= len; j+=i) result[j] = true;
//			}
//			i++;
//		}
		// ******
		
		for(int k = 1; k <= len; k++) {
			if(result[k])
				System.out.printf("%6d", k);
		}
	}
}
