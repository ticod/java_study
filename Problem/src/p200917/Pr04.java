/*
4. 화면에 삼각형 높이를 입력받고, 높이에 맞는 *로 삼각형 출력하기

[결과]
삼각형의 높이를 입력하세요
3

  *
 **
***
 */
package p200917;

import java.util.Scanner;

public class Pr04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int height = 0;

		System.out.println("삼각형의 높이를 입력하세요");
		height = scan.nextInt();

		for (int i = 1; i <= height; i++) {
			for (int j = 0; j < height - i; j++) {
				System.out.print(" ");
			}
			for (int j = height - i; j < height; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		
		// 배열 풀이 (굳이 배열에 안집어넣고 바로 출력해도 됨)
		char[][] result = new char[height][height];
		//  0.0  1.0  2.0
		//  0.1  1.1  2.1
		//  0.2  1.2  2.2
		for(int i = 0; i < height; i++) {
			for(int j = 0; j < height; j++) {
				if(i + j < height - 1) result[i][j] = ' ';
				else result[i][j] = '*';
			}
		}
		for(int i = 0; i < height; i++) {
			for(int j = 0; j < height; j++) {
				System.out.print(result[i][j]);
			}
			System.out.println();
		}
	}
}
