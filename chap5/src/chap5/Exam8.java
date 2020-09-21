package chap5;

public class Exam8 {
	public static void main(String[] args) {
		int[][] arr = new int[10][];
		
		for(int i = 1; i <= 10; i++) {
			arr[i-1] = new int[i];
		}
		
		for(int[] a : arr) {
			for(int i : a) {
				System.out.printf("%3d", i);
			}
			System.out.println();
		}
	}
}
