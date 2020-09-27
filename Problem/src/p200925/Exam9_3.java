/*
 * 0부터 31까지의 임의의 수를 생각하고, 컴퓨터가 수를 찾도록 하는
 * 프로그램 작성하기
 * 
 [결과]
0부터 31까지의 숫자 중 한개를 생각하세요
16 17 18 19 20 
21 22 23 24 25 
26 27 28 29 30 
31 
번호가 있으면 y 아니면 n 입력
y
8 9 10 11 12 
13 14 15 24 25 
26 27 28 29 30 
31 
번호가 있으면 y 아니면 n 입력
y
4 5 6 7 12 
13 14 15 20 21 
22 23 28 29 30 
31 
번호가 있으면 y 아니면 n 입력
n
2 3 6 7 10 
11 14 15 18 19 
22 23 26 27 30 
31 
번호가 있으면 y 아니면 n 입력
n
1 3 5 7 9 
11 13 15 17 19 
21 23 25 27 29 
31 
번호가 있으면 y 아니면 n 입력
y
당신의 번호:25
  
 */
package p200925;

import java.util.Scanner;

public class Exam9_3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		final int max = 32;
		final int count = (int)(Math.log(max)/Math.log(2));
		char select = 0;
		int answer = max-1;
		
		System.out.println("0부터 31까지의 숫자 중 한개를 생각하세요");
		
		for(int i = 2; i <= max; i*=2) {
			int countOfPrint = 0;
			for(int j = 1; j < i; j+=2) {
				for(int k = max/i*j; k < max/i*j + max/i; k++) {
					System.out.printf("%3d", k);
					countOfPrint++;
					if(countOfPrint == 5) {
						System.out.println();
						countOfPrint = 0;
					}
				}
			}
			System.out.println();
			System.out.println("번호가 있으면 y 아니면 n 입력");
			select = scan.next().charAt(0);
			if(select == 'n')
				answer -= (max/i);
		}
		
		System.out.println("당신의 번호: " + answer);
	}
}
