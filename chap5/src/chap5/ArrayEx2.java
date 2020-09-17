package chap5;

public class ArrayEx2 {
	public static void main(String[] args) {
		// 배열의 생성과 초기화를 동시에
		int arr[] = {10, 20, 30, 40, 50};
		for(int a : arr) {
			System.out.println(a);
		}
		System.out.println();
		
		// 참조하고 있던 배열은 GC가 처리
		// 새로운 배열을 만들어 arr이 참조한다.
		arr = new int[] {100, 200, 300};
		for(int a : arr) {
			System.out.println(a);
		}
	}
}
