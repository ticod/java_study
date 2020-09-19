/*
 * 1.  1부터 9까지의 숫자 중 중복되지 않는 숫자 3개를 선택하고(랜덤), 정렬하여 출력하기.
 */
package p200918;

public class Pr01 {
	public static void main(String[] args) {
		int[] num = new int[3];
		final int MAXIMUM = 9;
		
		// 중복 안되는 난수 세 개 뽑기
		// 방법 1
//		num[0] = (int)(Math.random() * MAXIMUM) + 1;
//		for(int i = 1; i < num.length; i++) {
//			int j = 0;
//			boolean chk = true;
//			while(chk) {
//				chk = false;
//				num[i] = (int)(Math.random() * MAXIMUM) + 1;
//				for(j = 0; j < i; j++) {
//					if(num[i] == num[j]) {
//						chk = true;
//					}
//				}
//			}
//		}
		
		// 방법 2
//		int[] randomArr = new int[MAXIMUM];
//		for(int i = 0; i < MAXIMUM; i++) {
//			randomArr[i] = i + 1;
//		}
//		for(int i = 0; i < 100; i++) {
//			int a = (int)(Math.random() * MAXIMUM);
//			int b = (int)(Math.random() * MAXIMUM);
//			int tmp = randomArr[a];
//			randomArr[a] = randomArr[b];
//			randomArr[b] = tmp;
//		}
//		for(int i = 0; i < num.length; i++) {
//			num[i] = randomArr[i];
//		}
		
		// 방법 3
		for(int index = 0; index < num.length; ) {
			num[index] = (int)(Math.random() * MAXIMUM) + 1;
			int j = 0;
			for(j = 0; j < index; j++) {
				if(num[index] == num[j]) break;
			}
			if(j < index) continue;
			index++;
		}
		
		// 정렬 전 출력
		System.out.print("정렬 전:\t");
		for(int i = 0; i < num.length; i++) {
			System.out.print(num[i] + "\t");
		}
		System.out.println();
		
		// 정렬 (버블 정렬)
		System.out.print("정렬 후:\t");
		for(int i = 0; i < num.length - 1; i++) {
			for(int j = 0; j < num.length - i - 1; j++) {
				if(num[j] > num[j+1]) {
					int tmp = num[j];
					num[j] = num[j+1];
					num[j+1] = tmp;
				}
			}
		}
		
		// 정렬 후 출력
		for(int i = 0; i < num.length; i++) {
			System.out.print(num[i] + "\t");
		}
	}
}
