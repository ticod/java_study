/*
 * Arrays 클래스 예제
 *     : 배열의 복사, 비교, 정렬 등 기능을 포함하고 있는 클래스
 */
package chap11;

import java.util.Arrays;

public class ArraysEx1 {
	public static void main(String[] args) {
		String[] arr1 = {"월매", "이몽룡", "향단", "방자"};
		print(arr1);
		
		// fill 메서드
		// array에 해당 value로 채운다
		Arrays.fill(arr1, "성춘향");
		print(arr1);
		
		// from index ~ to index - 1
		// 내부가 for(int i = from; i < to; i++) 로 되어있다.
		Arrays.fill(arr1, 1, 3, "춘향전");
		print(arr1);
		
		// int형 역시 가능
		int[] intArr = new int[10];
		Arrays.fill(intArr, 10);
		print(intArr);
		
		// sort 메서드 => timsort를 사용한다.
		String[] arr2 = {"월매", "이몽룡", "향단", "방자"};
		print(arr2);
		Arrays.sort(arr2);
		print(arr2);
	}
	
	private static void print(String[] str) {
		for(String s : str) System.out.print(s + ", ");
		System.out.println();
	}
	
	private static void print(int[] str) {
		for(int s : str) System.out.print(s + ", ");
		System.out.println();
	}
}
