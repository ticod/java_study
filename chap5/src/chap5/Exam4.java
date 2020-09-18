/*
 * 배열에 1 ~ 10까지의 임의의 수를 10개 저장
 * 배열에 저장된 수만큼 * 출력
 * int[] arr = new int[10];
 * arr[0] = 난수;
 * ...
 * arr[9] = 난수;
 * 
 * arr = {2, 5, 1, ...}
 * 2: **
 * 5: *****
 * 1: *
 * ...
 */
package chap5;

public class Exam4 {
	public static void main(String[] args) {
		int[] arr = new int[10];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 10) + 1;
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t:");
			for(int j = 0; j < arr[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
