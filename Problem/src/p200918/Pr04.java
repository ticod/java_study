/* 4. 2차원 배열을 이용하여 다음을 출력하기

[결과]
배열의 크기를 홀수로 입력하세요
5

17 16 15 14 13 
     12 11 10 
         9 
     8  7  6 
  5  4  3  2  1 */
// 2 8(2+6) 18(2+6+10)
// 2 8= 2+3+3  18= 2+3+3+5+5 32
//  6     10    14
//    4      4
// 3 5      7
package p200918;

import java.util.Scanner;

public class Pr04 {
	public static void main(String[] args) {
		System.out.println("배열의 크기를 홀수로 입력하세요");
		
		Scanner scan = new Scanner(System.in);
		int len = scan.nextInt();
		
		String[][] result = new String[len][len];
		for(int i = 0; i < len; i++) {
			for(int j = 0; j < len; j++) {
				result[i][j] = "\t";
			}
		}
		
		// 1. 최대 숫자 구하고 거꾸로 나열
//		int maxNum = 0;
//		if(len == 1) {
//			maxNum = 1;
//		} else {
//			int tmpNum = len - 2;
//			while(tmpNum >= 0) {
//				maxNum += 2*tmpNum;
//				tmpNum -= 2;
//			}
//			maxNum = (len*len) - maxNum;
//		}
//		
//		for (int i = 0; i <= len / 2; i++) {
//			for (int j = 0; j < len - i; j++) {
//				if (j < i)
//					System.out.print("\t");
//				else
//					System.out.print(maxNum-- + "\t");
//			}
//			System.out.println();
//		}
//		for (int i = len / 2 + 1; i < len; i++) {
//			for (int j = 0; j <= i; j++) {
//				if (j >= len - i - 1)
//					System.out.print(maxNum-- + "\t");
//				else
//					System.out.print("\t");
//			}
//			System.out.println();
//		}
		
		// 2차원 배열 사용하기 (뒤에서부터 나열)
		int num = 1;
		for(int i = len-1; i > len/2; i--) {
			for(int j = len - 1; j >= len - i - 1; j--) {
				if(j > i) {
					result[i][j] = "\t";
				} else {
					result[i][j] = (num++) + "\t";
				}
			}
		}
		for(int i = len/2; i >= 0; i--) { // 가운데부터
			for(int j = len - 1; j >= i; j--) {
				if(j >= len - i) {
					result[i][j] = "\t";
				} else {
					result[i][j] = (num++) + "\t";
				}
			}
		}
		
		for(int i = 0; i < len; i++) {
			for(int j = 0; j < len; j++) {
				System.out.print(result[i][j]);
			}
			System.out.println();
		}
	}
}
