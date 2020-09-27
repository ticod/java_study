/*
다음의 희소 행렬을 2차원 배열의 논리적 구조로 표현하시오.
	A=	7	4	4			B = 0	0	0	9 
		0	3	9				0	1	0	0				
		1	1	1				0	0	0	0				
		3	2	7				0	0	7	0			
		5	0	3 				0	0	0	0				
								3	0	0	0
								0	0	0	0
*/
package p200925;

public class Exam7 {
	static int[][] a = {{7,4,4},{0,3,9},{1,1,1},{3,2,7},
					{5,0,3}};
	public static void main(String[] args) {
		
		final int ROW = 0;
		final int COL = 1;
		final int VALUE = 2;
		
		final int ROW_SIZE = a[0][0];
		final int COL_SIZE = a[0][1];
		
		int[][] arr = new int[ROW_SIZE][COL_SIZE];
		
		for(int i = 1; i < a.length; i++) {
			arr[a[i][ROW]][a[i][COL]] = a[i][VALUE];
		}
		
		for(int i = 0; i < ROW_SIZE; i++) {
			for(int j = 0; j < COL_SIZE; j++) {
				System.out.printf("%4d", arr[i][j]);
			}
			System.out.println();
		}
	}
}
