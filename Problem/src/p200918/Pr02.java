/*
 2.  int[][] score = {{90,80,70},{95,85,75},{70,80,75},{75,70,85},{70,75,80}}; 
 score 배열보다 가로 세로가 1씩 더큰 배열 result 배열 생성하기.
 score 배열의 내용을 result에 저장하고,
 각 추가된 행과 열에는 각 행과 열의 합을 저장하고, result 배열의 내용 출력하기
 
[결과]
90   80  70    240
95   85  75    255
70   80  75    225
75   70  85    230
70   75  80    225
400 390 385 1175
 */
package p200918;

public class Pr02 {
	public static void main(String[] args) {
		int[][] score = {{90,80,70},{95,85,75},{70,80,75},{75,70,85},{70,75,80}};
		int[][] result = new int[6][4];
		
		// 계산
		int sum = 0;
		for(int i = 0; i < score.length; i++) {
			for(int j = 0; j < score[i].length; j++) {
				result[i][j] = score[i][j];
				result[result.length - 1][j] += score[i][j];
				result[i][result[i].length - 1] += score[i][j];
			}
			sum += result[i][result[i].length - 1];
		}
		result[result.length - 1][result[0].length - 1] = sum;
		
		// 출력
		for(int i = 0; i < result.length; i++) {
			for(int j = 0; j < result[i].length; j++) {
				System.out.print(result[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
