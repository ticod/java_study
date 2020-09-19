/*
3. 2차원 배열을 이용하여 모래시계 출력하기
[결과]

 길이를 홀수로 입력하세요
 5
*****     // 0,1 0,2 0,3 / 1,2    -    4,1 4,2 4,3 / 3,2
 ***
  *
 ***
***** 
 */
package p200918;

import java.util.Scanner;

public class Pr03 {
	public static void main(String[] args) {
		System.out.println("길이를 홀수로 입력하세요");
		
		Scanner scan = new Scanner(System.in);
		int len = scan.nextInt();
		
		// *로 초기화
		char[][] result = new char[len][len];
		for(int i = 0; i < len; i++) {
			for(int j = 0; j < len; j++) {
				result[i][j] = '*';
			}
		}
		
		// 빈칸 찾아서 채우기
		for(int i = 0; i < len / 2; i++) {
			for(int j = i+1; j < len - i - 1; j++) {
				result[j][i] = ' ';
				result[j][i + (len-1) - (i * 2)] = ' ';
			}
		}
		
		// 출력
		for(int i = 0; i < len; i++) {
			for(int j = 0; j < len; j++) {
				System.out.print(result[i][j]);
			}
			System.out.println();
		}
	}
}
