package chap5;

public class ArrayEx1 {
	public static void main(String[] args) {
		// 1. 배열의 선언
		int[] arr1;
		
		// 2. 배열의 생성
		arr1 = new int[5];
		// 생성시 배열 내 값들은 0으로 초기화됨.
		
		// 1 + 2
//		int[] arr1 = new int[5];
		
		// 3. 배열 값 초기화
		arr1[0] = 100;
		arr1[1] = 200;
		for(int i = 0; i < arr1.length; i++) {
			System.out.println("arr1[" + i + "]=" + arr1[i]);
		}
		System.out.println();
		
		int[] arr2 = new int[10];
		for(int i = 0; i < arr2.length; i++) {
			System.out.println("arr2[" + i + "]=" + arr2[i]);
		}
		System.out.println();
		
		arr2 = arr1;
		// arr2가 참조하던 배열은 GC(가비지 컬렉터)의 대상이 되고, 사라짐
		// 그리고 arr2도 arr1이 참조하는 배열을 같이 참조하게 됨
		for(int i = 0; i < arr2.length; i++) {
			System.out.println("arr2[" + i + "]=" + arr2[i]);
		}
		System.out.println();
		
		arr2[4] = 350;
		System.out.println(arr1[4] + ", " + arr2[4]);
		System.out.println();
		
		int j = 0;
		// 개선된 for
		for(int i : arr2) {
			System.out.println(i);
			// i 변수에 arr2 배열의 요소들을 하나씩 접근한다.
			// 인덱스는 사용할 수 없다. (정확히 무슨 뜻인지는 모르겠다)
			// 몇 번째 배열인지 알 수 없다는 의미인듯 함
			System.out.println(arr2[j++]); // 잘 됨
		}
		
	}
}
