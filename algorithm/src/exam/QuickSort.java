package exam;

class Arr {
	int[] arr;
	
	Arr(){}
	Arr(int n){
		this.arr = new int[n];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * n) + 1;
		}
	}
	
	void quickSort() {
		quickSort(0, arr.length - 1);
	}
	
	void quickSort(int left, int right) {
		int i, j, pivot;
		if(left < right) {
			i = left; j = right;
			pivot = arr[(left+right)/2];
			while(i < j) {
				while(arr[j] > pivot) j--;
				while(i < j && arr[i] < pivot) i++;
				swap(i, j);
			}
			quickSort(left, i - 1);
			quickSort(i + 1, right);
		}
	}
	
	void swap(int i1, int i2) {
		int tmp = this.arr[i1];
		this.arr[i1] = this.arr[i2];
		this.arr[i2] = tmp;
	}
	
	void print() {
		System.out.print("[");
		for(int a : arr) {
			System.out.printf("%4d", a);
		}
		System.out.println("]");
	}
}

public class QuickSort {
	public static void main(String[] args) {
		Arr ar = new Arr(20);
		ar.print();
		ar.quickSort();
		ar.print();
	}
}
