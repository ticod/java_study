/*
5.화면에 삼각형 높이를 입력받고, 높이에 맞는 *로 삼각형 출력하기

[결과]
삼각형의 높이를 입력하세요
3

  *
 ***
*****
 */
package p200917;

import java.util.Scanner;

public class Pr05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int height = 0;

		System.out.println("삼각형의 높이를 입력하세요");
		height = scan.nextInt();

		for (int i = 1; i <= height; i++) {
			for (int j = 0; j < height - i; j++) {
				System.out.print(" ");
			}
			for (int j = height - i; j < height + i - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// 선생님 풀이
		// 전체 삼각형의 크기(가로, 세로)를 정해놓고, 규칙에 맞는 부분에 별을 집어 넣는다
		// 훨씬 소스가 보기 좋고 이해하기 좋은듯
		int bottom = height * 2 - 1;
		int m = bottom / 2;
		for(int i = 0; i < height; i++) {
			for(int j = 0; j < bottom; j++) {
				if(j >= m - i && j <= m + i) {
					System.out.print('*');
				} else {
					System.out.print(' ');
				}
			}
			System.out.println();
		}
	}
}
