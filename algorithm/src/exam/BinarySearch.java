package exam;

public class BinarySearch {
	public static void main(String[] args) {
		// char list[] = { 'a', 'b', 'e', 'g' };
		// char list[] = { 'c', 'e', 'f', 'h', 'i', 'k' };
		int list[] = { 0, 1, 4, 6 };
		// int list[] = { 3, 5, 6, 8, 9, 11 };
		
		int size = list.length;
		
		System.out.print("list: ");
		for(int l : list) {
			System.out.print(l + " ");
		}
		System.out.println();
		for(int l : list) {
			binarySearch(list, size);
		}
	}
	
	public static void binarySearch(int[] list, int size) {
		int key = getKey(list, size);
		int idx = binarySearch(list, key, 0, size);

		System.out.printf("%d\t %s\t @list[%d]\n", key, ((list[idx] == key) ? "is" : "is not"), idx);
	}
	
	public static int binarySearch(int[] list, int key, int lo, int hi) {
		if(lo > hi) return lo;
		
		int mid = (lo + hi) / 2;
		
		if(list[mid] == key) {
			return mid;
		} else {
			if (list[mid] > key) {
				return binarySearch(list, key, lo, mid - 1);
			}
			if (list[mid] < key) {
				return binarySearch(list, key, mid + 1, hi);
			}
		}
		return 0;
	}
	
	public static int getKey(int[] list, int size) {
		return (int)(Math.random() * (list[size-1] - list[0] + 1)) + list[0];
	}
}
