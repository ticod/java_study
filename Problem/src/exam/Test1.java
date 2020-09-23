package exam;

import java.util.Arrays;

public class Test1 {
	public static void main(String[] args) {
		final int N = 5;
		int[] ar1 = new int[N];
		int[] ar2 = new int[N];
		int[] ar3 = new int[N];
		int[] ar12 = new int[N*N];
		
		init(ar1);
		init(ar2);
		init(ar3);
		
		printArr("ar1", ar1);
		printArr("ar2", ar2);
		printArr("ar3", ar3);
		
		Arrays.sort(ar1);
		Arrays.sort(ar2); // n*logn
		Arrays.sort(ar3);
		
		System.out.println("정렬 후");
		
		printArr("ar1", ar1);
		printArr("ar2", ar2);
		printArr("ar3", ar3);
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				ar12[i*N + j] = ar1[i] + ar2[j];
			}
		}
		
		printArr("ar12", ar12);
		Arrays.sort(ar12);
		printArr("ar12", ar12);
		printArr("ar3", ar3);
		
		Boolean chk = solution(ar12, ar2, N);
	
		System.out.println(chk);
	}
	
	private static void init(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 21) - 10;
		}
	}
	
	private static void printArr(String arName, int[] arr) {
		System.out.print(arName + ": ");
		for(int a : arr) {
			System.out.printf("%4d", a);
		}
		System.out.println();
	}
	
	private static boolean solution(int[] arr1, int[] arr2, int N) {
		int i = 0; int j = N-1;
		while(i < N && j >= 0) { // N - 1?
			if(arr1[i] + arr2[j] == 0) {
				return true;
			} else if (arr1[i] + arr2[j] > 0) {
				j--;
			} else { // 3
				i++;
			}
		}
		return false;
	}
}
