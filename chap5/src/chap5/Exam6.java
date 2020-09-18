/*
 * int arr[][] = {{1},{10,20,3,4,5,6},{30,40,50},{60,70,80,90}};
 * 
 * 2차원 배열의 행의 합과 열의 합 구하기
 * [결과]
 * 0행의 합: 1
 * 1행의 합: 48
 * 2행의 합: 120
 * 3행의 합: 300
 * 
 * 0열의 합: 101
 * 1열의 합: 130
 * 2열의 합: 133
 * 3열의 합: 94
 * 4열의 합: 5
 * 5열의 합: 6
 */
package chap5;

public class Exam6 {
	public static void main(String[] args) {
		int arr[][] = {{1},{10,20,3,4,5,6},{30,40,50},{60,70,80,90}};
		for(int i = 0; i < arr.length; i++) {
			int sum = 0;
			for(int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
			}
			System.out.println(i + "행의 합: " + sum);
		}
		System.out.println();
		
		int maxLength = 0;
		for(int i = 0; i < arr.length; i++) {
			if(maxLength < arr[i].length) maxLength = arr[i].length;
		}
		for(int i = 0; i < maxLength; i++) {
			int sum = 0;
			for(int j = 0; j < arr.length; j++) {
				if(arr[j].length - 1 < i) {
					continue;
				} else {
					sum += arr[j][i];
				}
			}
			System.out.println(i + "열의 합: " + sum);
		}
		System.out.println("=================");
		// 선생님 풀이
		int[] col = new int[maxLength];
		for(int i = 0; i < arr.length; i++) {
			int sum = 0;
			for(int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
				col[j] += arr[i][j];
			}
			System.out.println(i + "행의 합: " + sum);
		}
		System.out.println();
		for(int i = 0; i < maxLength; i++) {
			System.out.println(i + "열의 합: " + col[i]);
		}
	}
}
