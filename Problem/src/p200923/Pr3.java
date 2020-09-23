/*3.  17개의 요소를 가지고 있는 배열 arr을 정렬하여 다음 결과와 같이 출력하기.

단 Arrays.sort() 함수는 사용하지 않기

int arr[] = {50,7,5,8,1,33,16,2,28,25,29,17,44,15,13,9,31}; 

[결과]

50 44 33 31 29 

    28 25 17 

        16 

     15 13  9 

  8   7  5   2   1 */
package p200923;

public class Pr3 {
	public static void main(String[] args) {
		int arr[] = {50,7,5,8,1,33,16,2,28,25,29,17,44,15,13,9,31};
		sort(arr);
		print(arr, 5);
	}
	
	private static void sort(int[] arr) {
		sort(arr, 0, arr.length-1);
	}
	
	private static void sort(int[] arr, int left, int right) {
		int i, j, pivot;
		if(left < right) {
			i = left; j = right;
			pivot = arr[(left+right)/2];
			while(i < j) {
				while(j > 0 && arr[j] < pivot) j--;
				while(i < j && arr[i] > pivot) i++;
				swap(arr, i, j);
			}
			sort(arr, left, i - 1);
			sort(arr, i + 1, right);
		}
	}
	
	private static void swap(int[] arr, int i1, int i2) {
		int tmp = arr[i1];
		arr[i1] = arr[i2];
		arr[i2] = tmp;
	}
	
	private static void print(int[] arr, int N) {
		int index = 0;
		for(int i = 0; i < N/2; i++) {
			for(int j = 0; j < N - i; j++) {
				if(i > j) 	System.out.print("   ");
				else		System.out.printf("%3d", arr[index++]);
			}
			System.out.println();
		}
		for(int i = N/2; i < N; i++) {
			for(int j = 0; j <= i; j++) {
				if(i + j < N - 1) 	System.out.print("   ");
				else				System.out.printf("%3d", arr[index++]);
			}
			System.out.println();
		}
	}
}
