/*
 * 대형 숫자 출력하기
 * [결과]
     자리수를 입력하세요(1~10)
   5
   0 부터 9까지 5자리 숫자를 입력하세요
   12345
   
  * *** *** * * *** 
  *   *   * * * *   
  * *** *** *** *** 
  * *     *   *   * 
  * *** ***   * *** 

 */
package p200925;

import java.util.Scanner;

public class Exam8 {
	public static String[][][] number = { 
		{ // 0
			{ "*", "*", "*", " " },
			{ "*", " ", "*", " " },
			{ "*", " ", "*", " " },
			{ "*", " ", "*", " " },
			{ "*", "*", "*", " " },
		},
		{ // 1
			{ " ", " ", "*", " " },
			{ " ", " ", "*", " " },
			{ " ", " ", "*", " " },
			{ " ", " ", "*", " " },
			{ " ", " ", "*", " " }, 
		},
		{ // 2
			{ "*", "*", "*", " " },
			{ " ", " ", "*", " " },
			{ "*", "*", "*", " " },
			{ "*", " ", " ", " " },
			{ "*", "*", "*", " " }, 
		},
		{ // 3
			{ "*", "*", "*", " " },
			{ " ", " ", "*", " " },
			{ "*", "*", "*", " " },
			{ " ", " ", "*", " " },
			{ "*", "*", "*", " " }, 
		},
		{ // 4
			{ "*", " ", "*", " " },
			{ "*", " ", "*", " " },
			{ "*", "*", "*", " " },
			{ " ", " ", "*", " " },
			{ " ", " ", "*", " " }, 
		},
		{ // 5
			{ "*", "*", "*", " " },
			{ "*", " ", " ", " " },
			{ "*", "*", "*", " " },
			{ " ", " ", "*", " " },
			{ "*", "*", "*", " " }, 
		},
		{ // 6
			{ "*", "*", "*", " " },
			{ "*", " ", " ", " " },
			{ "*", "*", "*", " " },
			{ "*", " ", "*", " " },
			{ "*", "*", "*", " " }, 
		},
		{ // 7
			{ "*", "*", "*", " " },
			{ " ", " ", "*", " " },
			{ " ", " ", "*", " " },
			{ " ", " ", "*", " " },
			{ " ", " ", "*", " " }, 
		},
		{ // 8
			{ "*", "*", "*", " " },
			{ "*", " ", "*", " " },
			{ "*", "*", "*", " " },
			{ "*", " ", "*", " " },
			{ "*", "*", "*", " " }, 
		},
		{ // 9
			{ "*", "*", "*", " " },
			{ "*", " ", "*", " " },
			{ "*", "*", "*", " " },
			{ " ", " ", "*", " " },
			{ " ", " ", "*", " " }, 
		}
	};
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		final int COL = 4;
		final int ROW = 5;
		
		System.out.println("자리수를 입력하세요(1~10)");
		int cnt = scan.nextInt();
		System.out.println("0 부터 9까지 "+ cnt +"자리 숫자를 입력하세요");
		String num = scan.next();
//		int num = scan.nextInt();
		for(int i = 0; i < ROW; i++) {
			for(int j = 0; j < cnt; j++) {
				for(int k = 0; k < COL; k++) {
					System.out.printf(number[num.charAt(j)-'0'][i][k]);
				}
			}
			System.out.println();
		}
    }
}
