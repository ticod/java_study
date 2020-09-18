/*
6. 화면에 삼각형 높이를 입력받고, 높이에 맞는 *로 삼각형 출력하기

[결과]
배열 크기를 홀수로 입력하세요
5

*****
 ***
  *
 ***
*****
 */
package p200917;

import java.util.Scanner;

public class Pr06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int height = 0;

		System.out.println("삼각형의 높이를 입력하세요");
		height = scan.nextInt();

		for (int i = 0; i < height / 2 + 1; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < height - (i * 2); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 1; i <= height / 2; i++) {
			for (int j = 0; j < (height / 2) - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i * 2 + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// 선생님 풀이
		for(int i = 0; i <= height / 2; i++) {
			for(int j = 0; j < height - i; j++) {
				if(j < i)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
		}
		for(int i = height / 2 + 1; i < height; i++) {
			for(int j = 0; j <= i; j++) {
				if(j >= height - i - 1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		// 반복문 하나로?
		for(int i = 0; i < height; i++) {
			for(int j = 0; j < height; j++) {
				if(i + j >= height - 1 && i >= half && j <= i)
					System.out.print('*');
				else if(i + j <= height - 1 && i < half  && j >= i)
					System.out.print('*');
				else
					System.out.print(' ');
			}
			System.out.println();
		}
	}
}
