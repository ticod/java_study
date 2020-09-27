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

public class Exam9 {
	
	final static int INT_SIZE = 32;
	final static int CHECK_COUNT = 5;
	final static int LF_COUNT = 5;
	
	final static boolean BIG = false;
	final static boolean SMALL = true;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		final int NUM_RANGE = 32;
		final int CHECK_COUNT = (int)(Math.log(NUM_RANGE)/Math.log(2));
		
		boolean[] printNum = new boolean[NUM_RANGE];
		boolean[] answer   = new boolean[NUM_RANGE];
		setAll(answer);
		char input = 0;
		
		System.out.println("0부터 31까지의 숫자 중 한개를 생각하세요");
		
		for(int i = 0; i < CHECK_COUNT; i++) {
			setNumber(printNum, i);
			printIndex(printNum);
			System.out.println("번호가 있으면 y 아니면 n 입력");
			input = scan.next().charAt(0);
			if(input == 'y') {
				resetNumber(answer, i, BIG);
			} else {
				resetNumber(answer, i, SMALL);
			}
		}
		
		for(int i = 0; i < NUM_RANGE; i++) {
			if(answer[i]) {
				System.out.println("당신의 번호: " + i);
				break;
			}
		}
	}
	
	public static void printIndex(boolean[] arr) {
		int printCount = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i]) {
				System.out.printf("%4d", i);
				printCount++;
			}
			if(printCount == LF_COUNT) {
				System.out.println();
				printCount = 0;
			}
		}
		System.out.println();
	}

	public static void setAll(boolean[] arr) {
		for(int i = 0; i < arr.length; i++) {
			arr[i] = true;
		}
	}
	
	public static void resetAll(boolean[] arr) {
		for(int i = 0; i < arr.length; i++) {
			arr[i] = false;
		}
	}
	
	public static void setNumber(boolean[] arr, int checkCnt) {
		int end = arr.length;
		resetAll(arr);
		setNumber(arr, checkCnt, 0, end);
	}
	
	public static void setNumber(boolean[] arr, int checkCnt, int start, int end) {
		int mid = (start+end)/2;
		if(checkCnt == 0) {
			for(int i = mid; i < end; i++) {
				arr[i] = true;
			}
		} else {
			setNumber(arr, --checkCnt, start, (start+end)/2);
			setNumber(arr, checkCnt, (start+end)/2, end);
		}
	}
	
	public static void resetNumber(boolean[] arr, int checkCnt, boolean isBig) {
		int end = arr.length;
		resetNumber(arr, checkCnt, 0, end, isBig);
	}
	
	public static void resetNumber(boolean[] arr, int checkCnt, int start, int end, boolean isBig) {
		int mid = (start+end)/2;
		if(checkCnt == 0) {
			if(isBig) {
				for(int i = mid; i < end; i++) {
					arr[i] = false;
				}
			} else {
				for(int i = start; i < mid; i++) {
					arr[i] = false;
				}
			}
		} else {
			resetNumber(arr, --checkCnt, start, (start+end)/2, isBig);
			resetNumber(arr, checkCnt, (start+end)/2, end, isBig);
		}
	}
}
