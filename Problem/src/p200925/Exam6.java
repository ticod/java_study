/*
다음의 희소 행렬을 2차원 배열의 논리적 구조로 표현하시오.
 	A=	0	0	0	9			B = 7	4	4
 		0	1	0	0				0	3	9			
 		0	0	0	0				1	1	1				
		0	0	7	0				3	2	7			
 		0	0	0	0				5	0	3				
		3	0	0	0
 		0	0	0	0
 */
package p200925;

public class Exam6 {
		static int[][] a = {
				{0,0,0,9},
				{0,1,0,0},
				{0,0,0,0},
				{0,0,7,0},
				{0,0,0,0},
				{3,0,0,0},
				{0,0,0,0}
			};
	public static void main(String[] args) {
//		int cnt = 0;
//		int[][] num = new int[3][a.length*a[0].length];
//		for(int i = 0; i < a.length; i++) {
//			for(int j = 0; j < a[i].length; j++) {
//				if(!isZero(a[i][j])) {
//					num[0][cnt] = i;
//					num[1][cnt] = j;
//					num[2][cnt++] = a[i][j];
//				}
//			}
//		}
//		for(int i = 0; i < num.length; i++) {
//			for(int j = 0; j < num[i].length; j++) {
//				System.out.printf("%3d", num[i][j]);
//			}
//			System.out.println();
//		}
	}
	
	public static boolean isZero(int num) {
		if(num == 0) 	return true;
		else			return false;
	}
}
