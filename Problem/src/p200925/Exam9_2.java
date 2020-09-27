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

public class Exam9_2 {
	
	final static int INT_SIZE = 32;
	final static int CHECK_COUNT = 5;
	final static int LF_COUNT = 5;
	final static int ALL_SET = -1;
	final static int ALL_RESET = 0;
	
	final static boolean SMALL = false;
	final static boolean BIG = true;
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numberToPrint = ALL_RESET, answer = ALL_SET;
		char input = 0;

		System.out.println("0부터 31까지의 숫자 중 한개를 생각하세요");
		
		for(int i = 0; i < CHECK_COUNT; i++) {
			numberToPrint = divideNumber(i, BIG);
			printNumber(numberToPrint, BIG);
			System.out.println();
			System.out.println("번호가 있으면 y 아니면 n 입력");
			input = scan.next().charAt(0);
			if(input == 'y') {
				answer &= divideNumber(i, BIG);
			} else {
				answer &= divideNumber(i, SMALL);
			}
		}
		
		for(int i = 0; i < INT_SIZE; i++) {
			if(isSet(answer, i)) {
				System.out.println("당신의 번호: " + i);
//				break;
			}
		}
	}
	
	public static void printNumber(int dividedNum, boolean isSmall) {
		int countOfPrint = 0;
		for(int j = 0; j < INT_SIZE; j++) {
			if(isSet(dividedNum, j)) {
				System.out.printf("%4d", j);
				countOfPrint++;
			}
			if(countOfPrint == LF_COUNT) {
				System.out.println();
				countOfPrint = 0;
			}
		}
	}
	
	public static boolean isSet(int num, int index) {
		int check = num & (1 << (index));
		return ((check == 0) ? false : true);
	}
	
	public static int divideNumber(int checkCount, boolean isBig) {
		return divideNumber(checkCount, isBig, 0, INT_SIZE);
	}
	
	public static int divideNumber(int checkCount, boolean isBig, int start, int end) {
		int result = 0;
		int mid = (start+end)/2;
		if(checkCount == 0) {
			if(isBig) {
				result |= ((1L<<end) - (1<<mid)); // 오버플로우 방지 long형으로 비트연산
				return result;
			} else {
				result |= ((1<<mid) - (1<<start)); // 오버플로우 방지 long형으로 비트연산
				return result;
			}
		} else {
			return divideNumber(--checkCount, isBig, start, (start+end)/2)
					+ divideNumber(checkCount, isBig, (start+end)/2, end);
		}
	}
}
