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
		int[][] result = new int[a.length*a[0].length][3];
		int index = 1;
		
		final int ROW = 0;
		final int COL = 1;
		final int VALUE = 2;

		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				if(a[i][j] != 0) {
					result[index][ROW] = i;
					result[index][COL] = j;
					result[index++][VALUE] = a[i][j];
				}
			}
		}
		
		// 가로길이, 세로길이, 데이터 수
		result[0][0] = a.length;
		result[0][1] = a[0].length;
		result[0][2] = index - 1;
		
		
		System.out.printf("%7s", "B   =");
		for(int i = 0; i < index; i++) {
			System.out.print("\t");
			for(int j = 0; j < result[0].length; j++) {
				System.out.printf("%3d", result[i][j]);
			}
			System.out.println();
		}
	}
}
