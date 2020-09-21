package chap5;

import java.util.Scanner;

public class Exam9 {
	public static void main(String[] args) {
		System.out.println("삼각형의 높이를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int len = scan.nextInt();
		
		int data = len * len;
		int tmp = data;
		
		for(int i = 0; i < len; i++) {
			for(int j = 0; j < len + i; j++) {
				if(i + j < len - 1) {
					System.out.printf("    ");
				} else {
					System.out.printf("%4d", data--);
				}
			}
			System.out.println();
		}
		
		// 2차원 배열 이용
		data = tmp;
		String[][] result = new String[len][len*2-1];
		for(int i = 0; i < len; i++) {
			for(int j = 0; j < len; j++) {
				result[i][j] = "\t";
			}
			for(int j = len - i; j <= len + i; j++) {
				result[i][j - 1] = data-- + "\t";
			}
		}
		for(int i = 0; i < len; i++) {
			for(int j = len + 1; j < len * 2 - 1; j++) {
				result[i][j] = "\t";
			}
		}
		for(int i = 0; i < len; i++) {
			for(int j = 0; j < len * 2 - 1; j++) {
				System.out.print(result[i][j]);
			}
			System.out.println();
		}
	}
}
